public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String strLine = br.readLine();
		 String[] lineArray = strLine.split(" ");
		 int height	= Integer.parseInt(lineArray[0]);
		 int width	= Integer.parseInt(lineArray[1]);
		 System.out.printf("%d %d\n", height * width, 2 * (height + width)); 	  
	}
}
