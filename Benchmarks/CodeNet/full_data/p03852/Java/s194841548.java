import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAr(0);
		if( (a == 'a')||(a=='i')||(a=='u')||(a=='e')||(a=='o')){
			System.out.println("vowel");
		}else{
			System.out.println("consonent");
		}
	return;
	}
}