public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strS,strP ;
		strS = br.readLine();
		strP = br.readLine();
		strS += strS;
		if(strS.contains(strP))
			System.out.println("Yes");
		else
		System.out.println("No");
		}
	}
