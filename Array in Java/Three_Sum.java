import java.util.*;

public class Three_Sum {
    public static void main(String[] args) {
        int arr[]={-2,-2,-2,0,2,-1,-1,0,0,2,2,2,-1};
        Arrays.sort(arr);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    List<Integer> list=new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    result.add(list);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while(j<k && arr[k]==arr[k+1]){
                        k--;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
