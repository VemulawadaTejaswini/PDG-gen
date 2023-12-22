import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int sl = s.length();
		int tl = t.length();
		boolean b = false;
		if(sl < tl){
			System.out.println("UNRESTORABLE");
		}else if(sl == tl){
			if(contains(s,t,tl)){
				System.out.println(t);
			}else{
				System.out.println("UNRESTORABLE");
			}
		}else{
			String front = s.substring(0, sl-tl);
			String subS = s.substring(sl-tl);
			b= contains(subS, t, tl);
			if(b){
				s = front.replaceAll("\\?", "a") + t;
			}
			for(int i = sl; i >= tl && !b;i--){
				front = s.substring(0, i-tl);
				subS = s.substring(i - tl, i);
				String back = s.substring(sl-tl);
				b = contains(subS, t, tl);
				if(b){
					s = front.replaceAll("\\?", "a") + t + back.replaceAll("\\?", "a");
					//break;
				}
			}
			if(b){
				System.out.println(s);
			}else{
				System.out.println("UNRESTORABLE");
			}
		}
		sc.close();
	}

	private static boolean contains(String subS, String t, int tl){
		boolean b = true;
		for(int l = 0; l < tl && b; l++){
			b &= subS.charAt(l) =='?' || subS.charAt(l) == t.charAt(l);
		}

		return b;
	}
}