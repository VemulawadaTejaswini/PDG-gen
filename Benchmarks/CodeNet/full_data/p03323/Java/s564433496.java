import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		if(Integer.parseInt(sc.next()) < 9 && Integer.parseInt(sc.next()) < 9) ou.println("Yay!");
		else ou.println(":(");
		ou.flush();
	}
}