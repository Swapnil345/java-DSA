public class OppositeLinearSearch {
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9};
        System.out.println(search2(arr,2,arr.length-1));
    }
    static boolean search2(int[] arr,int target,int index){
        if(index<0){
            return false;
        }
        return (arr[index]==target)||search2(arr,target,index-1);
    }
}
