/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lon;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nhuan's computer
 */


public class CSDL {
    //gọi 1 cơ sở dữ liệu mysql
    public static Connection jdbcConnection(){
        String url="jdbc:mysql://localhost:3306/quanlisuckhoe";
        String user="root";
        String password = "5122001t";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return null;
    }
    //in dữ liệu lấy từ mysql
    public static void statement(){
        try{
            Statement sta=jdbcConnection().createStatement();
            String select="SELECT * FROM user";
            ResultSet re=sta.executeQuery(select);
            while (re.next()) {                
                int useeid=re.getInt("UserID");
                String hodem=re.getString("HoDem");
                String ten=re.getString("Ten");
                Date date=re.getDate("NgaySinh");
                String diachi=re.getString("DiaChi");
                String sdt=re.getString("SDT");
                System.out.println(useeid+" "+hodem+" "+ten+" "+date+" "+diachi+" "+sdt);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }
    //kiểm tra tài khoản
    public static boolean statement_kiemtrataikhoan(String taikhoan){
        try {
            Statement sta=jdbcConnection().createStatement();
            String where="SELECT UserID FROM taikhoan";
            ResultSet re=sta.executeQuery(where);
            while (re.next()) {                
                String tk=re.getString("UserID");
                if(tk.equalsIgnoreCase(taikhoan)==true) return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }
    //kiểm tra mật khẩu
    public static boolean statement_kiemtramatkhau(String matkhau){
        try {
            Statement sta=jdbcConnection().createStatement();
            String where="SELECT MatKhau FROM taikhoan";
            ResultSet re=sta.executeQuery(where);
            while (re.next()) {                
                String mk=re.getString("MatKhau");
                if(mk.equalsIgnoreCase(matkhau)==true) return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }
    //đưa dữ liệu về bảng user của cơ sở dữ liệu mysql
    public static boolean insert_into_user(String id, String hodem, String ten, String ngaysinh, String diachi, String sdt){
        try {
            if(id.equalsIgnoreCase("")==true|| hodem.equalsIgnoreCase("")==true|| ten.equalsIgnoreCase("")==true|| ngaysinh.equalsIgnoreCase("")==true|| diachi.equalsIgnoreCase("")==true|| sdt.equalsIgnoreCase("")==true) 
                return false;
            String insert="insert into user values(?,?,?,?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, id);
            ps.setString(2, hodem);
            ps.setString(3, ten);
            ps.setString(4, ngaysinh);
            ps.setString(5, diachi);
            ps.setString(6, sdt);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //đưa dữ liệu về bảng admin của cơ sở dữ liệu mysql
    public static boolean insert_into_admin(String id, String hoten, String SDT, String email){
        try {
            if(id.equalsIgnoreCase("")==true|| hoten.equalsIgnoreCase("")==true|| SDT.equalsIgnoreCase("")==true|| email.equalsIgnoreCase("")==true) 
                return false;
            String insert="insert into admin values(?,?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, id);
            ps.setString(2, hoten);
            ps.setString(3, SDT);
            ps.setString(4, email);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //đưa dữ liệu về bảng tài khoản của mysql
     public static boolean insert_into_taikhoan(String id, String matkhau){
        try {
            if(id.equalsIgnoreCase("")==true|| matkhau.equalsIgnoreCase("")==true) 
                return false;
            String insert="insert into taikhoan values(?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, id);
            ps.setString(2, matkhau);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     
     
////     Hiển thị thông tin người dùng
//     public static void statement_hienthithongtin() {
//         try{
//            Statement sta=jdbcConnection().createStatement();
//            String select="SELECT * FROM user WHERE UserID = '?'";
//            PreparedStatement ps=jdbcConnection().prepareStatement(select);
//            ps.setString(1, id);
//            ResultSet re=sta.executeQuery(select);
//            while (re.next()) {                
//                int userid=re.getInt("UserID");
//                String hodem=re.getString("HoDem");
//                String ten=re.getString("Ten");
//                Date date=re.getDate("NgaySinh");
//                String diachi=re.getString("DiaChi");
//                String sdt=re.getString("SDT");
//            }
//        }catch(SQLException e){
//            System.out.println(e);
//        }
//     }

    static boolean insert_into_nhap_thong_tin_hang_ngay(String s, String time, String text, String text0, String bmi, String TheTrang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
     // Ghi ra file ID
     public void writeIDToFile() throws FileNotFoundException, IOException {
        String s="";
        FileReader fr;
        fr = new FileReader("src\\bai_tap_lon\\ID.dat");
        int i;
        while((i=fr.read())!=-1){
            s+= (char)i;
        }
     }
     
     public String ReadIDFeomFile() throws FileNotFoundException, IOException {
         String s="";
        FileReader fr;
        fr = new FileReader("src\\bai_tap_lon\\ID.dat");
        int i;
        while((i=fr.read())!=-1){
            s+= (char)i;
        }
        return s;
     }
}
