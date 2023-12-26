public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		try {
			String str = br.readLine();
			for(int i=0; i<str.length(); i++){
				list.add(str.substring(i,i+1));
			}
			Collections.reverse(list);
			for(String s : list){
				System.out.print(s);
			}
			System.out.println("");	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
