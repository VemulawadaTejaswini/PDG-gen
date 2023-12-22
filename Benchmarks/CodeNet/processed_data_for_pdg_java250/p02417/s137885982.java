class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		String str;
		char c = 'a';
		int id; 
		int sum[] = new int[26];
		try {
			while((id = isr.read()) != -1) {
				id = Character.toLowerCase(id);
				int num = id - 'a'; 
				if(0 <= num && num < 26) {
					sum[num]++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < 26; i++){
			System.out.println(c + " : " +sum[i]);
			c++;
		}
	}
}
