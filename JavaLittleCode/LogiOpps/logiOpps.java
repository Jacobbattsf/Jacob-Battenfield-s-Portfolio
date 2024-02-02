package LogiOpps;

import java.util.Scanner;

public class logiOpps {
    public static void main(String[] args) {
        //food saftey calculator
    Scanner scanner = new Scanner(System.in);
    System.out.println("What temperature is the food being held at? ");
    int temp = scanner.nextInt();
    System.out.println("The hold temperatre is "+temp+"F");
    if(temp < 41){
    System.out.println("the food is safe and cold");
    }else if(temp>41&&temp<135){
    System.out.println("MOVE THE FOOD OUT OF AREA, CONDITIONS ARE NOT IDEAL");
    }else{
    System.out.println("the food is safe and hot");

    }
    scanner.close();
    }
}
