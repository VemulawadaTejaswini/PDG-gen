public class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int intCount = 3;
		int intResult = 1;
		try {
			String strX = br.readLine();		
			try{
				int intX = Integer.parseInt(strX);
				for(int i = 0; i<intCount; i++) {
					intResult = intResult*intX;
				}
				System.out.println(intResult);
			}catch (NumberFormatException e) {
				e.printStackTrace();
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
}
