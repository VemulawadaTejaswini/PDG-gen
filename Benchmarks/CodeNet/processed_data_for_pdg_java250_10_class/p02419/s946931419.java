public class Main{
	public static void main(String [] args){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in),1200);
		String w = "";
		String work = "";
		String input = "";
		int count = 0;
		try{
			w = r.readLine();
			input = r.readLine();
			while(input != null){
				work += " ";
				work += input;
				input = r.readLine();
			}
		}catch(Exception e){
			System.out.println(e);
		}
		input = work;
		input = input.toLowerCase();
		StringTokenizer st = new StringTokenizer(input," ");
		while(st.hasMoreTokens()){
			work = st.nextToken();
			if(work.length() < w.length()){
					continue;
			}else{
				if(w.equals(work)){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
