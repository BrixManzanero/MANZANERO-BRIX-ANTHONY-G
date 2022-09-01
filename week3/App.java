public class App {
    public static void main(String[] args) {

    
        Item gloves = new Item();
        gloves.price = 75;
        gloves.weight = 20;
        gloves.quantatity = 15;
        gloves.description =("This gloves it helps to add hero charachter ability");
        gloves.canbetraded = false;
        gloves.getDescription();

        Item Boots = new Item();
        Boots.price = 125;
        Boots.weight = 35;
        Boots.quantatity = 20;
        Boots.description = ("This boots has +80 movement speed");
        Boots.canbetraded = true;
        Boots.getDescription();

        Pet cat = new Pet(" Wildel", 5,8, true);

        Pet tiger = new Pet( "Kally", 7, 3, false);

        




        
        }
}
