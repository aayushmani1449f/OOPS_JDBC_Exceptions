@FunctionalInterface
public interface Hari {

    abstract void hello();
}


 class Main {
     static void main() {
         Hari r = ()-> System.out.println("Hello");
         r.hello();
     }
 }


