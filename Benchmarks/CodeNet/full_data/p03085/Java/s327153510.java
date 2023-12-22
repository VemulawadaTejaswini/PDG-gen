import java.util.Scanner;


public class Sample001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(input.equals("A")){
            System.out.println("T");
        }else if(input.equals("T")){
            System.out.println("A");
        }else if(input.equals("C")){
            System.out.println("G");
        }else if(input.equals("G")){
            System.out.println("C");
        }
	}

}
