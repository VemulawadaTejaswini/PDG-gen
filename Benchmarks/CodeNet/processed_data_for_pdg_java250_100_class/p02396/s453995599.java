class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 10001; i++) {
			list.add(br.readLine());
			if ("0".equals(list.get(i))) {
				for (int j = 1; j < list.size(); j++) {
					System.out.println("Case "+j+": "+list.get(j-1));
				}
				break;
			}
		}
	}
}
