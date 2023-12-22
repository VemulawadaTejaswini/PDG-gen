import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	/**
	 * Main method.
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		Map<String, Integer> nameMap = new HashMap<>();
 		for (int i = 0; i < N; i++) {
			String nameFirst = s.next().substring(0, 1);
			if (nameFirst.matches("[MARCH]")) {
				if (nameMap.containsKey(nameFirst)) {
					nameMap.put(nameFirst, nameMap.get(nameFirst) + 1);
				} else {
					nameMap.put(nameFirst, 1);
				}
			}
		}
		
 		Set<String> src = new HashSet<String>() {{
 			for (String nameFirst : nameMap.keySet()) {
 				add(nameFirst);
 			}
 		}};

 		long answer = 0;
 		
 		//System.out.println(combination(src, 3));
 		for (Set<String> setTmp : combination(src, 3)) {
 			long answerTmp = 1;
 			for (String nameFirst : setTmp) {
 				answerTmp *= nameMap.get(nameFirst);
 			}
 			answer += answerTmp;
 		}
 		
 		System.out.println(answer);
 
	}
	
	private enum Operation {add, remove};
    private static<T> Set<T> apply(Set<T> src, Operation operation, T item) {
        Set<T> result = new HashSet<T>(src);
        if (Operation.add == operation) result.add(item);
        if (Operation.remove == operation) result.remove(item);
        return result;
    }

    private static<T> Set<Set<T>> _combination(Set<T> selected, int depth, Set<T> pool) {
        if (depth == 0) return apply(new HashSet<>(), Operation.add, selected); 
        Set<Set<T>> result = new HashSet<Set<T>>();
        for (T item : pool) {
            result.addAll(
                    _combination(
                            apply(selected, Operation.add, item),
                            depth - 1, 
                            apply(pool, Operation.remove, item) 
                    )
            );
        }
        return result;
    }
    public static<T> Set<Set<T>> combination(Set<T> src, int k) {return _combination(new HashSet<T>(), k, src);}
}