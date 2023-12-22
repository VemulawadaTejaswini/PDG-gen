import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner don = new Scanner(System.in);
		String[] bn;
		String as,bs;
		as = don.next();
		bn = new String[as.length()];
		for(int i=0;i<as.length();i++){
			if(String.valueOf(as.charAt(i)).equals("d")){
				bn[i]="b";
			}else if(String.valueOf(as.charAt(i)).equals("b")){
				bn[i]="d";
			}else if(String.valueOf(as.charAt(i)).equals("p")){
				bn[i]="q";
			}else{
				bn[i]="p";
			}
		}
		bs=bn[(as.length()-1)];
		for(int i=(as.length()-2);i>=0;i--){
			bs+=bn[i];
		}
		if(as.equals(bs)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}