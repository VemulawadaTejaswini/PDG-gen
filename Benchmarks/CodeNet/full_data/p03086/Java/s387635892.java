import java.util.Scanner;

public  class Main  {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char q[] = S.toCharArray();
		boolean flag = false; //ACGTの時はtrue
		int max = 0;
		int maxkouho = 0;
		for(int i =0; i<S.length(); i++) {
			if(q[i]=='A'||q[i]=='C'||q[i]=='G'||q[i]=='T') {
				flag = true;
				maxkouho++;
				continue;
			}
			if(flag&&q[i]!='A'&&q[i]!='C'&&q[i]!='G'&&q[i]!='T') {
				if(maxkouho>max)max = maxkouho;
				flag=false;
				maxkouho = 0;
			}
		}
		if(maxkouho>max) max = maxkouho;
		System.out.println(max);
		
		
	}
}

