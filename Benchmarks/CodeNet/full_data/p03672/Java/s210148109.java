import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		param.set(0, param.get(0).substring(0,param.get(0).length()-1));
		int count = 0;
		int maxi = 0;
		int memo = 0;
		int memoJ = 99999999;
		boolean memoF = false;


		for(int i = 0; i < param.get(0).length(); i++){
			for(int j = i+1; j < param.get(0).length(); j++){
				//System.out.println(i +" " + param.get(0).charAt(i) + " " + j + " " +param.get(0).charAt(j));
				if(param.get(0).charAt(i) == param.get(0).charAt(j) && i < memoJ){
					if(!memoF){
						memo = i;
						memoJ = j;
						memoF = true;
					}
					i++;
					count++;
				} else {
					if(maxi < count && j - count == i) maxi = count;
					count = 0;
					if(memoF){
						i = memo;
						j = memoJ;
					}
					memoF = false;
				}
				if(i == param.get(0).length()-1 && memoF){
					i = memo;
					j = memoJ;
					memoF = false;
				}
			}
		}
		System.out.println(maxi*2);
	}
}