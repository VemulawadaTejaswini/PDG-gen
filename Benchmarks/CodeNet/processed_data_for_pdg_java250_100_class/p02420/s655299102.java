public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String st;
		StringBuffer sb = new StringBuffer();
		while (!(st = sc.readLine()).equals("-")){
			int m = Integer.parseInt(sc.readLine());
			for(int i = 0;i < m;i++){
				int h = Integer.parseInt(sc.readLine());
				st += st.substring(0,h);
				st = st.substring(h);
			}
			sb.append(st+"\n");
		}
		System.out.print(sb);
	}
}
