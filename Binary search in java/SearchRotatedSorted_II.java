public class SearchRotatedSorted_II {
    public static boolean SearchElement(int[] arr,int target){
        int low=0,high=arr.length-1;
        boolean found=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                found=true;
                break;
            }
            else if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            else if(arr[mid]<=arr[high]){
                if(target>=arr[mid] && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(target>=arr[low] && target<=arr[mid]){
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
        int arr[]={3,2,1,3,3,3,3};
        int target=1;
        boolean found=SearchElement(arr,target);
        if(found){
            System.out.println(found);
        }
        else{
            System.out.println(false);
        }
    }
}
