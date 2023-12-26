public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int longest=0;
		int sum=0;
		for(int i=0;i<N;i++){
			int length = Integer.parseInt(sc.next());
			if(length > longest) longest = length;
			sum += length;
		}
		int other_sum_length = sum - longest;
		if(other_sum_length > longest){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
