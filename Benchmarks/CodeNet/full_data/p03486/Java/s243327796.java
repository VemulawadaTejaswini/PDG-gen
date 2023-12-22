import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean g = true;
		String a = sc.next();
		String b = sc.next();
		String[] strArray1 = a.split("");
		String[] strArray2 = b.split("");
		Arrays.sort(strArray1);
		Arrays.sort(strArray2,Collections.reverseOrder());
		int m1 = strArray1.length;
		int m2 = strArray2.length;
		if(m1 >= m2) m1 = m2;
		System.out.println(strArray1[0]);
		System.out.println(strArray2[0]);
		for(int i = 0;i < m1;i++) {
			if(strArray1[i].compareTo(strArray2[i]) < 0) {
				System.out.println("Yes");
				g  = false;
				break;
			}
		}
		if(g) System.out.println("No");
		sc.close();
	}
}
