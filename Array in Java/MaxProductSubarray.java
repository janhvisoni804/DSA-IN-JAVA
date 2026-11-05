import java.util.*;
public class MaxProductSubarray {
    public static void main(String[] args) {
        int arr[]={-5, 0, -2};
        int maxi=Integer.MIN_VALUE;
        int prefix=1,suffix=1;
        for(int i=0;i<arr.length;i++){
            if(prefix==0){
                prefix=1;
            }        
            if(suffix==0){
                suffix=1;
            }
            prefix=prefix*arr[i];
            suffix=suffix*arr[arr.length-i-1];
            maxi=Math.max(maxi, Math.max(suffix, prefix));
        }
        System.out.println(maxi);
    }
}
