import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] eraser_cut = s.split("eraser");
		String[] erase_cut;
		String[] dreamer_cut;
		boolean result = true;
		for(int i = 0; i < eraser_cut.length; i++) {
			erase_cut = eraser_cut[i].split("erase");
			for(int j = 0; j < erase_cut.length; j++) {
				dreamer_cut = erase_cut[j].split("dreamer");
				for(int k = 0; k < dreamer_cut.length; k++) {
					if(!(dreamer_cut[k].equals("dream") ||
						dreamer_cut[k].equals("")))
						result = false;
				}
			}
		}
		System.out.println(result ? "YES" : "NO");
	}
}