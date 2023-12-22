public class Main {
	public int Candies(int number){
		int start =1;
		int end = number;
		int slac =1;
		int sum =0;
		int temp = start;
		for (int i=1; i<=end; i++){
			sum += temp;
			temp += slac; 
		}
		System.out.println(sum);
		return sum;
		
	}

	public static void main(String[] args) {
		Main a = new Main();
		a.Candies(5);
	}

}