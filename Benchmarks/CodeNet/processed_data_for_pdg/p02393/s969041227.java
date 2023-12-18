class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] cut = input.split(" ");
		Arrays.sort(cut);
		System.out.println(cut[0]+" "+cut[1]+" "+cut[2]);
	}
}
