import java.util.Scanner;
public class Main {
public static void main(String args[]) {
Scanner cro=new Scanner(System.in);
int test,n,m,i,j,lm,ln;
n=cro.nextInt();
m=cro.nextInt();
j=cro.nextInt();
ln=-j;
for(i=1;i<n;i++) j=cro.nextInt();
ln=ln+j;
j=cro.nextInt();
lm=-j;
for(i=1;i<m;i++) j=cro.nextInt();
lm=lm+j;
long area=lm;
area=area%1000000007;
area=area*ln;
area=area%1000000007;
area=area*(n-1);
area=area%1000000007;
area=area*(m-1);
area=area%1000000007;
System.out.println(area);
}       
}