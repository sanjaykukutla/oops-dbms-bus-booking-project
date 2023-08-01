import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import BusBooking.person;

public class queries {
    public static void addPerson(person p){
        Connection con = connectionmaker.getConnection();
        final String SQL = "insert into per values(?,?,?,?)";
        try(PreparedStatement stmt = con.prepareStatement(SQL)){
            stmt.setString(1, p.getName());
            stmt.setDouble(2, p.getAge());
            stmt.setString(3, p.getGender());
            stmt.setInt(4, p.getMobileNo());
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected+" rows created.");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void deletePerson(person p){
        Connection con = connectionmaker.getConnection();
        final String SQL = "delete from per where mobileNo = ?";
        try(PreparedStatement stmt = con.prepareStatement(SQL)){
            stmt.setInt(1, p.getMobileNo());
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected+" rows created.");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void updatePerson(person p,String attribute){
        Connection con = connectionmaker.getConnection();
        final String SQL = "update per set ? = ? where ? = ?";
        try(PreparedStatement stmt = con.prepareStatement(SQL)){
            stmt.setString(1, p.getName());
            stmt.setDouble(2, p.getAge());
            stmt.setString(3, p.getGender());
            stmt.setInt(4, p.getMobileNo());
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected+" rows created.");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

