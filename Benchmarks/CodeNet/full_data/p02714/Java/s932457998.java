import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		String S = scan.next();
		int num=0;
		for(long k = N; k>=4; k--) {
			for(long j = k-1; j>=2; j--) {
				for(long i = j-1; i>=1; i--) {
					if(check1(S,i,j,k)==true) {
						if(check2(i,j,k)==true) {
							num++;
						}
					}
				}
			}
		}
		System.out.println(num);

	}

	public static boolean check1(String S,long i,long j,long k) {
		String[] strArray = S.split("");

//		for (int z = 0; z < strArraySub.length; z++) {
//		    System.out.println("strArraySubの要素番号" + z + "の時：" + strArraySub[z]);
//		}

//		String[] strArray = new String[S.length()];
//
//		for (int z = 1; z < strArraySub.length; z++) {
//		    strArray[z - 1] = strArraySub[z];
//		}

//		for (int z = 0; z < strArray.length; z++) {
//		    System.out.println("strArrayの要素番号" + z + "の時：" + strArray[z]);
//		}

		if((strArray[(int) (i-1)].equals(strArray[(int) (j-1)])) || (strArray[(int) (i-1)].equals(strArray[(int) (k-1)])) || (strArray[(int) (j-1)].equals(strArray[(int) (k-1)]))){
			return false;
		}else {
			return true;
		}
	}

	public static boolean check2(long i,long j,long k) {
		if(j-i==k-j) {
			return false;
		}else {
			return true;
		}
	}
}
