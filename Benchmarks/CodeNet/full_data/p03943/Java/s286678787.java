public class Main {
	public static void main(String[] args){
		int goukei = Integer.parseInt(args[0]);
		goukei = goukei + Integer.parseInt(args[1]);
		goukei = goukei + Integer.parseInt(args[2]);
		
		if(goukei % 3 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}