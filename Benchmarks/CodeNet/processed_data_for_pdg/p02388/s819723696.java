public class Main{
	public static void main(String args[]){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String strX = insBR.readLine();
			int intX = Integer.parseInt(strX);
			int intCube = intX * intX * intX;
			System.out.println(intCube);
		}catch(IOException e){
		}catch(NumberFormatException e){
		}
	}
}
