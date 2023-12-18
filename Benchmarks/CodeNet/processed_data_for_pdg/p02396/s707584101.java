public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str;
			int i = 1;
			int j;
			while((str = br.readLine()) !=  null){
				j = Integer.parseInt(str);
				if(j == 0) {
					break;
				}
				System.out.println("Case " + i + ": " + str);
				i++;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
