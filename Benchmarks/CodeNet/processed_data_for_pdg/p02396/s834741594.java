public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=10000;i++) {
			int x=sc.nextInt();
			if(x==0) {
				break;
			}else {
				System.out.println("Case "+(i+1)+": "+x);
			}
		}
	}
}
