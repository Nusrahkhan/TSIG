import java.util.Scanner;
public class EvenSorting{
    public static void main(String args[]) {
        System.out.print("Enter array limit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Sum of even numbers in the array: " + EvenSum.sum(a));
    }
}

class EvenSum{
    public static int sum (int a[]){
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]%2 == 0){
                temp += a[i];
            }
        }
        return temp;
    }
}
