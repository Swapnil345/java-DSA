import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
//        fun(1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to print: ");
        int n=sc.nextInt();
        fun(n);
    }
    static void fun(int a){
        if(a==0){
            return;
        }
        System.out.print(a+" ");
        fun(a-1);
        System.out.println();
        System.out.print(a+" ");

    }
}
