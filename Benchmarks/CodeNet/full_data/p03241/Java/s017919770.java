import java.util.Scanner;
class Main{
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
long N= sc.nextInt();
long M=sc.nextInt();
long gcd=1L;
for(int n=1;n<=M/N;n++) {
   if(M%n==0) {
	if(n*N<=M) {
	gcd=n;	
	 }
    }	
 }
System.out.println(gcd);
 }
  }
 
