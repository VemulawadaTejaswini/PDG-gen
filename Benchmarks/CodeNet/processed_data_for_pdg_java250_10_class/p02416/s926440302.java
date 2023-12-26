public class Main {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int sum = 0;
			String num = br.readLine();
			if (num.equals("0")){
				break;
			}
			for (int i = 0;i < num.length();i++){
				char number = num.charAt(i);
				int numberCal = Character.getNumericValue(number);
				sum += numberCal;
			}
			System.out.println(sum);
		}
	}
}
