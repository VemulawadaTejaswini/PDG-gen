public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int mid = sc.nextInt();
			int fin = sc.nextInt();
			int re = sc.nextInt();
			if(mid == -1 && fin == -1 && re == -1){
				break;
			}
			if (mid == -1 || fin == -1){
				System.out.println('F');
			}else{
				int sum = mid + fin;
				if (sum >= 80){
					System.out.println('A');
				}else if (65 <= sum && sum < 80){
					System.out.println('B');
				}else if (50 <= sum && sum < 65){
					System.out.println('C');
				}else if (30 <= sum && sum < 50){
					if (re >= 50){
						System.out.println('C');
					}else{
						System.out.println('D');
					}
				}else{
					System.out.println('F');
				}
			}
		}
	}
}
