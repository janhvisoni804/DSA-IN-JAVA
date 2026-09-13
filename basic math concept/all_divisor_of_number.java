import java.util.Scanner;
public class all_divisor_of_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){      //is loop se hume 1 to sqrt(n) tak saare factors mil jaayenge
                System.out.print(i+" ");
                if((n/i)!=i){      //is loop se hume sqrt(n) to n tak saare factors mil jaayenge
                    System.out.print((n/i)+" ");
                }
            }
        }
    }
}
