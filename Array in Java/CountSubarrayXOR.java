// TC - O(N)
// SC - O(N)
import java.util.*;
public class CountSubarrayXOR {
    public static void main(String[] args) {
        int arr[]={4,2,2,6,4};
        int xor=0,cnt=0,k=6;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, 1);
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
            int x=xor^k;
            if(map.containsKey(x)){
                cnt=cnt+map.get(x);
            }
            map.put(xor, map.getOrDefault(xor,0)+1);
        }
        System.out.println(cnt);

    }
}
