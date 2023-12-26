class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
		System.out.println((S/3600)+":"+(S%3600/60)+":"+(S%3600%60));
	}
}
