//Jacob Battenfield
//Find me on LinkedIn :)
//2-1-2024
//www.linkedin.com/in/jacob-jbatt
//testing a comment!
package DrVisit;
//A hospital needs a program to report pain levels, this system will tell the nurses what to do when a patient is in a certain amount of pain!
import java.util.Scanner;
//some testing of the bounds of if statements.
public class Drvisit{
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("what is your level of pain from 1-10");
    int painlv = scanner.nextInt();
    scanner.close();
    
    if(painlv>=10){
        System.out.println("Bring in the surgeon, the patient needs help URGENTLY");
    }else if(painlv>=1 && painlv<=4){
        System.out.println("This patient is experiencing light discomfort, sent them home with medicine");
    }else if(painlv>=5 && painlv<=9){
    System.out.println("This patient is having major discomfort, sedate them and check in every half hour");
    }else if(painlv<=0){
        System.out.println("This patient is experiencing bliss, they may go home");
    }else{
        System.out.println("Please enter any valid int");
    }
    }
}
