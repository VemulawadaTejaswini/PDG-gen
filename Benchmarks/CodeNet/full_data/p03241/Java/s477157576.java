import java.util.Scanner;
class Main{
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
long N= sc.nextInt();
long M=sc.nextInt();
long gcd=1;
double k=Math.sqrt(M);
for(long n=1;n<=k;n++) {
   if(M%n==0) {
	if(n*N<=M) {
	gcd=n;	
	 }
    }	
 }
System.out.println(gcd);
 }
  }