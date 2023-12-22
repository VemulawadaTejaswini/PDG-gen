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
    x[i]=scan.nextInt();
    h[i]=scan.nextInt();
    if(h[i]%a==0){
        h[i]=h[i]/a;
    }else{
        h[i]=h[i]/a+1;
    }
}

int j=0;
long temp1=0;
long temp2=0;
for(i=0;i<n;i++){
    for(j=0;j<n-i-1;j++){
        if(x[j]>x[j+1]){
            temp1=x[j];
            temp2=h[j];
            x[j]=x[j+1];
            h[j]=h[j+1];
            x[j+1]=temp1;
            h[j+1]=temp2;
        }
    }
}

long sum=0;
long temp3=0;
for(i=0;i<n;i++){
    if(h[i]>0){
        sum=sum+h[i];
        temp3=h[i];
        exitloop:
            for(j=i;j<n;j++){
                if(x[i]+2*d>=x[j]){
                    h[j]=h[j]-temp3;            
                }else{
                    break exitloop;
                }
            }
    }
}

System.out.println(sum);
}
}