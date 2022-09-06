import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://20.107.243.74:3306/sys", "root", "mypassword");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from `sys`.`Personer`");

            while (resultSet.next()) {
                String id = resultSet.getString("idPersoner");
                String name = resultSet.getString("name");
                System.out.println(id + " : " +name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
