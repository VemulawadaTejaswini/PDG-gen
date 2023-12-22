import java.util. *;

	
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
//        String a[] = new String[N-1];
//        for (int i = 0; i < N-1; i++) {
//			a[i] = sc.next();
//		}
        String a = "";
        for (int i = 0; i < N-1; i++) {
			a = a + sc.next();
		}
//        a = sc.next();
        int sum[] = new int[N];
        sum[N-1] = 0;
        String s = a;
        for (int i = 0; i < N - 1; i++) {
        	int temp_sum = s.length();
			s = s.replaceAll(String.valueOf(i+1), "");
			sum[i] = temp_sum - s.length();  
			System.out.println(sum[i]);
		}
        System.out.println(sum[N-1]);
        
//        int sum = Arrays.stream(a).sum();
        
//        System.out.println(Math.max(N - sum, -1));
	}
}