public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int menseki=a*b;
		int gaisyu=2*(a+b);
		System.out.print(menseki);
		System.out.println(" "+gaisyu);
	}
}
