import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String str=sc.next();

		int N=str.length();

		int count01=0;
		int count10=0;

		if(N>2) {

			String[] strs=str.split("");

			String s0="0";
			String s1="1";

			for(int i=0;i<strs.length;i++) {

				if(i%2==0) {
					if(!strs[i].equals(s0)) count01++;
					if(!strs[i].equals(s1)) count10++;
				}else {
					if(!strs[i].equals(s1)) count01++;
					if(!strs[i].equals(s0)) count10++;
				}

			}
		}

		System.out.println(Math.min(count01, count10));

		sc.close();

	}

}
