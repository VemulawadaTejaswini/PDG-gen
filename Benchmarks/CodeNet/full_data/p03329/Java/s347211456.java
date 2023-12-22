import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();		
		boolean flag =true;
		int remain = a;
		int cc = 0;
		while(flag){
			int poN = checkMaxNine(remain);
			int poS = checkMaxSix(remain);
			if(calcSix(poS)- calcNine(poN) >0){
				remain = remain- calcSix(poS);
				cc++;
			}else{
				remain = remain- calcNine(poN);
				cc++;;
			}
			if(remain <6 ){
				flag = false;
				cc += remain;
			}

		}
      System.out.println(cc);
	}

	public static int checkMaxNine(int a){
		int poN =0;
		int maxNine = 7;
		int nine = 1;
				for(int i=1;i<=maxNine;i++){
				nine = nine *9;
				int diff= a- nine;
				if(diff >= 0){
					poN = i;
				}
		}
		return poN;
	}

		public static int checkMaxSix(int a){
		int poN =0;
		int maxSix = 7; 
		int six =1;
				for(int i=1;i<=maxSix;i++){
				six = six *6;
				int diff= a- six;
				if(diff >= 0){
					poN = i;
				}
		}
		return poN;
	}

	public static int calcSix(int po){
		int six = 1;
				for(int i=1;i<=po;i++){
				six = six *6;
				}
		return six;
	}

	public static int calcNine(int po){
		int six = 1;
				for(int i=1;i<=po;i++){
				six = six *9;
				}
		return six;
	}

}