package music.assignment;
// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create an object of Concrete class Grammys
        Grammys myGrammys = new Grammys();

        // Call methods
        myGrammys.move();  // This method is from Names (abstract class)
        myGrammys.sound(); // This method is from Music (interface)
        myGrammys.names(); // This method is from Names (abstract class)
    }
}

