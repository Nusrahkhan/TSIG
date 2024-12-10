import java.util.Scanner;
public class Odds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int a = s.nextInt();
        int t, even=0, odd=0;
        while(a!=0){
            t = a%10;
            if(t%2==0){
                even++;
            }
            else{
                odd++;
            }
            a=a/10;
        }
        System.out.println("Number of evens are:"+even);
        System.out.println("Number of odds are:"+odd);
    }

}
