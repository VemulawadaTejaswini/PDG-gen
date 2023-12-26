public class Main {
	public static void main(String[] args) {
		int numN = 0;
		int i = 0;
		String outputNum = "";
		String[] NumList;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			numN = Integer.parseInt(line);
			line = br.readLine();
			if (line != null) {
				NumList = line.split(" ", 0);
				int Count = numN - 1;
				for (i = 0; i < NumList.length;i++) {
					if(Count != numN - 1){
						outputNum += " ";
					}
					outputNum += NumList[Count];
					Count--;
				}
				System.out.println(outputNum);
			}
		} catch (NumberFormatException e) {
			System.out.println(e);
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
