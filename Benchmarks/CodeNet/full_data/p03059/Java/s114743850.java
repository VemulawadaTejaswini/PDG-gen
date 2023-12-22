import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int A=sc.nextInt(); 
    int B=sc.nextInt(); //A秒ごとに生成するビスケットの枚数
    int T=sc.nextInt(); //T+0.5秒後のビスケットの枚数を求める
    double x=(double(T)+0.5)/A;
    System.out.println(int(x)*B);
      
    }
}