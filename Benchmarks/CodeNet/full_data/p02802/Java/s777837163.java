import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n =  sc.nextInt();
	int m =  sc.nextInt();
	String ps[][] = new String[m][2];
	int OK = 0;
	int NG = 0;
	int jud = 0;

	for(int i=0;i<m;i++) {
		for(int j=0;j<2;j++) {
			ps[i][j] = sc.next();
		}
	}

	for(int i=0;i<m;i++) {
		if(ps[i][1].equals("AC")&&jud!=Integer.parseInt(ps[i][0])){
			OK +=1;
			jud = Integer.parseInt(ps[i][0]);
		}
		if(ps[i][1].equals("WA")&&jud!=Integer.parseInt(ps[i][0])) {
			NG += 1;
		}
	}
	System.out.println(OK+" "+NG);
  }
}