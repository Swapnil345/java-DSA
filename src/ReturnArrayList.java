import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,6,4,8};
//        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(indices(arr,4,0,new ArrayList<>()));
    }
    static ArrayList<Integer> indices(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return indices(arr,target,index+1,list);
    }
}
