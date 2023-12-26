public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
		String[] point = br.readLine().split(" ");
			int midTest = Integer.parseInt(point[0]);
			int lastTest = Integer.parseInt(point[1]);
			int retryTest = Integer.parseInt(point[2]);
			int totPoint = midTest + lastTest;
			if (midTest == -1 && lastTest == -1 && retryTest == -1)
				break;
			else if (midTest == -1 || lastTest == -1 || totPoint < 30)
				System.out.println("F");
			else if (totPoint >= 80)
				System.out.println("A");
			else if (totPoint < 80 && totPoint >= 65)
				System.out.println("B");
			else if (totPoint < 65 && totPoint >= 50 || retryTest >= 50)
				System.out.println("C");
			else
				System.out.println("D");
	}while(true);
}
}
