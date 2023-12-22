import java.util.Scanner;
public class Main {
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
	 	outside: for (int i=0; i<N; i++) {
	 		if (CBdiff[i] <0 ) {
	 			while (CBdiff[i]<0 ) {
	 				int attributer = findMax(CBdiff);
//	 				System.out.println("attribute is "+ attributer);
	 				if (CBdiff[attributer]<0) {
	 					break outside;
	 				}
	 				while (CBdiff[attributer]>0 && CBdiff[i]<0) {
	 					C[i]++;
	 					CBdiff[i]++;
	 					C[attributer]--;
	 					CBdiff[attributer]--;
//		 				System.out.println("C["+i+"] is "+ C[i]);
	 				}

	 			}
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
	public static int findMax (int[] array){
	 	int maxAt = 0;
	 	for (int i = 0; i < array.length; i++) {
	 	    maxAt = array[i] > array[maxAt] ? i : maxAt;
	 	}
	 	return maxAt;
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