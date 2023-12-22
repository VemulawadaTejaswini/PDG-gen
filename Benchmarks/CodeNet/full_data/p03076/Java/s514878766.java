import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int a_10 = (10-a%10)%10;
		int b_10 = (10-b%10)%10;
		int c_10 = (10-c%10)%10;
		int d_10 = (10-d%10)%10;
		int e_10 = (10-e%10)%10;
		int count_a=a+b+b_10+c+c_10+d+d_10+e+e_10;
		int count_b=a+a_10+b+c+c_10+d+d_10+e+e_10;
		int count_c=a+a_10+b+b_10+c+d+d_10+e+e_10;
		int count_d=a+a_10+b+b_10+c+c_10+d+e+e_10;
		int count_e=a+a_10+b+b_10+c+c_10+d+d_10+e;
		int answer = count_a;
		if(answer>count_b)
			answer=count_b;
		if(answer>count_c)
			answer=count_c;
		if(answer>count_d)
			answer=count_d;
		if(answer>count_e)
			answer=count_e;
		System.out.println(answer);

	}
}

