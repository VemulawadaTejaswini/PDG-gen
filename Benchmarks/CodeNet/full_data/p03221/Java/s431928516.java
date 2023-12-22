import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Map<Integer, Integer> h = new HashMap<>();
        List<City> city = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int Pref = Integer.parseInt(sc.next());
            int Year = Integer.parseInt(sc.next());
            city.add(new City(i, Pref, Year));
            if (h.containsKey(Pref)) {
                h.put(Pref, h.get(Pref) + 1);
            } else {
                h.put(Pref, 1);
            }
        }
        sc.close();
        city.sort((o1, o2) -> Integer.compare(o2.Year, o1.Year));
        for (City c : city) {
            c.Num = h.get(c.Pref);
            h.put(c.Pref, h.get(c.Pref) - 1);
        }
        city.sort((o1, o2) -> Integer.compare(o1.ID, o2.ID));
        for (City c : city) {
            System.out.printf("%06d%06d\n", c.Pref, c.Num);
        }
    }

    static class City {
        int ID;
        int Pref;
        int Year;
        int Num;

        City(int ID, int Pref, int Year) {
            this.ID = ID;
            this.Pref = Pref;
            this.Year = Year;
            this.Num = 0;
        }
    }
}