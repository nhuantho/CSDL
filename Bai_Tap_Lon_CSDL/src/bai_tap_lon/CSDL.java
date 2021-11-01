/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lon;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nhuan's computer
 */


public class CSDL {
    private String UserID;
    public CSDL(){
        
    }
    //gọi 1 cơ sở dữ liệu mysql
    public static Connection jdbcConnection(){
        String url="jdbc:mysql://localhost:3306/quanlisuckhoe";
        String user="root";
        String password = "Anhdungvk01";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException e){
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
                String useeid=re.getString("UserID");
                String hodem=re.getString("HoDem");
                String ten=re.getString("Ten");
                String date=re.getString("NgaySinh");
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
        } catch (Exception e) {
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
        } catch (Exception e) {
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
    //nhap thong tin hang ngay vao co so du lieu by tanhdz
    public static boolean insert_into_nhap_thong_tin_hang_ngay(String UserId,String day,String CanNang,String ChieuCao,String BMI,String TheTrang){
        try{
            if(ChieuCao.equalsIgnoreCase("")==true||CanNang.equalsIgnoreCase("")==true) return false;
            String insert="insert into nhapthongtinvaloikhuyen values(?,?,?,?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, UserId);
            ps.setString(2, day);
            Double chieucao=Double.valueOf(ChieuCao);//format sang by tanhdz
            Double cannang=Double.valueOf(CanNang);
            Double bmi=Double.valueOf(BMI);
            ps.setDouble(3, cannang);
            ps.setDouble(4, chieucao);
            ps.setDouble(5, bmi);
            ps.setString(6, TheTrang);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
            //cap nhat xong by tanhdz
        } catch(SQLException e){
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    public void setUserID(String UserID){
        this.UserID=DangNhap.taikhoan.getText();
    }
    public String getUserID(){
        return this.UserID;
    }
}
