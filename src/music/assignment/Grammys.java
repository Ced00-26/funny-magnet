package music.assignment;

// Concrete class Grammys extends Names and implements Music
public class Grammys extends Names implements Music {

    // Implementing the abstract method from Names
    @Override
    void move() {
        System.out.println("This is a Grammys music performance.");
    }

    // Implementing the method from the Music interface
    @Override
    public void sound() {
        System.out.println("This Grammys is rigged.");
    }

    public static void main(String[] args) {
        // Creating an object of Grammys
        Grammys grammys = new Grammys();
        grammys.move();  // This calls the move() method from Names
        grammys.sound(); // This calls the sound() method from Music interface
    }
}
