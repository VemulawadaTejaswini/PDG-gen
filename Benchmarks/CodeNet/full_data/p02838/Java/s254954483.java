import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	long[] tmp=new long[a];
      	long sum=0;
      	for(int i = 0 ; i < a; i ++)
        {
          tmp[i]=sc.nextLong();
        }
      	for(int i = 0 ; i < a-1; i ++)
        {
          for(int j = i+1 ; j < a; j ++)
          {
            sum=(sum+((tmp[i]^tmp[j])%1000000000))%1000000000;            
            System.out.println(tmp[i]^tmp[j]);
            System.out.println(sum);
          }
        }
      System.out.println(sum%1000000000);
    }
}