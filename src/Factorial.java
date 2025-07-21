import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial u want: ");
        int n = sc.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }

        return n*factorial(n-1);
    }
}
