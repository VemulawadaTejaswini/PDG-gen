package test;

public class Index {
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		int numOfPeople = Integer.parseInt(args[1]);
		
		if (num%numOfPeople == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
