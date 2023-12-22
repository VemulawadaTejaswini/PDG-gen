    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
     
    public class Main {
     
    	public static void main(String[] args) throws IOException, Exception{
    		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
    		int n = getInt(st);
    		long t = 0;
    		for (int i = 1;i<n;i++) {
    			t+=i;
    		}
    		System.out.println(t);
    	}
     
    	private static int getInt(BufferedReader st) throws Exception, IOException {
    		int num = Integer.parseInt(st.readLine());
    		return num;
    	}
    }