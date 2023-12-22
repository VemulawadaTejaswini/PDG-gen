
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static boolean honban = true;

    public static void main(String[] args) throws Exception {
    	if (honban) {
            Scanner sc = new Scanner(System.in);
            mainInternal(sc);

    	} else {
    		String[] testInputs = {
    				"contest\r\n" +
    				"son",

    				"contest\r\n" +
    				"programming",

    				"contest\r\n" +
    				"sentence"
    		};

    		for (String testInput : testInputs) {
    			Scanner sc = new Scanner(new ByteArrayInputStream(testInput.getBytes()));
    			mainInternal(sc);
    		}
    	}
    }

    public static void mainInternal(Scanner sc) {

    	char[] argS = sc.next().toCharArray();
    	char[] argT = sc.next().toCharArray();

    	// argSの各文字が、配列のどの位置に出てくるかを保存しておく
    	Map<Character, TreeSet<Integer>> charIndexMap = new HashMap<Character, TreeSet<Integer>>();

    	for (int i = 0; i < argS.length; i++) {
    		char c = argS[i];
    		TreeSet<Integer> t = charIndexMap.get(c);

    		if (t == null) {
    			t = new TreeSet<Integer>();
    			charIndexMap.put(c, t);
    		}

    		t.add(i);
    	}

    	// 文字列連結したS'全体において、どのインデックスにいるか
    	long fullGlobalIndex = 1;

    	// 直前のS内のインデックス（S'じゃなくて、S）
    	int prevLocalIndex = -1;

    	for (char c : argT) {

    		// 文字がどの位置に出てくるか？（同じ文字でも複数の個所に出てくる可能性がある）
    		TreeSet<Integer> charIndex = charIndexMap.get(c);

    		if (charIndex == null) {
    			System.out.println("-1");
    			return;
    		}

    		Integer nextLocalIndex = charIndex.higher(prevLocalIndex);

    		if (nextLocalIndex == null) {
    			nextLocalIndex = charIndex.first();

    			fullGlobalIndex += argS.length - prevLocalIndex + nextLocalIndex;
    			prevLocalIndex = nextLocalIndex;

    		} else {
    			if (prevLocalIndex < 0) {
    				prevLocalIndex = 0;
    			}
    			fullGlobalIndex += nextLocalIndex - prevLocalIndex;
    			prevLocalIndex = nextLocalIndex;
    		}
    	}

    	System.out.println(fullGlobalIndex);
    }
}