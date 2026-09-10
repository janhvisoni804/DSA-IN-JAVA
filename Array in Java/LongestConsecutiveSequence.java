import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,3,2,1,1};
        int longest=1 , cnt=0;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        for(int it:st){
            if(!st.contains(it-1)){
                cnt=1;int x=it;
                while(st.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest=Math.max(longest, cnt);
            }
        }
        System.out.println(longest);
    }
}
