public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();		
		int L = sc.nextInt();
		String s[]= new String[N];
		for(int i=0; i<N; i++){
		 s[i] = sc.next();
		}		
		Arrays.sort(s);
		for (String str : s) System.out.print(str);
        System.out.println();
	}	
}
