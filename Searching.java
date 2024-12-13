import java.util.Scanner;
public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter search element: ");
        int element = sc.nextInt();
        int index = Binary.binary(a,element,0,n);
        if(index != -1){
            System.out.println("Element is present at " + index + " index");
        }
        else{
            System.out.println("Element not in array provided");
        }
    }
}

class Binary{
    public static int binary(int a[], int element, int low, int high){
        int mid = (low + high)/2;
        if(element == a[mid]){
            return mid;
        }
        else if(element > a[mid]){
            return binary(a, element, mid + 1, high);
        }
        else if (element < a[mid]){
            return binary(a, element, low, mid - 1);
        }
        return -1;
    }
}