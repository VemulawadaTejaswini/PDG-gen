import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力値を変数に代入
		double price_tax = sc.nextInt();
        double tax_rate = 1.08;
        double price = price_tax/tax_rate;
        double price_ceil = Math.ceil(price);
      	double price_tax_floor = Math.floor(price_ceil*tax_rate);
      	int out;
      	if(price_tax == price_tax_ceil){
          	out = (int)price_ceil;
         	System.out.println(out);
        }
      	else{
         	System.out.println(":("); 
        }
	}
}