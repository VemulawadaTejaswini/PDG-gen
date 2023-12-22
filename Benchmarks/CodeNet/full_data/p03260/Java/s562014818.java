import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        if (Integer.parseInt(line[0]) % 2 == 0 || Integer.parseInt(line[1]) % 2 == 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}