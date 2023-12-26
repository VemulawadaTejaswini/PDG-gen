public class Main{
	public static void main(String[] args) {
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			String strLine = insBR.readLine();
			char[] chaAryLine = strLine.toCharArray();
			for(int i = 0; i < chaAryLine.length; i++) {
				if(Character.isUpperCase(chaAryLine[i])) {
					chaAryLine[i] = Character.toLowerCase(chaAryLine[i]);
				}else if(Character.isLowerCase(chaAryLine[i])) {
					chaAryLine[i] = Character.toUpperCase(chaAryLine[i]);
				}
				System.out.print(chaAryLine[i]);
			}
			System.out.println("");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
