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
for(i=0;i<n-2;i++){
    if(max<p[i]+p[i+1]+p[i+2]){
        max=p[i]+p[i+1]+p[i+2];
    }
}

double ma=(double)max;

System.out.println((ma+3.0)/2.0);
}
}