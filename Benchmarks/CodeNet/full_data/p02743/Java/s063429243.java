import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long b = sc.nextLong();
        Long c = sc.nextLong();
        if(c>a+b && 4*a*b < (c-a-b)*(c-a-b)){System.out.println("Yes");}
        else{System.out.println("No");}
	}
}
