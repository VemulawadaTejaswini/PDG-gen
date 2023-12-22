import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Person> al = new ArrayList<>();
        for (int i=1; i<=N;i++){
            al.add(new Person(i, sc.next(), sc.nextInt()));
        }
        al.sort(Comparator.comparing(Person::getNum).reversed());
        al.sort(Comparator.comparing(Person::getName));
        for (int i=0; i<N; i++){
            System.out.println(al.get(i).getId());
        }
    }
}
class Person{
    int id;
    String name;
    int num;
    public Person(int id, String name, int num){
        this.id = id;
        this.name = name;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
}
