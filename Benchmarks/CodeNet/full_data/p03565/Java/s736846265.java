import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String Sd = scanner.nextLine();
		String T = scanner.nextLine();
		
		for (int i=0; i<Sd.length(); i++) {
			String SdCopy = Sd;
			
			boolean isFind = false;
			for (int ti=0; ti<T.length(); ti++) {
				if (Sd.length()-1 < i+ti) {
					break;
				}
				// System.out.println(String.format("i: %d, ti: %d", i, ti));
				
				char c = SdCopy.charAt(i+ti);
				char ct = T.charAt(ti);
				
				// System.out.println(String.format("c: %c, ct: %c", c, ct));
				
				if(c=='?') {
					StringBuilder sb = new StringBuilder(SdCopy);
					sb.setCharAt(i+ti,ct);
					SdCopy = sb.toString();
					// System.out.println(SdCopy);
				} else if(c==ct) {
				} else {
					break;
				}
				
				if (ti==T.length()-1) {
					isFind = true;
				}
			}
			
			if (isFind) {
				//正解を見つけた
				SdCopy = SdCopy.replace('?', 'a');
				System.out.println(SdCopy);
				return;
			}
		}
		
		System.out.println("UNRESTORABLE");
	}
}
