public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while(true){
			i++;
			int k = Integer.parseInt(br.readLine());
			if(k == 0){break;}
			System.out.println("Case "+i+": "+k);
		}
	}
}
