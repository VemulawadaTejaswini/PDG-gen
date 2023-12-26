public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		String s="";
		try {
			s = br.readLine();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		String[] str = new String[3];
		str = s.split("");
		List<Integer> ret = new ArrayList<Integer>();
		for(int j = 0; j<3;j++){
			if(str[j].equals("1"))ret.add(9);
			else ret.add(1);
		}
		String ans = String.valueOf(ret.get(0)) + String.valueOf(ret.get(1)) + String.valueOf(ret.get(2));
		System.out.println(ans);
	}
}
