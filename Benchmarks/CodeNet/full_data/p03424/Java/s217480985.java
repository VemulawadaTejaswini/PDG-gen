import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		int a = sc.nextInt();sc.nextLine();
                String b = sc.nextLine();
String p = "P";
String w = "W";
String g = "G";
String y = "Y";

int result1 = b.indexOf(p);
if (result1 != -1) {
    result1 = 1;
} else {
    result1 = 0;
}
int result2 = b.indexOf(w);
if (result2 != -1) {
    result2 = 1;
} else {
    result2 = 0;
}
int result3 = b.indexOf(g);
if (result3 != -1) {
    result3 = 1;
} else {
    result3 = 0;
}
int result4 = b.indexOf(y);
if (result4 != -1) {
    result4 = 1;
} else {
    result4 = 0;
}

int c = result1 + result2 + result3 + result4;
if(c == 3){
System.out.println("Three");
	}else if(c == 4){
System.out.println("Four");
}else{
System.out.println("ERROR");
}
}
}