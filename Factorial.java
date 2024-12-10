import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Factorial of a number is:");
        int a = s.nextInt();
        int fact=1;
        while(a>0){
            fact *= a;
            a--;
        }
        System.out.println("Factorial of a number is:" + fact);
    }
}
