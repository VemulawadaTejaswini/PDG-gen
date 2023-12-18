public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, no=1;
		StringBuilder sb = new StringBuilder();
		while(true){
			i = Integer.parseInt(br.readLine());
            if (i == 0) {
                break;
            }
            sb.append("Case ").append(no).append(": ").append(i).append("\n");
            no++;
		}
		System.out.print(sb);
	}
}
