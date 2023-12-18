class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] num = {scan.nextInt(), scan.nextInt(), scan.nextInt()};
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2 - i; j++){
				if(num[j] > num[j+1]){
					int t = num[j];
					num[j] = num[j+1];
					num[j+1] = t;
				}
			}
		}
		System.out.printf("%d %d %d\n", num[0], num[1], num[2]);
	}
}
