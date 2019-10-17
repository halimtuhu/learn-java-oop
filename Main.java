public class Main
{

    public static void main(String[] args) {
        
        Ayam ayam = new Ayam();
        ayam.setJenis("Kampung");
        ayam.setParuh("Pipih");
        ayam.setName("Jago");

        System.out.print(ayam.getName() + ' ');
        System.out.print(ayam.getParuh() + ' ');
        System.out.print(ayam.getJenis() + ' ');

    }

}