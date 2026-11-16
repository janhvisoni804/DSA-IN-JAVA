public class Last_First_Occurence {
    public static int FirstOccurence(int[] arr,int low,int high,int target){
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }

    public static int LastOccurence(int[] arr,int low,int high,int target){
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid +1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,8,8,8,11,13};
        int first=FirstOccurence(arr,0,arr.length-1,8);
        int last=LastOccurence(arr,0,arr.length-1,8);
        if(first==-1){
            System.out.println(-1+" "+-1);
        }
        else{
            System.out.println(first+" "+last);
        }
    }
}
