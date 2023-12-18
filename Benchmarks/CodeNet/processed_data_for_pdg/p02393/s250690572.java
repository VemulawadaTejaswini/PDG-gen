public class Main {
	public static void main(String[] args)throws IOException{
		int[] outputData = new int[3];
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String inputValue = br.readLine();
		String[] inputData = inputValue.split(" ");
		for(int i = 0; i < inputData.length; i++){
			outputData[i] = Integer.parseInt(inputData[i]);
		}
		Arrays.sort(outputData);
		System.out.println
			(outputData[0] + " " + outputData[1] + " " + outputData[2]);
	}
}
