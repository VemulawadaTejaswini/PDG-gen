package test;

public class Index {
	public static void main(String[] args){
		if (Integer.parseInt(args[0])%Integer.parseInt(args[1]) == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
