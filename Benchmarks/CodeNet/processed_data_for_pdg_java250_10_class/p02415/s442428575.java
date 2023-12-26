public class Main {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String W = "";
		String R = "";
		for(int i = 0; i<word.length(); i++){
			W = word.substring(i, i + 1);
			if(W.equals(W.toLowerCase())){
				W =W.toUpperCase();
			}else if (W.equals(W.toUpperCase())){
				W = W.toLowerCase();
			}
			R += W;
		}
		System.out.println(R);
	}
}
