import java.io.*;
import java.util.*;

public class Main{
	public static void main (String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt() - 1;
		int b = cin.nextInt();
		for(int i=1;i<11;i++) {
		    if(a * i + 1 >= b) {
		        System.out.println(i);
		        return;
		    }
		}
	}
}