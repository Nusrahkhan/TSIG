import java.util.Scanner;
public class KRotate {
    public static void main(String args[]){
        System.out.print("Enter array limit: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Enter k: ");
            int k = sc.nextInt();
            if(k < n)
                Rotate.kRotation(a, k);
        }
    }
}

class Rotate{
    public static void kRotation(int[] a, int k){
        int n = a.length;
        int[] b = new int[n];
        for (int i = (n - k), j = 0; i < n && j < k; i++, j++){
            b[j] = a[i];
        }
        for(int i = 0, j = k; i < (n - k) && j < n; i++, j++){
            b[j] = a[i];
        }
        for (int i = 0; i < n; i++){
            System.out.println(b[i]);
        }
    }
}

