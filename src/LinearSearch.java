public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9};
        System.out.println(search(arr,18,0));
    }
    static boolean search(int[] arr,int target,int index){
        if(index>=arr.length){
            return false;
        }
//        if(arr[index]==target){
//            return true;
//        }
        return (arr[index]==target)||search(arr,target,index+1);
    }
}
