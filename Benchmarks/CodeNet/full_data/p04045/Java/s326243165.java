public class Main {
	static String str;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < k; i++) {
        	str = sc.next();
        }
        for(int i = 0; i < 100000; i++ ) {
        	if(check(n)) {
        		System.out.print(i);
                return;
        	}
        }
        sc.close();
	}
	private static boolean check(int n){
		boolean result = true;
		String m;
		while(n >= 1) {
			m = String.valueOf(n % 10);
			int comp = m.lastIndexOf(str);
			if(comp != -1) {
				result = false;
			}
			n = n / 10;
		}
		
		return result;
    	
    }
}
