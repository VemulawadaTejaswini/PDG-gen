public class Main{
	public static void main(String[] args) {
		char[] chaAZ = {'a','b','c','d','e','f',
				'g','h','i','j','k','l','m','n',
				'o','p','q','r','s','t',
				'u','v','w','x','y','z'};
		int[] intAZ = new int[26];
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			String strLine = "a";
			while((strLine = insBR.readLine())!=null){
			if(strLine.equals("")) {
				break;
			}
			strLine = strLine.toLowerCase();
			char[] chaAryLine = strLine.toCharArray();
			for(int i = 0; i < chaAryLine.length; i++) {
				for(int j = 0; j < intAZ.length; j++) {
					if(chaAryLine[i] == chaAZ[j]) {
						intAZ[j]++;
					}
				}
			}
			}
			for(int i = 0; i < intAZ.length; i++) {
				System.out.println(chaAZ[i] + " : " + intAZ[i]);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
