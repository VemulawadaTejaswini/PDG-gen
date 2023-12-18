public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		ArrayList<String> tmp = new ArrayList<String>();
		while (buffer.ready()){
			line=buffer.readLine();
			tmp.add(line);
		}
		String[] ab = tmp.get(0).split(" ");
		int[] num = new int[2];
		for(int i=0; i<2; i++)
			num[i] = Integer.parseInt(ab[i]);
		if(num[0]>num[1]){
			System.out.println("a > b");
		}else if(num[0] < num[1]){
			System.out.println("a < b");
		}else
			System.out.println("a == b");
	}
}
