import java.util.Scanner;
class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			int x=0;
			int maxX=0;
			String S = sc.next();
			for(char c:S.toCharArray()){
				if(c=='I'){
					x++;
					maxX=Math.max(maxX, x);
				}else{
					x--;
				}
			}
			System.out.println(maxX);
		}
	}
}
