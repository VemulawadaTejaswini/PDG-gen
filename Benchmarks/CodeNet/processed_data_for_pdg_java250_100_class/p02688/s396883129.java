public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int member = sc.nextInt();  
		int sweet = sc.nextInt();  
		int result = 0;  
		int[] brother = new int[member];  
		for(int i=0 ; i<sweet ; i++) {  
			int num = sc.nextInt();  
			for(int j=0 ; j<num ; j++) {  
				int sunuke = sc.nextInt();  
				brother[sunuke-1] += 1;  
			}
		}
		for(int i=0 ; i<member ; i++) {  
			if(brother[i]==0) {
				result++;
			}
		}
		System.out.print(result);
	}
}
