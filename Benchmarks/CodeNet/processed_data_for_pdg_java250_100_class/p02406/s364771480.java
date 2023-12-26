class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(Integer i = 1 ; i <= n ; i++){
			if(i%3==0){
				System.out.print(" " + i.toString());
			}
			else{	
				int x = i;
				while(x > 0){
					if(x%10==3){
						System.out.print(" " + i.toString());
						break;
					}
					x = x/10;
				}				
			}
		}
System.out.println();
	}
}
