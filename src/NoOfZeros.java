public class NoOfZeros {
    public static void main(String[] args) {
        System.out.println(zeros(1000,0));
    }
    static int zeros(int n,int count){
        if(n==0&&count==0){
            return count+1;
        }
        else if(n==0&&count!=0){
            return count;
        }
        else{
            if(n%10==0){
                return zeros(n/10,count+1);
            }
            else{
                return zeros(n/10,count);
            }
        }
    }
}
