import java.util.Scanner;

public class Main{
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	String S =sc.next();
	int L = S.length();
	String str = S.substring(2,L-1);

//	System.out.println(L+", "+str);
//	System.out.println(str.indexOf("C"));
//	System.out.println(str.lastIndexOf("C"));

	boolean a = false , b = false, c = false;
	boolean d= false;

//	System.out.println(S.substring(S.indexOf("C")+1)+" "+S.substring(S.indexOf("C")+1).toLowerCase());

	if (S.indexOf("A") == 0){
		a = true;
	}

	if (a == true){
		if(str.contains("C")){
			if (str.indexOf("C") == str.lastIndexOf("C")){
				b = true;
			}
		}
	}

	if (b == true){
		if(S.substring(S.indexOf("C")+1).equals(S.substring(S.indexOf("C")+1).toLowerCase())){
			d =true;
			if(S.substring(1, S.indexOf("C")).equals( S.substring(1, S.indexOf("C")).toLowerCase())){
				c =true;

			}
		}
	}

	if (c== true){
		System.out.println("AC");
	}
	else{
		System.out.println("WA");
	}



//	System.out.println(a+" "+b+" "+c+" "+d);


	}
}