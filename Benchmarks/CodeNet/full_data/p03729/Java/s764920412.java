import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] str = in.nextLine().split(" ",0);
		String[] st1 = str[0].split("",0);
		String[] st2 = str[1].split("",0);
		String[] st3 = str[2].split("",0);

		int s1Len = st1.length-1;
		int s2Len = st2.length-1;

		if((st1[s1Len].equals(st2[1])) && (st2[s2Len].equals(st3[1]))){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
