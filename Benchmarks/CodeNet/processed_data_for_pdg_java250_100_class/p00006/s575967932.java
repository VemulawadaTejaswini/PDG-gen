public class Main {
	public static void main(String[] args) throws IOException{
		try{
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			String chain=br.readLine();
			for(int i=chain.length()-1; i>=0;i--){
				System.out.print(chain.charAt(i));
	        }
	        System.out.println("");
		}catch (IOException e) {
                     System.out.println(e);
                }
	}
}
