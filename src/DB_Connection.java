//Database Connection Code...
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB_Connection {
     
    public static Connection connection() //This is a Method, inside the DB_Connection Class.. The type of this Method is "Connection"...
        {   
           try{      
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student/userDB","root","");
                return conn;
               }
           
            catch(ClassNotFoundException | SQLException e){    
                System.out.println(e);
                return null;
                }
        }        
}
//This is all the Database Connection Code.....