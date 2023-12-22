

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		String[] strArraySubA = A.split("");
		String[] strArrayA = new String[A.length()];
		int count = 0;
//		int count2 = 0;
//		int count3 = 0;
		for (int i = 0; i < strArraySubA.length; i++) {
		    strArrayA[i] = strArraySubA[i];
		}
		String[] strArraySubB = B.split("");
		String[] strArrayB = new String[B.length()];
		for (int i = 0; i < strArraySubB.length; i++) {
		    strArrayB[i] = strArraySubB[i];
		}
		String[] strArraySubC = C.split("");
		String[] strArrayC = new String[C.length()];


		for (int i = 0; i < strArrayA.length; i++) {
		    // "strArray"を1文字ずつ表示
//		    System.out.println("strArrayの要素番号" + i + "の時：" + strArrayA[i]);
		}
		for (int i = 0; i < strArrayB.length; i++) {
		    // "strArray"を1文字ずつ表示
//		    System.out.println("strArrayの要素番号" + i + "の時：" + strArrayB[i]);
		}
		for (int i = 0; i < strArraySubC.length; i++) {
		    strArrayC[i] = strArraySubC[i];
		}
		for(int i = 0; i<N;i++) {
			if(strArrayA[i].equals(strArrayB[i]) && strArrayA[i].equals(strArrayC[i])) {
//					nothing
			}else if(!(strArrayA[i].equals(strArrayB[i]))&&!(strArrayA[i].equals(strArrayC[i]))&&!(strArrayB[i].equals(strArrayC[i]))){
				count =count + 2;
			}else {
				count ++;
			}
		}
		System.out.println(count);
//		for(int i = 0; i<N;i++) {
//			if(strArrayA[i].equals(strArrayC[i])) {
//
//			}else {
//				count1 ++;
//			}
//		}
//		for(int i = 0; i<N;i++) {
//			if(strArrayB[i].equals(strArrayA[i])) {
//
//			}else {
//				count2 ++;
//			}
//		}
//		for(int i = 0; i<N;i++) {
//			if(strArrayB[i].equals(strArrayC[i])) {
//
//			}else {
//				count2 ++;
//			}
//		}
//		for(int i = 0; i<N;i++) {
//			if(strArrayC[i].equals(strArrayA[i])) {
//
//			}else {
//				count3 ++;
//			}
//		}
//		for(int i = 0; i<N;i++) {
//			if(strArrayC[i].equals(strArrayB[i])) {
//
//			}else {
//				count3 ++;
//			}
//		}
////		System.out.println(count1);
////		System.out.println(count2);
////		System.out.println(count3);
//
//		if(count1>=count2 && count2>=count3) {
//			System.out.println(count3);
//		}else if(count2>=count3 &&count3>=count1) {
//			System.out.println(count1);
//		}else {
//			System.out.println(count2);
//		}

//		System.out.println(count1);
//
//		for (int i = 0; i < strArrayA.length; i++) {
//		    // "strArray"を1文字ずつ表示
//		    System.out.println("strArrayの要素番号" + i + "の時：" + strArrayA[i]);
//		}
//		for (int i = 0; i < strArrayB.length; i++) {
//		    // "strArray"を1文字ずつ表示
//	    System.out.println("strArrayの要素番号" + i + "の時：" + strArrayB[i]);
//		}
//		for (int i = 0; i < strArrayC.length; i++) {
//		    // "strArray"を1文字ずつ表示
//	    System.out.println("strArrayの要素番号" + i + "の時：" + strArrayC[i]);
//		}

//		int N = sc.nextInt();
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int max=0;
//		int min=0;
//		if(N >= 1 && N<=100) {
////		nがa+b以下
//			if(A+B<=N) {
//				if(A>B) {
//					max = B;
//					min = 0;
//				}else if (A<=B) {
//					max = A;
//					min = 0;
//				}
//			}
////
//			if(A+B>N) {
//				if(A>=B) {
//					max = B;
//					min = (A+B)-N;
//				}else if(A<B) {
//					max = A;
//					min = (A+B)-N;
//				}
//			}
//			if(A==B && A==N) {
//				max = N;
//				min = N;
//			}
//		}
//		System.out.println(max +" "+ min);




	}
}
