//for sending secret text meshes
//Jacob Battenfield
//Find me on LinkedIn :)
//2-2-2024
//www.linkedin.com/in/jacob-jbatt

package ForNest;

import java.util.Scanner;

public class forNest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You will give me four words");
        System.out.println("word one");
    String w1=scanner.nextLine();
    System.out.println("word two");
    String w2=scanner.nextLine();
    System.out.println("word three");
    String w3=scanner.nextLine();
    System.out.println("word four");
    String w4=scanner.nextLine();
    System.out.println("So your words are "+w1+", "+w2+", "+w3+" and "+w4+".");
    scanner.close();
    //number of rows
    for(int i = 0;i<w1.length();i++){
        System.out.println(w1.charAt(i));
        //determines how many columns there are, can be read between a repeating sequence of l and k variables
        for(int j = 0;j<w2.length();j++){
            System.out.print(w2.charAt(j));
            //word that will be spaced out between each l variable 
            for(int k = 0;k<w3.length();k++){
                System.out.print(w3.charAt(k));
                //word that will be repeated for each space between leters
                for(int l = 0;l<w4.length();l++){
                    System.out.print(w4.charAt(l));
                }
            }
        }
    }
    }
}
