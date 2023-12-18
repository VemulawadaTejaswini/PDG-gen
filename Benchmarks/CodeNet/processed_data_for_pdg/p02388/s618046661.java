public class Main { 
	public static void main(String[] args) throws Exception { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null){
		int i = Integer.parseInt(line);
			System.out.println(i*i*i);
		}}
	}
