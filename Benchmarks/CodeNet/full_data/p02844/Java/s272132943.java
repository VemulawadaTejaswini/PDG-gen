import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int num = 0;
		for(int i = 0 ; i <= 9 ; i++) {
			String[] s2 = s.split(Integer.toString(i), 2);
			if(s2.length == 1)
				continue;
			for(int j = 0 ; j <= 9 ; j++) {
				String s3[] = s2[1].split(Integer.toString(j), 2);
				if(s3.length == 1)
					continue;
				for(int k = 0 ; k <= 9 ; k++) {
					if(s3[1].contains(Integer.toString(k)))
						num++;

				}

			}

		}
		System.out.println(num);



	}

}
