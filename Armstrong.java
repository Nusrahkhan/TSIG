import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-1000");
        int a = sc.nextInt();
        int temp=a;
        if(a > 0 && a < 1001){
            int rem, arm = 0;
            while(temp != 0){
                rem = temp % 10;
                arm += rem*rem*rem;
                temp = temp/10;
            }
            if(arm == a){
                System.out.println( a +" Is armstrong number");
            }
            else{
                System.out.println("Not an armstrong number");
            }
        }
        else{
            System.out.println("Number is not in specified range");
        }
    }
}
