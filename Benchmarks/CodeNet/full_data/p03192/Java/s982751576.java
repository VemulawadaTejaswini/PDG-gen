import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String ret=kb.next();
		int count=0;
		for(int i=0;i<ret.length();i++){
			if(ret.charAt(i)=='2'){
				count++;
			}
		}
		System.out.println(count);
	}

}
