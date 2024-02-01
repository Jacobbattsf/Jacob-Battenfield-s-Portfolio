//Jacob Battenfield
//Find me on LinkedIn :)
//1-31-2024
//www.linkedin.com/in/jacob-jbatt

//My thought with this program is to use constant for loop to increment a scoreboard value
package TypingClicker;
import java.util.Scanner;
public class typeClick {
    public static void main(String[] args) {
    System.out.println("Type Click To Play");
    int cookies = 0;
    Scanner gameMethod = new Scanner(System.in);
    
    for(int i=0;i<100;i++){
        String typeing = gameMethod.nextLine();
        if (typeing.equalsIgnoreCase("click")) {
            cookies++;
            System.out.println("Score: "+cookies);
        }else{
            System.out.println("Please return a proper value");
            continue;
        }
    }
        gameMethod.close();
    }
}
