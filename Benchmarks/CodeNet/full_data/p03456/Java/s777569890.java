import java.util.Scanner;

class Main{
	
	
	public static void main(String[] args) {
		new Main().Kei();
	}
	
	void Kei() {
		Scanner sc=new Scanner(System.in);
		int a=Integer.parseInt(sc.next());
		int b=Integer.parseInt(sc.next());
		StringBuilder sb=new StringBuilder();
		sb.append(a);
		sb.append(b);
		double g=Math.sqrt(Integer.parseInt(sb.toString()));
		if(g==(int)g)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
}


