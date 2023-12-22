import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[1000000000*2];
		int h = sc.nextInt();
		int a = sc.nextInt();
		if(a>=h)
			System.out.println(1);
		else if(h%a==0)
			System.out.println(h/a);
		else
			System.out.println(h/a+1);
    }
}