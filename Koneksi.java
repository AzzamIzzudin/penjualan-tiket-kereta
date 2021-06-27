/*
 * Nama     : Assiva Nurul Huzna
 * NIM      : 11200930000029
 * Kelompok : 6
 * Kelas    : Sistem Informasi 2A
 */
package tiket;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author assiva
 */
public class Koneksi {
    
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi == null){
            try{
                Driver driver = new Driver();
                DriverManager.registerDriver(driver);
                
                String url = "jdbc:mysql://localhost/kereta_api_idn"; //digunakan untuk menghubungkan aplikasi dengan database
                String user = "root";
                String pass = "";
                
                koneksi = (Connection) DriverManager.getConnection(url,user,pass);
                //JOptionPane.showMessageDialog(null,"Koneksi Berhasil");
                System.out.println("Koneksi Berhasil"); //keterangan jika aplikasi tersambung dengan database
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Koneksi Gagal"); //keterangan jika aplikasi tidak tersambung dengan database
                System.out.println("Koneksi Gagal");
            }
        }
        return koneksi;
    }
    
}
