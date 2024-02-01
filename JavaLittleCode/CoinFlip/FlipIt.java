//Jacob Battenfield
//Find me on LinkedIn :)
//2-1-2024
//www.linkedin.com/in/jacob-jbatt

package CoinFlip;
import java.util.*;
public class FlipIt {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Stake two arguments on a coin toss, may the luckiest one win!");
    System.out.println("What will you stake on heads?");
    String heads = scanner.nextLine();
    System.out.println("What will you stake on tails?");
    String tails = scanner.nextLine();
    System.out.println("Flipping!!");
    flip(heads,tails);
    scanner.close();

}
public static void flip(String heads, String tails){
Random random = new Random();  
boolean coin = random.nextBoolean();
String value;
  
if(coin==true){
value = "heads!!" ;
System.out.println(value+"The coin dictates that you should: "+heads);
}else{
value = "tails!! ";
System.out.println(value+"The coin dictates that you should: "+tails);    
}
  
}
  
}
