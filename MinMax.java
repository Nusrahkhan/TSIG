import java.util.Scanner;
public class MinMax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int min = a[1], max = a[1];
        for (int i = 0; i < n; i++){
            if (a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Minimum element is:" + min);
        System.out.println("Maximum element is:" + max);
    }
}
