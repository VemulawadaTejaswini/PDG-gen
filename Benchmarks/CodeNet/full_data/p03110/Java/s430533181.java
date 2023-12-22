import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		double[] v=new double[n];
		String[] str=new String[n];
		for(int i=0;i<n;i++){
			v[i]=s.nextDouble();
			str[i]=s.next();
		}
		s.close();
		double num=0;
		for(int i=0;i<str.length;i++){
			if(str[i].equals("JPY")){
				num +=v[i];
			}else{
				num +=v[i]*380000.0;
			}
		}
		System.out.println(num);

	}
}