import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int kekka = 1;
        String s=sc.next();
switch (s){
  case "SUN":
    kekka=7;
    break;
  case "MON":
    kekka=6;
    break;
  case "TUE":
    kekka=5;
    break;
  case "WED":
    kekka=4;
    break;
  case "THU":
    kekka=3;
    break;
  case "FRI":
    kekka=2;
    break;
}
		System.out.println(kekka);      	
	}
}