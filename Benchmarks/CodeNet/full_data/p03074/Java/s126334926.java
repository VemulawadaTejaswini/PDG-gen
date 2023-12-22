import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		int ans = 0;

		String shortS = S.replaceAll("1+", "1");
		shortS = S.replaceAll("0+", "0");

		int length = shortS.length();
		int switchCount = Math.min(length/2, K);

		List<Integer> countList = new ArrayList<>();

		int cnt = 1;
		for(int i=1; i<S.length(); i++){
			String current = String.valueOf(S.charAt(i));
			String last = String.valueOf(S.charAt(i-1));
			if(current.equals(last)){
				cnt++;
			}else{
				countList.add(cnt);
				cnt=1;
			}
		}
		countList.add(cnt);

		int sIndx = 0;
		int fIndx = Math.min(length, K*2);

		for(int i = sIndx; i<fIndx; i++) {
			ans += countList.get(i);
		}

		while(fIndx == countList.size()-1){
			int tmpAns = ans;
			tmpAns -= countList.get(sIndx);
			tmpAns += countList.get(fIndx++);
			sIndx++;

			ans = Math.max(ans, tmpAns);
		}



		System.out.println(ans);

	}


}
