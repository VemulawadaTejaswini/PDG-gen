public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] price = new int[4];
	price[0] = sc.nextInt();
	price[1] = sc.nextInt();
	price[2] = sc.nextInt();
	for(int a = 1; a >= 0;a--){
		for(int b = 0; b <=a;b++){
			if(price[b]>price[b+1]){
				price[3] = price[b];
				price[b] = price[b+1];
				price[b+1] = price[3];
			}
		}
	}
	System.out.println(price[0]+" "+price[1]+" "+price[2]);
	}
}
