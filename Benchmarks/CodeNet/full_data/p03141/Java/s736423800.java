import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Dish {
	long t;
	long a;
}
public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int n = Integer.parseInt(line);
        List<Dish> t_list = new ArrayList<Dish>();
        List<Dish> a_list = new ArrayList<Dish>();
        for (int i = 0 ; i < n ; i++) {
            line = in.nextLine();
            String[] split = line.trim().split("\\s+");
            Dish d = new Dish();
            d.t = Integer.parseInt(split[0]);
            d.a = Integer.parseInt(split[1]);
            t_list.add(d);
            a_list.add(d);
        }
        Collections.sort(t_list, new Comparator<Dish>(){
            @Override
            public int compare(Dish d1, Dish d2) {
        		if ( (d1.t + d1.a) > (d2.t + d2.a) ) {
        			return -1;
        		} else if ((d1.t + d1.a) == (d2.t + d2.a)) {
        			if (d1.t > d2.t) {
        				return -1;
        			} else if (d1.t == d2.t) {
        				return 0;
        			} else {
        				return 1;
        			}
        		} else {
        			return 1;
        		}
        	}
        });
        Collections.sort(a_list, new Comparator<Dish>(){
            @Override
            public int compare(Dish d1, Dish d2) {
        		if ( (d1.t + d1.a) > (d2.t + d2.a) ) {
        			return -1;
        		} else if ((d1.t + d1.a) == (d2.t + d2.a)) {
        			if (d1.a > d2.a) {
        				return -1;
        			} else if (d1.a == d2.a) {
        				return 0;
        			} else {
        				return 1;
        			}
        		} else {
        			return 1;
        		}
        	}
        });

        in.close();

        boolean t_turn = true;
        long ans = 0;
        while (t_list.size() > 0) {
        	if (t_turn) {
        		Dish d = t_list.remove(0);
        		a_list.remove(d);
        		ans += d.t;
        		t_turn = !t_turn;
        	} else {
        		Dish d = a_list.remove(0);
        		t_list.remove(d);
        		ans = ans - d.a;
        		t_turn = !t_turn;
        	}
        }
        System.out.println(ans);
    }
}