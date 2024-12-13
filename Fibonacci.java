import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();
        int first = 0, second = 1;
        int next;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next; 
        }
    }
}
