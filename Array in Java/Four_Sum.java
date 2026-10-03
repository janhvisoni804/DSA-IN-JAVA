import java.util.*;

public class Four_Sum {
    public static void main(String[] args) {
        int[] arr = {1,5,5,4,3,2,3,4,2,1,1,3,2,4};
        int target=8;
        Arrays.sort(arr);
        List<List<Integer>> unique_element=new ArrayList<>();
        for(int i=0;i<arr.length-3;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int k=j+1;
                int l=arr.length-1;
                while(k<l){
                    int sum=arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum>target){
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        List<Integer> list=new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(arr[l]);
                        unique_element.add(list);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1]){
                            k++;
                        }
                        while(k<l && arr[l]==arr[l+1]){
                            l--;
                        }
                    }
                }
            }
        }
        System.out.println(unique_element);
    }
}
