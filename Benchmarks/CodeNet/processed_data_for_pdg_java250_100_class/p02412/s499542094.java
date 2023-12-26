class Main {
	public static void main(String[] args) throws IOException {
		int count = 0;		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while( !(line.equals("0 0")) ) {
			String nums[] = line.split(" ");
			int max = Integer.parseInt(nums[0]);
			int sum = Integer.parseInt(nums[1]);
			for( int i = 1 ; i <= max ; i++ ) {		
				for( int j = i+1 ; j <= max ; j++ ) {	
					int k = sum - i - j ;
					if ( k <= j ) {	
						break;	
					}
					if ( k > max ) {	
						continue; 
					}
					count++;
				}
			}
			System.out.println(count);
			line = br.readLine();
			count = 0;
		}
	}
}
