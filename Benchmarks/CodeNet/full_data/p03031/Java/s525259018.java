import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, List<Integer>> listMap = new TreeMap<>();

		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < k; j++) {
				int s = sc.nextInt();
				list.add(s);
			}
			listMap.put(i,list);
		}
		int[] pArray = new int[m];
		for (int i = 0; i < m; i++) {
			int p = sc.nextInt();
			pArray[i] = p;
		}
		int result = 0;

		for(int one =0;one<=1;one++){
			for(int two =0;two<=1;two++){
				for(int three =0;three<=1;three++){
					for(int four =0;four<=1;four++){
						for(int five =0;five<=1;five++){
							for(int six =0;six<=1;six++){
								for(int seven =0;seven<=1;seven++){
									for(int eight =0;eight<=1;eight++){
										for(int nine =0;nine<=1;nine++){
											for(int ten =0;ten<=1;ten++){
												Map<Integer, Integer> switchMap = new HashMap<>();
												switchMap.put(1,one);
												switchMap.put(2,two);
												switchMap.put(3,three);
												switchMap.put(4,four);
												switchMap.put(5,five);
												switchMap.put(6,six);
												switchMap.put(7,seven);
												switchMap.put(8,eight);
												switchMap.put(9,nine);
												switchMap.put(10,ten);

												boolean isOk=true;
												for (int i = 0; i < m; i++) {
													// 電球iについて
													int curP = pArray[i];
													List<Integer> curList = listMap.get(i);

													// System.out.println("curP "+curP);
													// System.out.println("curList "+curList);

													int sumOn =0;
													for(int switchin:curList){
														// System.out.println("switchMap.get "+ switchMap.get(switchin));
														sumOn += switchMap.get(switchin);
													}
													if(!(sumOn%2 == curP)){
														isOk =false;
														break;
													}
												}
												if(isOk){
													result++;
												}
			
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		int pow = (int)Math.pow(2,10-n);
		result = result / pow;
		System.out.println(result);



	}
}
