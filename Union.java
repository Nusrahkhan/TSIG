import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class Union {
    public static void main(String[] args) {
        System.out.print("Enter array limit: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Enter array limit: ");
            int m = sc.nextInt();
            int[] b = new int[m];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            UnionAns.union(a, b);
        }
    }
}

class UnionAns{
    public static void union(int a[], int b[]){
        int n = a.length;
        int m = b.length;
        HashSet<Integer> c = new HashSet<>();
        for(int i = 0; i < n; i++){
            c.add(a[i]);
        }
        for(int i = 0; i < m; i++){
            c.add(b[i]);
        }
        Vector<Integer> vector = new Vector<>(c);
        Collections.sort(vector);
        ArrayList<Integer> arrayList = 
        new ArrayList<>(vector);
        System.out.println(arrayList);
    }
}
