public class ReverseANumber {
    public static void main(String[] args) {
        int n=1842;
        int count=1;
        int ans=reverse(n,count);
        System.out.println(ans);
    }
    static int reverse(int n,int count){
        if(n==0){
            return 0;
        }
        return (int) ((n%10)*Math.pow(10,count)+reverse(n/10,count++));
    }
}
//this code is incomplete....i will complete it later.