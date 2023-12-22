import java.util.Scanner;

public class Main {
	Scanner scan;
	String s1;
	int count;

	public static void main(String args[]){
		new Main().compute();
	}
	void compute() {
		scan=new Scanner(System.in);

		s1=scan.next();
		String[] s2=s1.split("");
		
		for(int i=0;i<3;i++) {
			if(s2[i].equals("o")) {
				count++;
			}
		}
		System.out.println(700+100*count);
	}
}