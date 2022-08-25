public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyName method
        mage.sayMyName();

        // Creates a new object named "mage" from Character class
        Character thief = new Character(5, 10, 0, "thief");
        // Calls the sayMyName method
        thief.sayMyName();
        
        Character priest = new Character(8, 12, 5, "priest");
        // Calls the sayMyName method
        priest.sayMyName();

        Character Archer = new Character(5, 9, 11, "Archer");
        // Calls the sayMyName method
        Archer.sayMyName();
        
    }
}
