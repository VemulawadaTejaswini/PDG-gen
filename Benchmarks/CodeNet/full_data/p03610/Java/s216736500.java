import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
	int i;
	for(i=0;i<s.length();i+=2)
            System.out.print(s.charAt(i));

	System.out.println("");
    }
}


