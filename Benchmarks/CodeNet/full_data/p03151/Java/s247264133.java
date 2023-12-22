import java.util.Scanner;
public class KeyenceChallenge3 {
 public static void main (String[] args){

	 	Scanner sc = new Scanner(System.in);

	 	// 整数の入力
	 	int N = sc.nextInt();
	 	int[] A = new int[N];
	 	for (int i=0; i<N;i++){
	 		A[i]= sc.nextInt();
	 	}

	 	int[] C = A.clone();

	 	int[] B = new int[N];
	 	int[] CBdiff = new int[N];
	 	for (int i=0; i<N; i++){
	 		B[i]= sc.nextInt();
	 		CBdiff[i] = C[i]-B[i];
	 	}

	 	//明らかに無理な場合を判別
	 	int Asum=0, Bsum=0;
	 	for (int i=0; i<N; i++){
	 		Asum= Asum+ A[i];
	 		Bsum= Bsum+ B[i];
	 	}
	 	//明らかに無理な場合はここにて終了
	 	if(Bsum > Asum){
	 		System.out.println("-1");
	 		System.exit(0);
	 	}


	 	//CBdiff<0だと不合格点、CBdiff>=0で合格点
//	 	outside: for (int i=0; i<N; i++) {
//	 		if (CBdiff[i] <0 ) {
//	 			while (CBdiff[i]<0 ) {
//	 				int attributer = findMax(CBdiff);
////	 				System.out.println("attribute is "+ attributer);
//	 				if (CBdiff[attributer]<0) {
//	 					break outside;
//	 				}
//	 				while (CBdiff[attributer]>0 && CBdiff[i]<0) {
//	 					C[i]++;
//	 					CBdiff[i]++;
//	 					C[attributer]--;
//	 					CBdiff[attributer]--;
////		 				System.out.println("C["+i+"] is "+ C[i]);
//	 				}
//
//	 			}
//	 		}
//	 	}

	 	//別メソッド
 		int attributer = findMax(CBdiff); //もっとも準備度が上回っているもの。
		int target = findTarget(CBdiff);
	 	while (isCvalid (B, C)==false) {
	 		//int attributer = findMax(CBdiff); //もっとも準備度が上回っているもの。
//				System.out.println("attribute is "+ attributer);
//				System.out.println("target is "+ target);
			if (CBdiff[attributer]<=0) {
					break ;
			}
//			int target = findTarget(CBdiff); //もっとも準備度が下回っているもののうちノルマに近いもの
			if (CBdiff[target]+CBdiff[attributer]>=0) { //足りない準備度を全補給
//				System.out.println("CBdiff["+target+"] is "+ CBdiff[target]);
//				System.out.println("C["+attributer+"] is "+ C[attributer]);
				C[target]=B[target];
				C[attributer]+=CBdiff[target];
				CBdiff[attributer]+=CBdiff[target];
				CBdiff[target]= 0;
				target = findTarget(CBdiff);//新たにattributerインデックスを更新
//				System.out.println("C["+attributer+"] is "+ C[attributer]);
//				System.out.println("new target is "+ target);
//				System.out.println("C["+target+"] is "+ C[target]);
			} else if (CBdiff[target]+CBdiff[attributer]<0) { //Attributerの準備度分だけC[target]に補給
				C[target]+=CBdiff[attributer];
				CBdiff[target]+=CBdiff[attributer];
				C[attributer]-=CBdiff[attributer];
				CBdiff[attributer]=0;
				attributer = findMax(CBdiff); //新たにattributerインデックスを更新
//				System.out.println("new attributer is "+ attributer);
			}

	 	}


	 	boolean result = isCvalid (B, C);

	 	if (result) {
	 		int cnt =0;
	 		for (int i=0;i<N; i++) {
	 			if (A[i]!=C[i]) {
	 				cnt++;
	 			}
	 		}
	 		System.out.println(cnt);
	 	}else {
	 		System.out.println("-1");
	 	}

//	 	for (int c : C) {
//	 		System.out.print(c+" ");
//	 	}

  }
	public static int findMax (int[] array){//もっとも準備度がノルマを上回っているもの。
	 	int maxAt = 0;
	 	for (int i = 0; i < array.length; i++) {
	 	    maxAt = array[i] > array[maxAt] ? i : maxAt;
	 	}
	 	return maxAt;
 	}

	public static int findTarget (int[] array) { //準備度がもっともノルマに近いもの。
		int targetAt = findMin(array);
	 	for (int i = 0; i < array.length; i++) {
	 		if (array[i]<0) {
	 	    targetAt = array[i] > array[targetAt] ? i : targetAt;
	 		}
	 	}
	 	return targetAt;
	}

	public static int findMin (int[] array){
	 	int minAt = 0;
	 	for (int i = 0; i < array.length; i++) {
	 	    minAt = array[i] < array[minAt] ? i : minAt;
	 	}
	 	return minAt;
 	}

	public static boolean isCvalid (int[] arrayB, int[] arrayC) {
		boolean bl = true;
		for (int i = 0; i< arrayB.length; i++) {
			if (arrayC[i] < arrayB[i]) {
				bl = false;
				break;
			}
		}
		return bl;
	}
}