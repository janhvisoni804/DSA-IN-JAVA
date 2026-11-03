import java.util.ArrayList;

public class ReversePairs {
    public static int ReversePair(int[] arr,int low,int mid,int high){
        int right=mid+1;
        int cnt=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>2*arr[right]){
                right++;
            }
            cnt=cnt+(right-(mid+1));
        }
        return cnt;
    }
    public static void Merge(int[] arr,int low,int mid,int high) {
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static int MergeSort(int[] arr,int low, int high) {
        int cnt=0;
        if(low==high){
            return cnt;
        }
        int mid=(low+high)/2;
        cnt=cnt+MergeSort(arr,low,mid);
        cnt=cnt+MergeSort(arr,mid+1,high);
        cnt=cnt+ReversePair(arr,low,mid,high);
        Merge(arr,low,mid,high);
        return cnt;
    }
    public static void main(String[] args) {
        int arr[]={40,25,19,12,9,6,2};
        int cnt=MergeSort(arr,0,arr.length-1);
        System.out.println(cnt);
    }
}
