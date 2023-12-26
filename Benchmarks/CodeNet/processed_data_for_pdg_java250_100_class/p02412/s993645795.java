public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int counter = 0;
			int n = sc.nextInt();
			int x = sc.nextInt();	
			if(n == 0 && x == 0){
				break;
			}
			for(int i = n; i >= 3; i--){
				for(int j = i - 1; j >= 2; j--){
					int remainder = x - i - j;
					if (remainder <= 0){
						continue;
					}else if (remainder >= j){
						break;
					}else{
						counter++;
					}
				}
			}
			System.out.println(counter);
		}
	}
}
