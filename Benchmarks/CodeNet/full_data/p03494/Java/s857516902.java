import java.util.Scanner;
public class Main{
	public static void main(String[] args) {


    Scanner sc =new Scanner(System.in);
   int a = sc.nextInt();
   int[] aa=new int[a];
   for(int i=0;i<a;i++) {
	   aa[i]= sc.nextInt();

   }
   int b =0;
   Loop1:for(int j=0;j>=0;j++) {
   for(int p=0;p<a;p++) {
	  if(aa[p]%2==0) {
		  aa[p]=aa[p]/2;

	  }
	  else {break Loop1;}

   }
   b++;
   }
   System.out.println(b);
}
  }
