public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		int k=sc.nextInt();		
		ArrayList<Integer>array=new ArrayList<>();
		for(int i=0;i<k;i++) {
			int d=sc.nextInt();		
			for(int m=0;m<d;m++) {		
				int sunu=sc.nextInt();
				if(!array.contains(sunu)) {
					array.add(sunu);
				}
			}
		}
		System.out.println(n-array.size());
		sc.close();
	}
}
