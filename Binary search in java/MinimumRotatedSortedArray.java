public class MinimumRotatedSortedArray {
    public static int min_value(int[] arr,int n,int min){
        int low=0,high=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                min=Math.min(arr[low],min);
                low=mid+1;
            }
            else{
                min=Math.min(arr[mid],min);
                high=mid-1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int min=Integer.MAX_VALUE;
        int ans=min_value(arr,arr.length-1,min);
        System.out.println(ans);
    }
}
