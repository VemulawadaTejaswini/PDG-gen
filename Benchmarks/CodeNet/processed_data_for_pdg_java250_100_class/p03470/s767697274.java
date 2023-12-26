public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int d;
		int[] kata = new int[100];
		for (int i=0;i<total;i++) {
			d=sc.nextInt();
			kata[d-1]=1;
		}
		int sum=0;
		for(int j=0; j<100;j++) {
			sum=sum+kata[j];
		}
		System.out.println(sum); 
	}	
}
