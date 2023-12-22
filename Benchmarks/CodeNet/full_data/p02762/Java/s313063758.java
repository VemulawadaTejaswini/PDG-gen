import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    List<Person> friends = new ArrayList<Person>();
    List<Person> blocks = new ArrayList<Person>();
    int name;

    Person(int name) {
        this.name = name;
    }

    public void addFriends(Person p) {
        this.friends.add(p);
    }

    public void addBlocks(Person p) {
        this.blocks.add(p);
    }

    public List<Person> getFriends() {
        return this.friends;
    }

    public List<Person> getBlocks() {
        return this.blocks;
    }

    public List<Person> traverseFriends(List<Person> donePerson) {
        donePerson.add(this);
        for (Person person : this.friends) {
            if (donePerson.contains(person)) continue;
            donePerson = person.traverseFriends(donePerson);
        }
        return donePerson;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        List<Person> ps = new ArrayList<Person>();
        for (int i = 0; i < n; i++) {
            ps.add(new Person(i));
        }

        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            ps.get(a - 1).addFriends(ps.get(b - 1));
            ps.get(b - 1).addFriends(ps.get(a - 1));
        }

        for (int i = 0; i < k; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            ps.get(a - 1).addBlocks(ps.get(b - 1));
            ps.get(b - 1).addBlocks(ps.get(a - 1));
        }

        for (int i = 0; i < n; i++) {
            List<Person> cand = ps.get(i).traverseFriends(new ArrayList<Person>());
            int total = 0;
            for (Person person : cand) {
                if (ps.get(i).equals(person) ||
                    ps.get(i).getFriends().contains(person) ||
                    ps.get(i).getBlocks().contains(person)) {

                    } else {
                        total++;
                    }
            }
            System.out.print(total + " ");
        }
    }
}
