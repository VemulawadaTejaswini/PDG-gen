import java.util.*;
public class Main {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);	
//				BigDecimal base;
//				while(input.hasNextBigDecimal()){
//					base = input.nextBigDecimal();
//					int n=input.nextInt();
//					base=base.pow(n);
//					String ans;
//					ans=base.stripTrailingZeros().toPlainString();
//					if(ans.startsWith("0.")) ans=ans.substring(1);
//					System.out.println(ans);
//				}
				double a = input.nextDouble();
				double b=input.nextDouble();
				double c=input.nextDouble();
				if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c)) System.out.print("Yes");
				else System.out.print("No");
				input.close();
	}

}