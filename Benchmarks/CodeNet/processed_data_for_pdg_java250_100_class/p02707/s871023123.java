public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = Integer.valueOf(s.next());
        int[] Ai = new int[N+1];
        Arrays.fill(Ai, 0);
		for(int i = 0; i < N-1; i++) {
            int hoge = Integer.valueOf(s.next());
			Ai[hoge] += 1;
        }
        for(int i = 1; i < Ai.length; i++) {
            System.out.println(Ai[i]);
        }
    }
}
