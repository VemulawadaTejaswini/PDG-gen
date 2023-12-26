public class Main {
	public static void main(String[] args){
		int[] input = new int[10];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10; i++){
			input[i]=s.nextInt();
		}
		Arrays.sort(input);
		int i=input.length-1;
		while(i>input.length-4){
			System.out.println(input[i]);
			i--;
		}			
	}
}
