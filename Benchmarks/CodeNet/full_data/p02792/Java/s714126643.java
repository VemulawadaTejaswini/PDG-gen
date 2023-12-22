import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();

int i=1;
int sum=0;
double a1=0.0;
int a2=0;
double a3=0.0;
int a4=0;
int a=0;
int b=0;

for(i=1;i<=n;i++){
    a1=Math.log10((double)i);
    a2=(int)a1;
    a3=(double)a2;
    a4=(int)Math.pow(10.0,a3);
    a=i/a4;
    b=i%10;
  
    if(b==0){
        continue;
    }  

    if(a==b){
        sum=sum+(Math.min(a,n)-n)/(a-n);
    }
    sum=sum+(Math.min(10*b+a,n)-n)/(10*b+a-n);

    if(100*b+a<=n&&n<=100*b+90+a){
        sum=sum+n-100*b-a+1;
    }else if(100*b+90+a<n){
        sum=sum+10;
    }

    if(1000*b+a<=n&&n<=1000*b+990+a){
        sum=sum+n-1000*b-a+1;
    }else if(1000*b+990+a<n){
        sum=sum+100;
    }

    if(10000*b+a<=n&&n<=10000*b+9990+a){
        sum=sum+n-10000*b-a+1;
    }else if(10000*b+9990+a<n){
        sum=sum+1000;
    }

}

System.out.println(sum);

}
}