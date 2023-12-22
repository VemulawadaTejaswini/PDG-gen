import java.util.Scanner;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        main3(sc);
    }

    public static class SortedList {
        TreeMap<Float, Float> tm = new TreeMap<Float, Float>();

        public void add(Float x) {
        	Float count = tm.get(x);
        	if (count == null) {
        		count = (float)1;
        	} else {
        		count++;
        	}
        	tm.put(x, count);
        }

        public Float pollFirst() {
        	Float val = tm.firstEntry().getKey();
        	Float num = tm.firstEntry().getValue();

        	if (num == 1) {
        		tm.pollFirstEntry();
        	} else {
        		tm.put(val, num--);
        	}

        	return val;
        }

        public int getSize() {
        	return tm.size();
        }
    }

    public static void main3(Scanner sc) {

    	int N = sc.nextInt();
        SortedList sl = new SortedList();

        for (int i = 0; i < N; i++) {
        	Float x = sc.nextFloat();
        	sl.add(x);
        }

        while(sl.getSize() > 1) {
        	Float a = sl.pollFirst();
        	Float b = sl.pollFirst();

        	sl.add((a+b)/2);
        }

        System.out.println(sl.pollFirst());
    }
}