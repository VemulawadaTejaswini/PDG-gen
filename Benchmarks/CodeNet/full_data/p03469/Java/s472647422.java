import java.util.Scanner;
public class Main {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	String output = input.replace("2017","2018");
	System.out.println(output);
    }
}
