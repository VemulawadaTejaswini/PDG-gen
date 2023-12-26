public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str = br.readLine();
		String[] inputData = str.split(" ");
		int data[] = new int[inputData.length];
		for(int i=0;i < data.length;i++){
			data[i] = Integer.parseInt(inputData[i]);
		}
		if(data[2]-data[4] < 0 | data[2]+data[4] > data[0] | data[3]-data[4] < 0 | data[3]+data[4] > data[1]){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}
