package jdbc_q4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_q4 {

	public static void main(String[] args) throws SQLException{
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Kb761501");
            //creating statement
            System.out.println("Connection successful");
           st = con.createStatement();

           
            
            String sql = "select sum(balance) from account ";
            rs = st.executeQuery(sql);
            
            int c = 0;
            while (rs.next()) {
            	int s = rs.getInt(1);
            	c = c + s;
                
            }
           System.out.println("total balance is "+ c );
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(con != null){
                con.close();
            }
            if(st != null){
                st.close();
            }
            if(rs != null){
                rs.close();
            }
        }
    }
}


