import java.io.PrintWriter;
import java.util. *;



	
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt(); sc.nextLine();
        String a = sc.nextLine();
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<N-1;i++) {
//            sb.append(sc.next());
//        }
//        String a = sb.toString();
         
//        String a = "";
//        for (int i = 0; i < N-1; i++) {
//			a = a + sc.next();
//		}
//      
       
        long i = 0;
        long j = 0;
//        long[] ans = new long[N];
        ArrayList<Long> ans = new ArrayList<Long>();
//        ArrayList<Long> b = new ArrayList<Long>();
        while (i < N - 1) {
        	long temp_sum = a.length();
			a = a.replaceAll(String.valueOf(j+1), "");
			ans.add(temp_sum - a.length());
			i += temp_sum - a.length(); 
			j += 1;
		}
        
        for (int k = 0; k < N - ans.size()+1; k++) {
			ans.add(0L);
		}
        PrintWriter out = new PrintWriter(System.out);
        for (int k = 0; k < N; k++) {
			System.out.println(ans.get(k));
		}
        out.flush();
	}
}
