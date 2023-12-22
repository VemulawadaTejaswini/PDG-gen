import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Scanner ss=new Scanner(System.in);
        int N=sc.nextInt();
        int [] a;
        a=new int[N];
        a[0]=2;
        a[1]=1;
        for(int i=2;i<=N-1;i++){
            a[i]=a[i-1]+a[i-2];
            if(i==N-1){
                System.out.println(a[i]);
            }
        }
        
        
        
        


    }
}
