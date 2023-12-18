public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		while(true){
			String str = br.readLine();
			if(str.equals("0")){
				break;
			}
			System.out.println("Case "+ i + ": "+str);
			i++;
		}
	}
}
