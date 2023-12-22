import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong(),e=sc.nextLong(),min=n,res=0;
    double[] in=new double[6];
    in[0]=n;
    in[1]=a;
    in[2]=b;
    in[3]=c;
    in[4]=d;
    in[5]=e;
    for(int i=1;i<6;i++) {
    	if(min>in[i]) {
    		min=in[i];
    		res+=Math.ceil(in[i-1]/min);
    	}else {
    		res++;
    	}
    }
    System.out.println((long)res);
  }
}
