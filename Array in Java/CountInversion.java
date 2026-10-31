import java.util.ArrayList;

public class CountInversion {
    public static int Merge(int[] arr,int low,int mid,int high) {
        int left=low;
        int right=mid+1;
        int cnt=0;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){ //left is smaller
                temp.add(arr[left]);
                left++;
            }
            //right is smaller
            else{
                temp.add(arr[right]);
                cnt=cnt+(mid-left+1);
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
        return cnt;
    }
    public static int MergeSort(int[] arr,int low, int high) {
        int cnt=0;
        if(low==high){
            return cnt;
        }
        int mid=(low+high)/2;
        cnt=cnt+MergeSort(arr,low,mid);
        cnt=cnt+MergeSort(arr,mid+1,high);
        cnt=cnt+Merge(arr,low,mid,high);
        return cnt;
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,4,1};
        int cnt=MergeSort(arr,0,arr.length-1);
        System.out.println(cnt);
    }
}

