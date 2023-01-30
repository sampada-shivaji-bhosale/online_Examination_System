package online_examination;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student_detail{
    public boolean login(Student s){
        boolean flag=false;
        try{
            Connection con=DBConnection.create();
            Statement stat=con.createStatement();
            String sql="SELECT * FROM student_login WHERE SetNumber=?";
            PreparedStatement prepare =con.prepareStatement(sql);
            prepare.setString(1,s.getsetno());
            ResultSet result=prepare.executeQuery();
            if(result.next()){
                flag=true;
                }

            stat.close();
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    public boolean account(Student s){
        boolean flag=false;
        try{
            Connection con=DBConnection.create();
            Statement stat=con.createStatement();
            String sql="INSERT INTO student_login(email,password,SetNumber) values(?,?,?)";
            PreparedStatement prepare =con.prepareStatement(sql);
            prepare.setString(1,s.getEmail());
            prepare.setString(2,s.getPassword());
            prepare.setString(3,s.getsetno());
            prepare.executeUpdate();
            flag=true;
            stat.close();
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

}
