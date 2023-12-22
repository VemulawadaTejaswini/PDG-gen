import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a=scan.nextInt();
int b=scan.nextInt();
int p=0;
int[] x=new int[n];
int walk=0;
for(int i=0;i<n;i++){
  x[i]=scan.nextInt();
}
for(int i=0;i<n-1;i++){
  if(a*(x[i+1]-x[i])<b){
    p+=a*(x[i+1]-x[i]);
    walk++;
  }
}
p+=(n-1-walk)*b;
System.out.println(p);
}
}
