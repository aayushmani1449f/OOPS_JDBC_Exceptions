import java.sql.*;

public class Jdbc {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "Aayush@01";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

//            String query = "INSERT INTO employee VALUES(3,'Jaysi',50000)";
//            System.out.println("Data entered successfully");
//
//            int rows = stmt.executeUpdate(query);

            String query1 = "SELECT * FROM employee";

            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int salary = rs.getInt("salary");
                System.out.println(id + " " + name + " " + salary);
            }
            con.close();

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}