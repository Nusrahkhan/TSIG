import java.util.Scanner;
public class occurences {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Target element:");
        int target = sc.nextInt();
        System.out.println("No. of occurences are: "+ Counting.count(a, target));
    }
}

class Counting{
    public static int count(int a[], int t){
        int temp=0;
        int n = a.length;
        for (int i = 0; i < n - 1; i++){
            if(a[i]==t){
                temp++;
            }
    }
        return temp;
    }
}
