import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scn =new Scanner(System.in);
		int N=scn.nextInt();
		int T=scn.nextInt();
		int A=scn.nextInt();
		double[] H=new double[N];
		int ansnum=0;
		double[] temp=new double[N];
		H[0]=scn.nextInt();
		int ans=(int) H[0];
		for(int i=1;i<N;i++){
			H[i]=scn.nextInt();
			if(A<0){
				if(ans>H[i]){
					ans=(int) H[i];
					ansnum=i+1;
				}
			}else{
				if(ans<H[i]){
					ans=(int) H[i];
					ansnum=i+1;
				}
			}
		}
		System.out.println(ansnum);
		}}