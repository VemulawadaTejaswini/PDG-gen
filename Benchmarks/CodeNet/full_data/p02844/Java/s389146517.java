import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	String S = sc.next();
      	
      	int cnt = 0;
      	for(int i=0; i< 1000;  i++){
        	if(pinMatch(i,S)){
            	cnt++;
            }
        }
      	System.out.println(cnt);
        return;
	}
 	public static boolean pinMatch(int pin_int, String str){
      	String pin = String.valueOf(pin_int);
      	if (pin_int<100){
        	pin = "0" + String.valueOf(pin_int);
        }
      	if (pin_int<10){
        	pin = "00" + String.valueOf(pin_int);
        }

      	int str_len = str.length();
      	int pointer = 0;
      	for(int i = 0; i < str_len; i++){
          if(pin.charAt(pointer)==str.charAt(i)){
            pointer++;
          }
          if(pointer==3){
            return true;
          }
        }
		return false;
	}
}
