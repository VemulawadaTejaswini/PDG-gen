public class Main {
	public static void main(String[] args) throws IOException  {
		String[] arrStrNumbers = (new BufferedReader(new InputStreamReader(System.in)).readLine()).split(" ");
		int[] arrNumbers = new int[arrStrNumbers.length];
		for(int i = 0; i < arrNumbers.length; i++) arrNumbers[i] = Integer.parseInt(arrStrNumbers[i]);
		for(int i = 0; i < arrNumbers.length; i++) {
			for(int j = i; j < arrNumbers.length; j++) {
				if(arrNumbers[j] < arrNumbers[i]) {
					int tmp = arrNumbers[i];
					arrNumbers[i] = arrNumbers[j];
					arrNumbers[j] = tmp;
				}
			}
		}
		System.out.println(arrNumbers[0] + " " + arrNumbers[1] + " " + arrNumbers[2]);
	}
}
