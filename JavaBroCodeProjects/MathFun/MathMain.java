//Jacob Battenfield
//Find me on LinkedIn :)
//2-1-2024
//www.linkedin.com/in/jacob-jbatt

package MathFun;
import java.util.Scanner;

public class MathMain {
    //Today we are going to be doing some mathing.
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("All I need from you is the radius of a circle");
    System.out.println("And I will tell you the volume, area and circumfrence");
    double radius = scanner.nextDouble();
    circumfrence(radius);
    area(radius);
    volume(radius);
    scanner.close();

    
    }
//C = 2 Pi R
public static void circumfrence(double radius){
double pi=3.141;
double circumfrence= radius*pi*2;
System.out.println("\nYour circumfrence is: "+circumfrence);
}
//A = Pi R^2
public static void area(double radius){
double pi=3.141;
double radSquared = radius*radius;
double area = radSquared*pi;
System.out.println("\nYour area is: " +area);
}
//V = 4/3 pi r^3
public static void volume(double radius){
double fourThirds=1.333;
double pi = 3.141;
double radCubed = radius*radius*radius;
double volume = fourThirds*pi*radCubed;
System.out.println("\nYour volume is: "+volume+"\n");
}
}
