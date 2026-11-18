public class SearchRotatedSorted_I {
    public static int SearchElement(int[] arr,int target){
        int low=0,high=arr.length-1,found=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                found=mid;
                break;
            }
            else if(arr[mid]<arr[high]){
                if(target>arr[mid] && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(target>=arr[low] && target<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return found;
    }
    public static void main(String[] args) {
        int arr[] = {7,8,9,1,2,3,4,5,6};
        int target=1;
        int found=SearchElement(arr,target);
        if(found==-1){
            System.out.println(-1);
        }
        else{
            System.out.println(found);
        }
    }
}
