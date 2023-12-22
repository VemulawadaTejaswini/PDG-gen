import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
double d=0,ans1=1000;
int ans=0;
for(int i=0;i!=a;i++) {
d=scan.nextInt();
d=b-(d*0.006);
d-=c;
if(d<0) {d*=-1;}
if(d<ans1) {ans1=d;ans=i+1;}
}
System.out.println(ans);
}
}