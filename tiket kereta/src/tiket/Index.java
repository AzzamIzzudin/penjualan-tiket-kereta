/*
 * Nama     : Assiva Nurul Huzna
 * NIM      : 11200930000029
 * Kelompok : 6
 * Kelas    : Sistem Informasi 2A
 */
package tiket;

/**
 * @author assiva
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koneksi.getKoneksi();
        new Login().setVisible(true); //tampilkan database berhasil terkoneksi
    }
    
   public static void oke(){
    new Home().setVisible(true);//tampilkan halaman home
    }
    
}
