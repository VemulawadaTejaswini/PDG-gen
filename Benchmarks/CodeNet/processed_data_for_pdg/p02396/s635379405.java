public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int data;
        int count = 1;
        while(true) {
			data = Integer.parseInt(br.readLine());
			if(data == 0) {
				break;
			}
			sb.append("Case " + count + ": " + data + "\n");
			count++;
        }
        System.out.print(sb);
	}
}
