public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int shurui = sc.nextInt();  
		double select = sc.nextInt();  
		double sum = 0;  
		int shouhin[] = new int[shurui];  
		for(int i=0 ; i<shurui ; i++) {
			int tokuhyou = sc.nextInt();
			shouhin[i] += tokuhyou;
			sum += tokuhyou;
		}
		double kijun = (sum/(4*select));
		int count = 0;
		for(int i : shouhin) {
			if(i >= kijun) {
				count ++;
			}
		}
		System.out.println(count >= select ? "Yes" : "No");
	}
}
