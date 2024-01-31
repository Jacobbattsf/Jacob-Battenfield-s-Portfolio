package SwapTwoVar;

import java.util.Scanner;

class Main {

    public static void main(String[]args){
System.out.println("You are handed a black cup\n You suspect ill intent\n");
//setting the table
String blackCup = "Poison";
String whiteCup = "Water";
String emptyVessle = null;   
    
//investigating the table
 System.out.println("In the black cup there is: "+blackCup);
 System.out.println("In the white cup there is: "+whiteCup+"\n");
//search for user input please
 Scanner scanner = new Scanner(System.in);
//gamified dialogue
 System.out.println("Do you wish to purify the cup in front of you?");
 String Answer = scanner.nextLine();
 if (Answer.equalsIgnoreCase("Yes")){
    Purify(blackCup, whiteCup, emptyVessle);
 }
 scanner.close();
    }
    public static void Purify(String blackCup, String whiteCup, String emptyVessle){
    //pour the poison in the empty vessle
    emptyVessle = blackCup;
    //pour the water in the poison cup
    blackCup = whiteCup;
    //pour the poison in the water cup
    whiteCup = emptyVessle;
    //result
    System.out.println("\nIn the black cup there is: "+blackCup);
    System.out.println("In the white cup there is: "+whiteCup+"\n");
    //victory
    System.out.println("-----You Live To See Another Day!!-----");

    }
}
