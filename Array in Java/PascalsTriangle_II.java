// TC - O(row)
// SC - O(1)
import java.util.Scanner;
public class PascalsTriangle_II {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int row=sc.nextInt();
        int ans=1;
        System.out.print(ans+" ");
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            System.out.print(ans+" ");
        }
    }
}
