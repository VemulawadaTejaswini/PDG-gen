class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int[] n = new int[10];
			for(int i = 0; i< 10; i++) {
				String str = br.readLine();
				n[i] = Integer.parseInt(str);
			}
			Arrays.sort(n);
			for(int i = 9; i> 6; i--) {
				System.out.println(n[i]);
			}
		}catch (Exception e) {
			System.exit(0);
		}
	}
}
