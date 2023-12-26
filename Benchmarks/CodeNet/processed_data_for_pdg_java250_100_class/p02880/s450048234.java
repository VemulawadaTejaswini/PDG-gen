public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int kuku[] = new int[100];
		for(int i=0;i<10;i++) {
			kuku[i]=i;
			for(int k=0;k<10;k++) {
				kuku[k]=k;
				sum = (kuku[i])*(kuku[k]);
				if(sum == N) {
					System.out.println("Yes");
					System.exit(0);
				}else {
					continue;
				}
			}
		}
		  System.out.println("No");
	}
}
