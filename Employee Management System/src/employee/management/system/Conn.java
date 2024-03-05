package employee.management.system;
import java.sql.*;
public class Conn {
     Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
            s = c.createStatement();
        } catch (Exception e)  {        
            e.printStackTrace();
        }
    }
}
