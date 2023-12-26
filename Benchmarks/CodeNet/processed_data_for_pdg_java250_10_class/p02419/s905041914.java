public class Main {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int count =0;
		String W="";
		String word ="";
		W = sc.next();
		while(true){
			word = sc.next();
			if(word.equals("END_OF_TEXT")){
				break;
			}
			if(W.equalsIgnoreCase(word)){
				count ++;
			}
		}
			System.out.println(count);
	}
}
