public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++) {
		 a[i]=sc.nextInt();
		}
		int s=0;
		for(int i=0;i<m;i++) {
			s+=a[i];
		}
		if(s>n){
		System.out.println(-1);
		}else{
		System.out.println(n-s);
		}
	}
}
