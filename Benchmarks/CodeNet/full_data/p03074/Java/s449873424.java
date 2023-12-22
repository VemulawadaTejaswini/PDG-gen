import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String[] strArray = s.split("");
		List<Integer> listOne = new ArrayList<>();
		List<Integer> listZero = new ArrayList<>();
		List<Integer> listOneSum = new ArrayList<>();
		List<Integer> listZeroSum = new ArrayList<>();

		boolean isContinue=true;
		boolean isCurrntZero=true;

		int countZero =0;
		int countOne =0;
		boolean firstIsOne=true;

		int zeroSum=0;
		int oneSum=0;

		for (int i = 0; i < n; i++) {
			String curS = strArray[i];
			if(i==0){
				if(curS.equals("0")){
					countZero=1;
					isCurrntZero=true;
					firstIsOne=false;
				}else{
					countOne=1;
					isCurrntZero=false;
					firstIsOne=true;
				}
				continue;
			}

			if(isCurrntZero){
				if(curS.equals("0")){
					countZero++;
					isCurrntZero=true;
				}else{
					listZero.add(countZero);
					zeroSum += countZero;
					listZeroSum.add(zeroSum);
					countZero=0;
					countOne=1;
					isCurrntZero=false;
				}
			} else {
				if(curS.equals("1")){
					countOne++;
					isCurrntZero=false;
				}else{
					listOne.add(countOne);
					oneSum += countOne;

					listOneSum.add(oneSum);
					countOne=0;
					countZero=1;
					isCurrntZero=true;
				}
			}
		}
		if(isCurrntZero){
			listZero.add(countZero);
			zeroSum += countZero;
			listZeroSum.add(zeroSum);

		}else{
			listOne.add(countOne);
			oneSum += countOne;

			listOneSum.add(oneSum);

		}

		if(k>=listZero.size()){
			System.out.println(n);
		}else{
			int maxNum=0;
			for (int i = 0; i < listZero.size()-k+1; i++) {
				int curPopular=0;

				if(i==0){
					if(firstIsOne){
						//1はk+1個、0はk個追加される
						curPopular += listZeroSum.get(k-1);
						curPopular += listOneSum.get(k-1);
					}else{
						//1はk個、0はk個追加される
						curPopular += listZeroSum.get(k-1);
						if(listZeroSum.size()==k){
							curPopular += listOneSum.get(k);
						}else{
							curPopular += listOneSum.get(k-1);
						}
					}
					maxNum=Math.max(maxNum,curPopular);
					continue;
				}

				curPopular += listZeroSum.get(i+k-1);
				curPopular -= listZeroSum.get(i-1);

				if(firstIsOne){
					if(listOneSum.size()==k+i){
						curPopular += listOneSum.get(k+i);
					}else{
						curPopular += listOneSum.get(k+i-1);
					}
					curPopular -= listOneSum.get(i-1);
				}else{
					curPopular += listOneSum.get(i+k-2);
					if(i-1>0){
						curPopular -= listOneSum.get(i-1);
					}
				}

				maxNum=Math.max(maxNum,curPopular);
			}
			System.out.println(maxNum);
		}
	}

}
