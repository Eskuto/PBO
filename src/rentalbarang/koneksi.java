/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalbarang;
import java.sql.DriverManager;


/**
 *
 * @author Pangestu Siagian
 */
public class koneksi {
    
    
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getkoneksi(){
       if (koneksi  == null){
           try{
               String url = "jdbc:mysql://localhost:3306/rental_barang";
               String user = "root";
               String password = "";
               koneksi = DriverManager.getConnection(url, user, password);
               System.out.println("Connection Succesfull");         
           }
           catch (Exception e){
               System.out.println("db Error");
           }
       }
       return koneksi;
    }
    
    public static void main(String args[]) {
        getkoneksi();
    }
}
