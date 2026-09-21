import java.util.Scanner;
public class COUNT_THE_NUMBER{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        int output=(int)(Math.log10(n)+1);
        System.out.println(output);
    }
}
