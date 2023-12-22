import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Tango {
    Tango(String name,int count) {
        this.name = name;
        this.count = count;
    }
    String name;
    int count;
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Tango> lists = new ArrayList<>();
        //mapに入れる
        HashMap<String, Tango> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            if (map.containsKey(s)) {
                Tango t = (Tango) map.get(s);
                t.count++;
            } else {
                Tango t = new Tango(s, 1);
                map.put(s, t);
                lists.add(t);
            }
        }
        lists.sort(new Comparator<Tango>() {
            public int compare(Tango t1, Tango t2){
                if (t1.count == t2.count) {
                    return t1.name.compareTo(t2.name);
                }
                else {
                    if (t1.count < t2.count)
                        return 1;
                    else
                        return -1;
                }
            }
        });
        int cnt = lists.get(0).count;
        for (Tango t : lists) {
            if (cnt != t.count)
                break;
            System.out.println(t.name);
        }
    }
}