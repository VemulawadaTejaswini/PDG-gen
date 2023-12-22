import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scn =new Scanner(System.in);
		int N=scn.nextInt();
		BigDecimal T=scn.nextBigDecimal();
		BigDecimal A=scn.nextBigDecimal();
		BigDecimal xxx=new BigDecimal(0.006);
		BigDecimal[] H=new 	BigDecimal[N];
		int ans=0;
		BigDecimal[] temp=new BigDecimal[N];
		for(int i=0;i<N;i++){
			H[i]=scn.nextBigDecimal();
			temp[i]=T.subtract(H[i].multiply(xxx));
			if(temp[ans].compareTo(temp[i])==-1&&temp[i].compareTo(A)==-1||A.compareTo(temp[i])==-1&&temp[i].compareTo(temp[ans])==-1){
				ans=i+1;
			}
		}
		if(ans==0)ans++;
		System.out.println(ans);

	}
}
