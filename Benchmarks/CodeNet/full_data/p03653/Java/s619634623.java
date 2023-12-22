import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int gold = sc.nextInt();
        int silver = sc.nextInt();
        int bronze = sc.nextInt();
        int n = gold + bronze + silver;
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            persons[i] = new Person(i, sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(persons, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p2.goldToSilver() - p1.goldToSilver();
            }
        });
        TreeSet<Person> bronzeStock = new TreeSet<Person>(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                if (p1.bronzeToGold() == p2.bronzeToGold()) {
                    return p1.idx - p2.idx;
                }
                return p1.bronzeToGold() - p2.bronzeToGold();
            }
        });
        TreeSet<Person> silverStock = new TreeSet<Person>(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                if (p2.bronzeToSilver() == p1.bronzeToSilver()) {
                    return p2.idx - p1.idx;
                }
                return p2.bronzeToSilver() - p1.bronzeToSilver();
            }
        });
        long goldCount = 0;
        long silverCount = 0;
        long bronzeCount = 0;
        for (int i = 0; i < gold + bronze; i++) {
            bronzeStock.add(persons[i]);
            bronzeCount += persons[i].bronze;
        }
        for (int i = gold + bronze; i < n; i++) {
            silverStock.add(persons[i]);
            silverCount += persons[i].silver;
        }
        for (int i = 0; i < gold; i++) {
            Person p = bronzeStock.pollFirst();
            goldCount += p.gold;
            bronzeCount -= p.bronze;
        }
        long max = goldCount + silverCount + bronzeCount;
        for (int i = gold + bronze - 1; i >= gold; i--) {
            Person p = persons[i];
            if (bronzeStock.contains(p)) {
                bronzeStock.remove(p);
                bronzeCount -= p.bronze;
            } else {
                goldCount -= p.gold;
                Person tmp = bronzeStock.pollFirst();
                bronzeCount -= tmp.bronze;
                goldCount += tmp.gold;
            }
            silverStock.add(p);
            silverCount += p.silver;
            Person tmp = silverStock.pollFirst();
            silverCount -= tmp.silver;
            bronzeCount += tmp.bronze;
            max = Math.max(max, goldCount + silverCount + bronzeCount);
        }
        System.out.println(max);
    }
    
    static class Person {
        int idx;
        int gold;
        int silver;
        int bronze;
        
        public Person(int idx, int gold, int silver, int bronze) {
            this.idx = idx;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }
        
        public String toString() {
            return idx + ":" + gold + ":" + silver + ":" + bronze;
        }
        
        public int goldToSilver() {
            return gold - silver;
        }
        
        public int bronzeToGold() {
            return bronze - gold;
        }
        
        public int bronzeToSilver() {
            return bronze - silver;
        }
        
        public int hashCode() {
            return idx;
        }
        
        public boolean equals(Object o) {
            Person p = (Person)o;
            return idx == p.idx;
        }
    }
}
