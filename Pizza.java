// import the Scanner class
import java.util.Scanner;

import javafx.scene.media.Media;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");
      

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);
        

    

        String pizza = "";
        double price = 0;
        String crust;
        String size;
        int quantity; 





        switch (choice) {
            case 'A':
                pizza = "Creamy Spinach Pizza";
                price = 400.00;
                break;
              
              
            case 'B':
            pizza = "Four Cheese Pizza";
            price = 300.00; 
            break; 
           
        }

            
            
           
        

                

            
              
        System.out.println("Press F1 if your order thin crust");
        System.out.println("Press F2 what pizza size");
         
                
            switch (choice) {
              case 'A':
                crust = "Hand Tossed";
             break;
           
         

                  
        switch (choice) {

        
            case 'A':
            crust = "Thin Crust";
            break;
            
    
           

            case 'B':
            crust = "Hand Tossed";
            break;
            default:
            System.out.println("please make sure of your order");

        
            System.out.println("Press F3 if your choose are Family");
            System.out.println("Press F4 if your your choose Meduim");

        switch (choice) {
            case 'A':
            size = "Family 12";
            break; 
        
        switch (choice) {
            case 'B':
            size = "Medium";
            break; 
            default:
            System.out.println("please pick up your order at the time");
            return;

         

          System.out.print("Enter the quantity");
          quantity = scan.nextInt();
          System.out.println("Your order is:  " + pizza +"" + crust +"" + size + quantity +"" );
