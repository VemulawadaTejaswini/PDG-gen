import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        main1(sc);
    }

    private static class KP {
    	char a;
    	long index;

    	KP(char a, long index) {
    		this.a = a;
    		this.index = index;
    	}

    	public String toString() {
    		return "{c:" + a + ", i" + index + "}";
    	}
    }

    public static void main1(Scanner sc) {

    	String base = sc.next();
    	String target = sc.next();

    	HashSet<Character> bs = new HashSet<Character>(50);
    	HashSet<Character> cs = new HashSet<Character>(50);

    	for (char c : base.toCharArray()) {
    		cs.add(c);
    	}

    	LinkedList<KP> l = new LinkedList<KP>();
    	int i = 0;
    	for (char c : base.toCharArray()) {
    		bs.add(c);
    		if (cs.contains(c)) {
    			l.add(new KP(c, i));
    		}
    		i++;
    	}

    	for (char c: target.toCharArray()) {
    		if (!bs.contains(c)) {
    			System.out.println("-1");
    			return;
    		}
    	}

    	int cnt = 0;
    	char[] tgt = target.toCharArray();
    	for (int k = 0; k < 100000; k++) {
    		for (KP ent: l) {
    			if (tgt[cnt] == ent.a) {
    				if (cnt < tgt.length -1 ) {
        				cnt++;
    				} else {
    					System.out.println((k) * base.length() + ent.index + 1);
    					return;
    				}
    			}
    		}
    	}

    }

	public static void maina(String[] args) throws Exception {
		String in2 = "contest\r\n" +
				"son";

		String in3 = "contest\r\n" +
				"programming";

		String in = "contest\r\n" +
				"sentence";

		Scanner sc = new Scanner(new ByteArrayInputStream(in.getBytes()));
		main1(sc);
	}
}