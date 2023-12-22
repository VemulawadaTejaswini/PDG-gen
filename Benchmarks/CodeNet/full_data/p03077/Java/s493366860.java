import java.util.Arrays;
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
    Arrays.sort(in);
    System.out.println((long)Math.ceil(n/in[0])+4);
  }
}
