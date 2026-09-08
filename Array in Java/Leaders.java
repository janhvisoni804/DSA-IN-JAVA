public class Leaders {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        int leaders[]=new int[arr.length]; //SC - O(N) in worst case.it is only used to store the ans
        int index=0;
        int maxi=Integer.MIN_VALUE;
        //TC - O(N)
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>maxi){
                maxi=arr[i];
                leaders[index]=arr[i];
                index++;
            }
        }
        //TC - O(N) but it is for printing the answer
        for(int i=0;i<index;i++){
            System.out.print(leaders[i]+" ");
        }
    }
}
