    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// トレーニング回数の入力
    		int N = sc.nextInt();
		// すぬけくんの初期パワー
		int IniPwr = 1;
		// N回トレーニングしたあとのパワー
		for (int i=1 ; 0<i && i<=N ; i++){
		IniPwr = IniPwr * i ;
		}
		//10^9+7
		double a = Math.pow(10,9) + 7;
		int b = (int)(IniPwr%a);
    		// あまりを出力
    		System.out.println(b);
    	}
    }