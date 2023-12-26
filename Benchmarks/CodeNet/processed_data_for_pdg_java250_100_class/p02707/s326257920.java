public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
        Integer syain[] = new Integer[N+1];
        Arrays.fill(syain, 0);
        for (int i=2; i<=N; i++) {
          int joushi = Integer.parseInt(sc.next());
          syain[joushi] += 1;
        }
        for(int i=1; i<syain.length; i++) {
            System.out.println( syain[i]);
        }
	}
}
