/**
 * Hewan di sini berperan sebagai Super Class
 */
public class Hewan {

    /**
     * Attribut dari Hewan yang bertipe String
     */
    private String name;

    /**
     * Method untuk mengisi nilai dari attribut name
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Method untuk mendapatkan nilai dari attribut name
     * @return
     */
    public String getName()
    {
        return this.name;
    }

}