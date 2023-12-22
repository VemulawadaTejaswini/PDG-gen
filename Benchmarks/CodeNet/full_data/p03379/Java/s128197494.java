import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		for(int n=0;n<N;n++){
			arr.add(sc.nextInt());
		}
		ArrayList<Integer> sarr = new ArrayList<>(arr);

		Collections.sort(sarr);

		for(int n=0;n<N;n++){
			
			if(arr.get(n)==sarr.get(N/2-1)){
				System.out.println(sarr.get(N/2));
			}
			else if(arr.get(n)==sarr.get(N/2)){
				System.out.println(sarr.get(N/2-1));
			}
			else if(arr.get(n) < sarr.get(N/2-1)){
				System.out.println(sarr.get(N/2));
			}
			else if(arr.get(n) > sarr.get(n/2)){
				System.out.println(sarr.get(N/2-1));
			}
		}
	}
}