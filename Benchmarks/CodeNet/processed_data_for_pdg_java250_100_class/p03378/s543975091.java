public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);
		int X = Integer.parseInt(tmp[2]);
		List<Integer> A = new ArrayList<Integer>();
		tmp = br.readLine().split(" ");
		for(int i = 0;i<M;i++){
			A.add(Integer.parseInt(tmp[i]));
		}
		int countL = 0;
		int countR = 0;
		for(int l = X;l>0;l--){
			if(A.contains(l))countL++;
		}
		for(int r = X;r<=N;r++){
			if(A.contains(r))countR++;
		}
		System.out.println(Math.min(countL,countR));
	}
}
