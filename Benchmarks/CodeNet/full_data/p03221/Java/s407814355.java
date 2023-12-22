import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        HashMap<Integer, ArrayList<City>> map = new HashMap<Integer, ArrayList<City>>();
        ArrayList<City> idlist = new ArrayList<City>();

        for (int i = 0; i < M; i++) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            City c = new City(p, y);
            map.putIfAbsent(p, new ArrayList<City>());
            map.get(p).add(c);
            idlist.add(c);
        }
        for (int i = 0; i <= N; i++) {
            if (map.containsKey(i)) {
                ArrayList<City> list = map.get(i);
                list.sort(Comparator.comparing(City::getBirth));
                for (int k = 0; k < list.size(); k++) {
                    list.get(k).code = String.format("%06d%06d", i, k + 1);
                }
            }
        }
        for (City c : idlist) {
            System.out.println(c.code);
        }
    }
}

class City {
    int birth;
    int prefecture;
    String code;

    City(int p, int b) {
        birth = b;
        prefecture = p;
    }

    /**
     * @return the birth
     */
    public int getBirth() {
        return birth;
    }
}