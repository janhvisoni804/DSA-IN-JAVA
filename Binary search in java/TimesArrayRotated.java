public class TimesArrayRotated {
    public static int array_rotated(int[] arr,int n,int min){
        int low=0,high=n,index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]<min){
                    index=low;
                    min=arr[low];
                }
                low=mid+1;
            }
            else{
                if(arr[mid]<min){
                    index=mid;
                    min=arr[mid];
                }
                high=mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int min=Integer.MAX_VALUE;
        int ans=array_rotated(arr,arr.length-1,min);
        System.out.println(ans);
    }
}
