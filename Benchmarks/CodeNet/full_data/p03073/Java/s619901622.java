import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tiles t = new Tiles(sc.nextLine());
		System.out.println(t.check101());
	}

}
class Tiles{
	char[] chars;
	Tiles(String s){
		chars = s.toCharArray();
//		System.out.println(chars.length);

	}
	int check101(){
		char c = '1';
		int count =0;
//		System.out.println(chars.length);
		for(int i = 0; i < chars.length; i++) {
			if(chars[i] == c) {
				count++;
//				System.out.println(count);
			}
			if(c == '1') {
				c = '0';
			}else {
				c = '1';
			}
//			System.out.println(c);
		}
		if(count <= chars.length / 2) {
			return count;
		}else {
			return chars.length -count;
		}
	}
}
