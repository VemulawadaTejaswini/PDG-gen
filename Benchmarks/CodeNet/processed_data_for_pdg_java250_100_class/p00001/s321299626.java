class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hight[];
		hight = new int[10];
		for(int i = 0; i < 10; i++){
			hight[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(hight);
		for(int i = 0; i < 3; i++){
			System.out.println(hight[9 - i]);
		}
	}
}
