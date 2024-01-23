public class Main {
    public static void main(String[] args) { 
        myNum(9);
}
public static void myNum(int num){
        if(num % 3 ==0 && num % 5==0){
            System.out.println("FizzBuzz");
        }else if(num % 3 ==0){
            System.out.println("Fizz");
        }else if(num % 5 ==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("Number Is Not Divisible By 3 or 5");
        }
    }
}
