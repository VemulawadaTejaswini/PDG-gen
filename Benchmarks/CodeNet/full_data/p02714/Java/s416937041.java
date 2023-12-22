import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s =sc.next();
		int count =0;
		for(int i =0; i < n ; i++) {
			char iC = s.charAt(i);
			for(int j =i+1; j < n ;j++) {
				char jC = s.charAt(j);
				if(jC == iC) {
					continue;
				}else {
					for(int k=j+1 ; k < n; k++) {
						int kC = s.charAt(k);
						if(kC == jC || kC == iC) {
							continue;
						}
						if(j-i !=k-j) {
								count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}
