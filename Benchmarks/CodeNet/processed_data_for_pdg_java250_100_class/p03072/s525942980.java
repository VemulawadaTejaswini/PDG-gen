public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String tmp = in.readLine();
		int N = Integer.parseInt(tmp);
		tmp = in.readLine();
		String[] Ws = tmp.split(" ");
		int max = Integer.parseInt(Ws[0]);
		int Hi ;
		int count =1;
		for(int i=1;i<N;i++){
			Hi = Integer.parseInt(Ws[i]);
			if(max <= Hi){
				max = Hi;
				count++;
			}
		}
		System.out.print(count);
	}
}
