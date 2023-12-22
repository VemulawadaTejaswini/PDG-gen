package atcorder;

public class atcorder1 {
	public static void main(String[] args){
    int a = new java.util.Scanner(System.in).nextInt();
    int b = new java.util.Scanner(System.in).nextInt();

    System.out.println("a+b=15 であれば + を、 a×b=15 であれば * を、 どちらでもなければ x を出力してください。");
    String input = new java.util.Scanner(System.in).nextLine();

    int answer1 = a + b ;
    int answer2 = a * b ;

    if (input == "+") {
    	System.out.println("a + b = " + answer1 + "です。");
	}
    if(input == "*"){
    	System.out.println("a * b =" +  answer2 + "です。");
    }
    if(input == "x"){
    	System.out.println("a + b =" + answer1 + "であり、a * b =" + answer2 + "であるため、どちらも15ではありません。");
    }
	}
}