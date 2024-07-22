
package bank.management.system.Login;
//There are 5 steps of jdbc
//-->1.Register the driver
//-->2.Create Connection
//-->3.Create Statement
//-->4.Execute Query
//-->5.Close Connection
import java.sql.*;

public class Conn {
    Connection c;
    Statement s ;
    
    public Conn(){
        //exceptional handling we are using due to
        //-->mysql is the external entity so there can b run time error in case
        try{
           c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Anu30@1190");

            s = c.createStatement();
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
