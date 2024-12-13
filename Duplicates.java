import java.util.HashSet;
import java.util.Scanner;

public class Duplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Solution.findDuplicates(a);
    }
}

class Solution {
    public static void findDuplicates(int[] a) {
        // code here
        int n = a.length;
        int i,j;
        //ArrayList<Integer> b = new ArrayList<>();
        HashSet<Integer> b = new HashSet<>();
      
        for(i = 0; i < n -1; i++){
            for(j = i + 1; j < n; j++){
                if(a[i]==a[j]){
                    b.add(a[i]);
                }
            }
        }
        System.out.println(b);
    }
}
