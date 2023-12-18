class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			int area = a * b;
			int areaLength = ( a + b ) * 2;
			System.out.println(area + " " + areaLength);
	}
}
