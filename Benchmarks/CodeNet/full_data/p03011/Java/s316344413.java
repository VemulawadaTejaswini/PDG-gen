import java.util.Scanner;

public class Main {
public static void main(String[]args) {
	Scanner tc = new Scanner (System.in);
	int P,Q,R, soma=0, soma2=0,soma3=0;
	P= tc.nextInt();
	Q= tc.nextInt();
	R=tc.nextInt();
	soma= P+Q;
	soma2= P+R;
	soma3= Q+R;
	if(soma<soma2&& soma<soma3) {
		System.out.println(soma);
	}
	if(soma2<soma&& soma2<soma3) {
		System.out.println(soma2);
	}
	if(soma3<soma2&& soma3<soma) {
		System.out.println(soma3);
	}
	if(soma==soma2) {
		System.out.println(soma);
		
	}if(soma==soma3) {
		System.out.println(soma);
	}if(soma3==soma2) {
		System.out.println(soma3);
	}

}
}
