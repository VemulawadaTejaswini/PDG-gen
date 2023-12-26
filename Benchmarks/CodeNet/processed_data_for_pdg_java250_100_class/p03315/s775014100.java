public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = 0;
		for(int i = 0; i < s.length(); i++){
		    if(s.charAt(i) == '+'){
		        result++;
		    }else{
		        result--;
		    }
		}
		System.out.println(result);
	}
}
