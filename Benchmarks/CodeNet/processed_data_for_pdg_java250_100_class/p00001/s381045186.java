class Main {
	public static void main(String[] args){
		Integer[] input = new Integer[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<10; i++){
			try {
				input[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Arrays.sort(input, Collections.reverseOrder());
		for(int i=0; i<3; i++){
			System.out.println(input[i]);
		}
	}
}
