/**
 * Class Ayam berperan sebagai subClass dari Unggas
 * yang berarti subSubClass dari Hewan
 */
public class Ayam extends Unggas
{

    /**
     * Attribut jenis dengan tipe data String
     */
    private String jenis;

    /**
     * Method untuk mengisi nilai attrbiut jenis
     * @param jenis
     */
    public void setJenis(String jenis)
    {
        this.jenis = jenis;
    }

    /**
     * Method untuk mendapatkan nilai dari attrbitu jenis
     * @return
     */
    public String getJenis()
    {
        return this.jenis;
    }

}