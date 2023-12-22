public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			str = br.readLine();
			String[] strs = str.split(" ");
			StringBuilder sb = new StringBuilder();
			for(int i=strs.length -1;i>=0;i--){
				sb.append(strs[i]).append(" ");
			}
			String mes = "";
			if(sb.length()>0){
				mes = sb.substring(0,sb.length()-1);
			}
			System.out.println(mes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
