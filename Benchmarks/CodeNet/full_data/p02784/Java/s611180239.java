import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int h,n,sum;
        h=scan.nextInt();
        n=scan.nextInt();
        sum=0;
        for(int i=0;i<n;i++){
            sum+=scan.nextInt();
        }
      if(h-sum<0) System.out.println("Yes");
      else System.out.println("No");
    }
}