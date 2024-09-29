import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Number?: ");
        Scanner eo = new Scanner(System.in);
        int number = eo.nextInt();
        if(number % 2 == 1){
            System.out.println(number + " is odd");
        }
        else{
            System.out.print(number + " is even");
        }
    }
}
