import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		int hatecnt = sc.nextInt();
		int hatenums[] = new int[hatecnt];
		int likenums[] = new int[10-hatecnt];
		int h = 0;
		int l = 0;
		int tmp = sc.nextInt();
		for(int i=0; i<10; i++){
			if(tmp == i){
				hatenums[h] = tmp;
				h++;
				if(h != hatecnt){
					tmp = sc.nextInt();
				}

			}else{
				likenums[l] = i;
				l++;
			}
		}
		int maxd = getDigit(pay);
		int result = 0;
		for(int i = maxd; i > 0; i--){
			int num = getDgNum(pay, i, maxd);
			for(int j : likenums){
				if(num <= j){
					result += j * getPow(10, i-1);
					break;
				}
			}
		}
		sc.close();
		System.out.println(result);
	}

	public static int getDigit(int num){
		int cnt = 0;
		while(num>0){
			num /= 10;
			cnt += 1;
		}
		return cnt;
	}
	public static int getPow(int num, int pow){
		int tmp = num;
		if(pow==0){
			return 1;
		}
		for(int i = 1; i < pow; i++){
			tmp = tmp * num;
		}
		return tmp;
	}

	public static int getDgNum(int num, int digit, int maxdigit){
		int rtn = num;
		if(digit == maxdigit){
			rtn = num/getPow(10, digit-1);
			return rtn;
		}
		int tmp = num - (num/getPow(10, digit) * getPow(10, digit));
		rtn = (tmp/getPow(10,digit-1));

		return rtn;
	}
}