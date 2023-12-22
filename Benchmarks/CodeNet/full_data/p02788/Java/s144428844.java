import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
long d=scan.nextLong();
long a=scan.nextLong();
long[] x=new long[n];
long[] h=new long[n];

int i=0;
for(i=0;i<n;i++){
    x[i]=scan.nextLong();
    h[i]=scan.nextLong();
    if(h[i]%a==0){
        h[i]=h[i]/a;
    }else{
        h[i]=h[i]/a+1;
    }
}

int j=0;
long sum=0;
long e=0;
for(i=0;i<n;i++){
    if(h[i]>0){
        sum=sum+h[i];
        e=h[i];
        exitloop:
            for(j=i;j<n;j++){
                if(x[i]+2*d>=x[j]){
                    h[j]=h[j]-e;            
                }else{
                    break exitloop;
                }
    }
}

System.out.println(sum);
}
}