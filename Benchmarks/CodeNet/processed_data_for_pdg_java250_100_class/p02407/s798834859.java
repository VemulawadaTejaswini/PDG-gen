public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        String[] input2 = br.readLine().split(" ");
        for(int a = n - 1; 0 < a + 1; a--){
        	if(0 == a){
        		System.out.println(input2[a]);
        	}else{
            	System.out.print(input2[a] + " ");
        	}
        }
	}
}
