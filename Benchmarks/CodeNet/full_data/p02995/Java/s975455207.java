import java.util.Scanner;
public class Main{
 
//最小公倍数lcm
static long lcm (long a, long b) {
	long temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return c/b;
}
  
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long A = sc.nextLong()-1;
   long B = sc.nextLong();
   long C = sc.nextInt();
   long D = sc.nextInt();
   
   long lcm_cd = 0;
   long sum_B = 0;
   long sum_A = 0;
   if(C >=D) 
   {
    lcm_cd = lcm(C,D);
   }
   else 
   {
     lcm_cd = lcm(D,C);
   } 
   sum_B = B - ( (B/C) + (B/D) - (B/lcm_cd) );
   sum_A = A - ( (A/C) + (A/D) - (A/lcm_cd) );
   System.out.println(sum_B-sum_A);
 }
}