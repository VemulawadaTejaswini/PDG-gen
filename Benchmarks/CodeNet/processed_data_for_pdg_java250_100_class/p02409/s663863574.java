class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int
			n,		
			b,		
			f,		
			r,		
			v;		
		int[][][]
			house	= new int[4][3][10];	
		String
			output;							
		String[]
			input	= new String[4];		
		n = Integer.parseInt(sc.nextLine());		
		for(int i=0;i<n;i++){
			input = sc.nextLine().split("[\\s]+");
			b = Integer.parseInt(input[0]);
			f = Integer.parseInt(input[1]);
			r = Integer.parseInt(input[2]);
			v = Integer.parseInt(input[3]);
			house[b - 1][f - 1][r - 1] += v;
		}
		for(b = 0;b < 4;b++){
			for(f = 0;f < 3;f++){
				output = "";
				for(r = 0;r < 10;r++){
					output += " " + house[b][f][r];
				}
				System.out.println(output);
			}
			if(b < 3){
				System.out.println("####################");
			}
		}
	}
}
