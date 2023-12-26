public class Main {
	public static void main(String[] args) {
		int numN;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			numN = Integer.parseInt(line);
			String outputNum = "";
			for (int i = 1; i <= numN; i++) {
				if(i % 3 == 0){
					outputNum +=" " + i;
				}else if (String.valueOf(i).indexOf("3") != -1) {
					outputNum +=" " + i;
				}
			}
			System.out.println(outputNum);
		}catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
