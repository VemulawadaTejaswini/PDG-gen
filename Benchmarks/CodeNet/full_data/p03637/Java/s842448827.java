import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int n1=0;
            int n4=0;
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                if(num%4==0) n4++;
                else if(num%2==1) n1++;
            }
            if(n1+n4<n&&n1>n4) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
