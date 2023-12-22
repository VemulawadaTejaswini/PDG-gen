import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int y=sc.nextInt();
        int a=-1;
        int b=-1;
        int c=-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                for(int k=0;k<=n;k++){
                    if(10*i+5*j+k==y/1000 &&i+j+k==n){
                        a=i; b=j; c=k;
                        break;
                    }
                }
            }
        }
        System.out.println(a+" "+b+" "+c);
        
    }
}