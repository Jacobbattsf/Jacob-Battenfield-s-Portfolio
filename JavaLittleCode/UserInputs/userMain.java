//Jacob Battenfield
//Find me on LinkedIn :)
//1-31-2024

package UserInputs;
import java.util.Scanner;

public class userMain {
    public static void main(String[]args){
    //Feartalk?!

    //Establishing a being to listen to your complaining...
    Scanner fearFinder = new Scanner(System.in);
    System.out.println("What is your worst fear: ");
    String userFear = fearFinder.nextLine();
    System.out.println("How old were you when developed the fear of "+userFear);
    int fearAge = fearFinder.nextInt();
    fearFinder.nextLine();
    System.out.println("My greatest fear is "+fearAge+" year olds... they think they are better than everyone else.");
    fearFinder.close();

    }
}
