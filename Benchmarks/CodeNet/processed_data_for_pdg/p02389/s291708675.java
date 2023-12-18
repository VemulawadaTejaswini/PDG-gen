public class Main {
	public static void main(String args[]){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String[] strBR = insBR.readLine().split(" ");
			int intX = Integer.parseInt(strBR[0]);
			int intY = Integer.parseInt(strBR[1]);
			int intRectangle = intX * intY;
			int intLength = 2 * (intX + intY);
			System.out.println(intRectangle + " " + intLength);
		}catch(IOException e){
		}catch(NumberFormatException e){
		}
	}
}
