public class Main {

	public static class Pair{
		// indexじゃない
		public int start;
		public int end;
		Pair(int s, int e){
			start = s;
			end = e;
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		String sline = sc.next();
		int[] l = new int[Q];
		int[] r = new int[Q];
		for(int i=0; i<Q; i++){
			l[i] = Integer.parseInt(sc.next());
			r[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		String[] s = new String[N];
		for (int i=0; i<N; i++){
			s[i] = String.valueOf(sline.charAt(i));			
		}
		

		ArrayList<Pair> plist = new ArrayList<Pair>();
		int[] ans = new int[Q];
		for (int i=0; i<N-1; i++){
			if(s[i].equals("A") && s[i+1].equals("C")){
				Pair p = new Pair(i+1,i+2);
				plist.add(p);
				for(int j=0; j<Q; j++){
					if(p.start >= l[j] && p.end <= r[j]){
						ans[j]++;
					}
				}
			}
		}
		for(int i=0; i<Q; i++){
			System.out.println(ans[i]);
		}
		
	}

}