// This is a program to show random names from home chemistry, that we need to study in school
// I use it to memorise their formulas

import java.util.Random;
import javax.swing.JOptionPane;

public class chemistryRandom {

    public static void main(String[] args) {
        
        // Make a sting for random result
        String currentChem;

        // Make an array with names to show
        String[] homeChem = {"Soda", "Perekis vodoroda", "Uksus", "Margantsovka", "Sahar", "Sol' kuhonnaya",
        "Krahmal", "Spirt", "Nashatirniy Spirt", "Glicerin", "Aceton", "Uglekisliy gaz", "Chabniy gaz",
        "Metanol", "Polietilen", "Metan"}; // I couldn't use russian letters, the build fails

        // Make random object/variable
        Random randomChem = new Random();

        // Make your end result a random name from your array
        currentChem = homeChem [randomChem.nextInt(homeChem.length)];

        // Show random result in a message dialog with JOptionPane
        JOptionPane.showMessageDialog(null, currentChem);
        
        System.out.println(currentChem);

        // It works!! :)

    }
}