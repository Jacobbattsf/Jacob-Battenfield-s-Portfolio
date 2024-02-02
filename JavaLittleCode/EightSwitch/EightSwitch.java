//Jacob Battenfield
//Find me on LinkedIn :)
//2-1-2024
//www.linkedin.com/in/jacob-jbatt
//this is my comment
package EightSwitch;
import java.util.*;
public class EightSwitch {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.println("what is your greatest wish");

    String wish = scanner.nextLine();
    int randomInt = random.nextInt(8)+1;
    scanner.close();
    System.out.println("So your wish is "+wish);

    switch(randomInt){
        case 1:System.out.println("It will never happen");      
        break;
        case 2:System.out.println("Not very likely to happen");      
        break;
        case 3:System.out.println("No chance");     
        break;
        case 4:System.out.println("It Could happen");      
        break;
        case 5:System.out.println("It is probable");       
        break;
        case 6:System.out.println("It is certain");      
        break;
        case 7:System.out.println("It is written in the stars");
        break;
        case 8:System.out.println("It will 1000% work, trust me bro");       
        break;
    }
    }
}
