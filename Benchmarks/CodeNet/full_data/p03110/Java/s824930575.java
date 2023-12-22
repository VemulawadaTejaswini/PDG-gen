import java.util.Scanner;

public class Main{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		double x[]=new double[n];
		String v[]=new String[n];
		int jpy=0;
		double btc=0;

		for(int i=0;i<n;i++){
			x[i]=sc.nextDouble();
			v[i]=sc.next();
		}

		for(int i=0;i<n;i++){
			if(money(v[i])){
				jpy+=x[i];
			}else{
				btc+=x[i];
			}
		}

		System.out.println((double)jpy+btc*380000.0);

	}

	public static boolean money(String a){
		if(a.equals("JPY")){
			return true;
		}else{
			return false;
		}
	}

}
