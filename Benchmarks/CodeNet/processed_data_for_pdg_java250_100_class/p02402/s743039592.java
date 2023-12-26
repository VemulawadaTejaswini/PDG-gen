class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt(); 
		int fst;				
		int min = 0;			
		int max = 0;			
		long sum = 0;     		
		for(int i = 0; i < cnt; i++){
			fst = sc.nextInt();
			if(i == 0){min = max = fst;}
			if(min > fst){ min = fst;}
			if(max < fst){ max = fst;}
			sum += fst;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
