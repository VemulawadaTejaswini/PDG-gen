import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []s=new int[N];
        for(int i=0;i<N;i++){
            s[i]=sc.nextInt();
        }
        int min=100;
        int sum=0;
        for(int i=0;i<N;i++){
            sum=sum+s[i];
        }
        if(sum%10!=0){
            System.out.println(sum);
        }else{
        for(int i=0;i<N;i++){
            if((min>=s[i])&&(s[i]%10!=0)){
                min=s[i];
            }
            if((i==N-1)&&(min!=100)){
                System.out.println(sum-min);
            }
            if((i==N-1)&&(min==100)){
                System.out.println(0);
            }
        }}


     
    }
}