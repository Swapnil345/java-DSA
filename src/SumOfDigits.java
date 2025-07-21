public class SumOfDigits {
    public static void main(String[] args) {
        int n=1342;
        int ans=sumOfDigits(n);
        System.out.println(ans);
        ans=prodOfDigits(n);
        System.out.println(ans);
    }
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }
    static int prodOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return n%10*prodOfDigits(n/10);
    }
}
