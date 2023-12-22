import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int k=scan.nextInt();
int[] p=new int[n];

int i=0;
for(i=0;i<n;i++){
    p[i]=scan.nextInt();
}

int max=0;
for(i=0;i<k;i++){
    max=max+p[i];
}
int temp=max;
if(n>k){
    for(i=1;i<=n-k;i++){
        temp=temp-p[i-1]+p[i+k-1];
        if(max<temp){
            max=temp;
        }
    }
}
double ma=(double)max;

System.out.println((ma+k)/2.0);
}
}