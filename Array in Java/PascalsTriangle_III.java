// TC - O(N^2)
// SC - O(N^2)
import java.util.*;

public class PascalsTriangle_III {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numrow=sc.nextInt();
        
        List<List<Integer>> pascals=new ArrayList<>();
        for(int row=0;row<numrow;row++){
            List<Integer> CurrentRow=new ArrayList<>();
            int ans=1;
            for(int col=0;col<=row;col++){
                if(col==0 || col==row){
                    CurrentRow.add(1);
                }
                else{
                    ans=ans*(row-col+1);
                    ans=ans/col;
                    CurrentRow.add(ans);
                }
            }
            pascals.add(CurrentRow);
        }
        System.out.println(pascals);
    }
}
