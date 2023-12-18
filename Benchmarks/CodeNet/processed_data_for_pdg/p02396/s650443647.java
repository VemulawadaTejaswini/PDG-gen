public class Main {
	public static void main(String[] args) {
		int a;
		int i=0;
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			a=scan.nextInt();
			if(a==0)
				break;
			System.out.println("Case "+(i+1)+": "+a);
			i++;
		}
	}
	}
