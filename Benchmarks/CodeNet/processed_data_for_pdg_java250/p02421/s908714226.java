public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int t = 0;
		int h = 0;
		int n = Integer.parseInt(sc.readLine());
		for(int i = 0;i < n;i++){
			String[] s = sc.readLine().split(" ");
			if(s[0].compareToIgnoreCase(s[1]) > 0){
				t += 3;
			}else if(s[0].compareToIgnoreCase(s[1]) < 0){
				h += 3;
			}else{
				t++;
				h++;
			}
		}
		sb.append(t+" "+h+"\n");
		System.out.print(sb);
	}
}
