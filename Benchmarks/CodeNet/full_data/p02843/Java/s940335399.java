import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int check = 0;
		if(n>=100||n<=105){
		    check = 1;
		}if(n>=200||n<=210){
		    check = 1;
		}if(n>=300||n<=315){
		    check = 1;
		}if(n>=400||n<=420){
		    check = 1;
		}if(n>=500||n<=525){
		    check = 1;
		}if(n>=600||n<=625){
		    check = 1;
		}
		System.out.println(check);
    }
}