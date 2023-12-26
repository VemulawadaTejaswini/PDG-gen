public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int w = Integer.parseInt(tmpArray[0]);
		int h = Integer.parseInt(tmpArray[1]);
		int x = Integer.parseInt(tmpArray[2]);
		int y = Integer.parseInt(tmpArray[3]);
		int r = Integer.parseInt(tmpArray[4]);
		if(x >= r && w - x >= r && y >= r && h - y >= r){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
