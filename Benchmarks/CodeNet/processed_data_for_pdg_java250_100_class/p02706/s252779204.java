public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		int m=sc.nextInt();		
		int count=0;
		for(int i=0;i<m;i++) {
			int m1=sc.nextInt();	
			count=count+m1;
		}
		count=n-count;
		if(count>=0) {
			System.out.println(count);
		}else {
			System.out.println(-1);
		}
		sc.close();
	}
}
