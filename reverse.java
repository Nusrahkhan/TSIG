import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.println("Enter number: ");
        int a=s.nextInt();
        int t=0;
        while(a!=0){
            t+=a%10;
            a = a/10;
        }
        System.out.println("sum of digits is:"+t);
    }
}
