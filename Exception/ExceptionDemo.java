import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Creating a Custom Exception (User-defined Exception)
// It can extend Exception (Checked) or RuntimeException (Unchecked)
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message); // Passes the message to the parent Exception class
    }
}

public class ExceptionDemo {

    // throws keyword: Declares that this method might throw a checked exception
    // It delegates the responsibility of handling the exception to the caller.
    public static void readFromFile(String path) throws IOException {
        // Checked Exception Example: 
        // FileReader throws FileNotFoundException (a subclass of IOException), which is checked at compile-time.
        File file = new File(path);
        FileReader fr = new FileReader(file);
        fr.read();
        fr.close();
    }

    // throw keyword: Used to explicitly throw an exception from within a method
    public static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            // Throwing our custom exception explicitly
            throw new MyCustomException("Age must be 18 or older to register.");
        } else {
            System.out.println("Age validated successfully.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- 1. Unchecked Exceptions (Runtime Exceptions) ---");
        // Unchecked Exceptions: Exceptions that occur at runtime and are not checked by the compiler.
        // E.g., ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException
        try {
            int result = 10 / 0; 
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception (Arithmetic): " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Caught Unchecked Exception (NullPointer): " + e.getMessage());
        }
        
        System.out.println("\n--- 2. Checked Exceptions ---");
        // Checked Exceptions: Must be handled with a try-catch block or declared using 'throws'.
        // If not handled, the code will not even compile.
        try {
            readFromFile("non_existent_file.txt");
        } catch (IOException e) {
            System.out.println("Caught Checked Exception (IOException): " + e.toString());
        }

        System.out.println("\n--- 3. Custom Exceptions & throw/throws ---");
        // Demonstrating our custom exception and the validateAge method that 'throws' it
        try {
            validateAge(15); 
        } catch (MyCustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        System.out.println("\n--- 4. Try-Catch with Finally Block ---");
        // Finally Block: Always executes whether an exception was thrown/caught or not.
        try {
            int[] arr = new int[5];
            arr[10] = 50; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception before Finally: " + e.getMessage());
        } finally {
            System.out.println("FINALLY BLOCK: This always executes, useful for cleanup (closing files, DB connections).");
        }
    }
}
