public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int happiness = 0;
		int x = kb.nextInt();
		while (x>=500) {
			happiness+=1000;
			x-=500;
		}
		while(x>=5) {
			happiness+=5;
			x-=5;
		}
		System.out.println(happiness);
		kb.close();
	}
}
