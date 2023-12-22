import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		   int N=sc.nextInt();
                if(N%2==0){
                     System.out.print(N+" "+N+" "+N/2);
               }else if(N%4==3){
                     System.out.print((N+1)/4+" "+N*(N+1)/2+" "+N*(N+1)/2); 
               }else{
                     long A,B;long a=3*N/4;long b=1;
                     while(a<=3500){
                            while(b<=a){
                                    A=N*a*b;
                                    B=4*a*b-N*(a+b);
                                    if(A%B==0&&B>0){
                                              System.out.print(a+" "+b+" "+A/B);
                                              a=3501;b=3501;
                                   }b++;
                          }b=1;a++;
                   }
            }
	}
}