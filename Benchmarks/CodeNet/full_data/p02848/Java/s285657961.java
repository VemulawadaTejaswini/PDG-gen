import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String kekka = "";
        int n=sc.nextInt();
        String s=sc.next();
		char[] c = s.toCharArray();
      	
      	int len = s.length();
      	for(int i=0;i<len;i++){
        	if((int)c[i]+n>90){
            	kekka = kekka + Character.toString((char)((int)c[i]+n-26));
            }else{
            	kekka = kekka + Character.toString((char)((int)c[i]+n));
            }
        }
		System.out.println(kekka);      	
	}
}