/**
 * Class Unggas berperan sebagai subClass dari Hewan
 */
public class Unggas extends Hewan
{
    
    /**
     * Attribut dengan tipe data String
     */
    private String paruh;

    /**
     * Method untuk mengisi nilai dari attrbiut paruh
     * @param paruh
     */
    public void setParuh(String paruh)
    {
        this.paruh = paruh;
    }
    
    /**
     * Method untuk mengdapatkan nilai dari attrbitu paruh
     * @return
     */
    public String getParuh()
    {
        return this.paruh;
    }

}