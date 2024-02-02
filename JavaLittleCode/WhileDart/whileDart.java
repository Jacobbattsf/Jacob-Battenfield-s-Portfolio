//Jacob Battenfield
//Find me on LinkedIn :)
//1-31-2024
//www.linkedin.com/in/jacob-jbatt

package WhileDart;
import java.util.*;
public class whileDart {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("How many darts would you like to throw.");
int darts = scanner.nextInt();
int acurrateShots = 0;
while(darts >= 1){
    acurrateShots = throwDart(darts,acurrateShots);
    darts--;
}
System.out.println("you made "+acurrateShots+" bullseyes");

scanner.close();
} 
public static int throwDart(int darts,int acurrateShots){
Random random = new Random();   
double x = random.nextInt(5)+1;
double y = random.nextInt(5)+1;
System.out.println("You throw the dart at X:"+x+"Y:"+y);
if (y<4 && y>2 && x<4 && x>2) {
    System.out.println("BULLSEYE!!!");
    acurrateShots++;
}
return acurrateShots;
} 
}



