import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
        for(int i = 0; i<2; i++){
            if(!s1.charAt((i+2)%3).equals(s2.charAt(i))){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
	}
}