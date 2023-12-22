public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tokuten;
		int kazu = 0;
		double average = 0;
		double hensa2 =0.0;
		double bunsan;
		while (true){
			kazu = sc.nextInt();
			if(0==kazu) break;
			tokuten = new int[kazu];
			for(int i=0;i<tokuten.length;i++){
				tokuten[i]=sc.nextInt();
				average += (double)tokuten[i]/tokuten.length;
			}
			for(int i=0;i<tokuten.length;i++){
				hensa2 += (tokuten[i]-average)*(tokuten[i]-average);
			}
			bunsan=hensa2/tokuten.length;
			System.out.println(Math.sqrt(bunsan));
			average = 0;
			hensa2 = 0;
			kazu =0;
		}
	}
}
