import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int a = sc.nextInt();
		//List<Integer> check=new ArrayList<Integer>();
		//array = new int[h+1][w+1];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//Collections.reverse(list);

		String s=sc.next();
		if(s.equals("Sunny"))
			System.out.println("Cloudy");
		else if(s.equals("Cloudy"))
			System.out.println("Rainy");
		else if(s.equals("Rainy"))
			System.out.println("Sunny");
	}

}
