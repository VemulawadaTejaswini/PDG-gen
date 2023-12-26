public class Main {
	Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int x;
		int i;
		for(i=3; i<= n; i++){
			x = i;
			if(x%3==0){
				System.out.print(" " + i);
				continue ; 
			}
			while(x!=0){
				if(x%10==3){
					System.out.print(" " + i);
					break ; 
				}
				x = x/10; 
			}
		}
		System.out.println();
    }
}
