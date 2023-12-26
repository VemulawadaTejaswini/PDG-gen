public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		int m=sc.nextInt();		
		int a=0;
		ArrayList<Integer>array=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int b=sc.nextInt();	
			array.add(b);
			a=a+b;		
		}
		int c=(a+4*m-1)/(4*m);
		int count=0;
		for(int i:array) {
			if(i>=c) {
				count++;
			}
		}
		if(count>=m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			}
		sc.close();
	}
}
