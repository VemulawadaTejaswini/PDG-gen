public class Main {
	public static void main(String[] args) throws IOException{
	int[] mountainList = new int[10];
	String line = "";
	BufferedReader br = null;
	try {
		br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0;i<10;i++){
			line = br.readLine();
			mountainList[i] = Integer.parseInt(line);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	Arrays.sort(mountainList);
	for(int j=0;j>-3;j--){
		System.out.println(mountainList[j+9]);
	}
	}
}
