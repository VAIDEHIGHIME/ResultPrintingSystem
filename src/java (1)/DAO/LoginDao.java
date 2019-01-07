package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDao
{
   
    
    public boolean check(String email,String pass) throws SQLException
    {
        try
        {
            DBAO conObj=new DBAO();
            String query="select * from logindetails where email=? and pass=?";
            Connection con=conObj.connectToDataBase();
            if(con!=null)
            {
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1, email);
                ps.setString(2, pass);
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                    return(true);
                }
                else
                {
                    return(false);
                }
            }
            else
            {
                return(false);
            }
        }
        catch(SQLException e)
        {
           return (false);
        } 
    }
}
