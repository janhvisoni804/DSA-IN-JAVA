// given the no of rows and column then generate the valus of the element at that position
// TC - O(c)
// SC - O(1)
import java.util.*;
public class PascalsTriangle_I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of row and no of column ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int n=r-1,k=c-1; // imp step
        long res=1;
        for(int i=0;i<c;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        System.out.println("element is "+res);
    }
}
