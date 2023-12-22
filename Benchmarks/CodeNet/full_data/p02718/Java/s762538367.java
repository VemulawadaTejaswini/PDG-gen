import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int sum=0,t_value=0,check=0;
        int ar[]=new int[n];
        for (int i = 0; i <n; i++) {
            ar[i]=in.nextInt();
            sum=sum+ar[i];
        }
        t_value=sum/(4*m);
        int count=0;
        for (int i = 0; i <n; i++) {
                    if(ar[i]*(4*m) >= sum){
            count++;
        }
        }
        if(count>=m){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}