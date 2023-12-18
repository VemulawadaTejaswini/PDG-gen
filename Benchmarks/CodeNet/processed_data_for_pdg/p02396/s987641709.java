public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=0;
		while(true) {
		int b=sc.nextInt();
		k++;
		if(b==0) {
			break;
		}else {
			System.out.println("Case "+k+": "+b);
		}
		}
	}
}
