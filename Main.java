/**
 * Class main berperan sebagai class utama untuk menjalankan aplikasi
 */
public class Main
{

    public static void main(String[] args) {
        
        // membuat object ayam dari class Ayam
        Ayam ayam = new Ayam();

        // mengisi nilai attribut
        ayam.setJenis("Kampung"); // mengisi nilai attribut pada class Ayam
        ayam.setParuh("Pipih"); // mengisi nilai attribut pada class Unggas
        ayam.setName("Jago"); // mengisi nilai attribut pada class Hewan

        // mengeluarkan output dari setiap attribut
        System.out.println("Nama Hewan : " + ayam.getName());
        System.out.println("Paruh Unggas : " + ayam.getParuh());
        System.out.println("Jenis Ayam : " + ayam.getJenis());

    }

}