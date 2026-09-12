import java.util.Scanner;
public class prime_number{
    public static int prime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        int ans=prime(n);
        if(ans==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime number");
        }
    }
}
