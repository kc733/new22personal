import java.util.Random;

public class chemistryRandom {

    public static void main(String[] args) {
        
        String currentChem;
        String[] homeChem = {"Soda", "Can", "Wtf is happening"};

        Random randomChem = new Random();

        currentChem = homeChem [randomChem.nextInt(homeChem.length)];

        System.out.println(currentChem);


}
}