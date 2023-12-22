
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        main1(sc);
    }

    public static void main1(Scanner sc) {

    	char[] base = sc.next().toCharArray();
    	char[] target = sc.next().toCharArray();

    	Map<Character, TreeSet<Integer>> posIndex = new HashMap<Character, TreeSet<Integer>>();

    	for (int i = 0; i < base.length; i++) {
    		char c = base[i];
    		TreeSet<Integer> t = posIndex.get(c);

    		if (t == null) {
    			t = new TreeSet<Integer>();
    			posIndex.put(c, t);
    		}

    		t.add(i);
    	}

    	long pos = 1;
    	int prevPos = -1;

    	for (int i = 0; i < target.length; i++) {
    		char c = target[i];

    		TreeSet<Integer> idx = posIndex.get(c);
    		if (idx == null) {
    			System.out.println("-1");
    			return;
    		}

    		Integer next = idx.higher(prevPos);

    		if (next == null) {
    			next = idx.first();

    			pos += base.length - 1 - prevPos + next + 1;
    			prevPos = next;

    		} else {
    			if (prevPos < 0) {
    				prevPos = 0;
    			}
    			pos += next - prevPos;
    			prevPos = next;
    		}
    	}

    	System.out.println(pos);

    }
	public static void maina(String[] args) throws Exception {
		String in1 = "contest\r\n" +
				"son";

		String in2 = "contest\r\n" +
				"programming";

		String in3 = "contest\r\n" +
				"sentence";

		Scanner sc = new Scanner(new ByteArrayInputStream(in1.getBytes()));
		main1(sc);

		sc = new Scanner(new ByteArrayInputStream(in2.getBytes()));
		main1(sc);

		sc = new Scanner(new ByteArrayInputStream(in3.getBytes()));
		main1(sc);
	}
}