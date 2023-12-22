import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Cubes c = new Cubes(s);
		System.out.println(c.getAns());
	}
}
class Cubes{
	char[] ary;
	Cubes(String s){
		ary = s.toCharArray();
	}
	int getAns(){
		int count0 = 0;
		int count1 = 0;
		for(char c : ary){
			if(c == '0'){
				count0++;
			}else{
				count1++;
			}
		}
		return Math.min(count0, count1) * 2;
	}
}
