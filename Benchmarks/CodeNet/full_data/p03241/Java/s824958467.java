import java.util.Scanner;
class Main{
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int N= Integer.parseInt(sc.next());
int M= Integer.parseInt(sc.next());
int gcd=1;
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
 