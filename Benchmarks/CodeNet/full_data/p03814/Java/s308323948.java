import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char [] s = sc.next().toCharArray();
		int i, j;
		for(i = 0; s[i] != 'A'; i++){}
		for(j = s.length - 1; s[j] != 'Z'; j--){}
		System.out.println((j - i + 1));
	}
}
