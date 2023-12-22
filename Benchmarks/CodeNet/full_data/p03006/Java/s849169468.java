import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Person> per = new ArrayList<>();
        for (int i=0; i<N; i++){
            per.add(new Person(sc.nextInt(),sc.nextInt()));
        }
        sc.close();

        int count=1;

        for (int i=0; i<N; i++){
            per.sort(Comparator.comparing(Person::getX).reversed());
            int x0 = per.get(i).getX();
            int y0 = per.get(i).getY();
            for (int j=1; j<per.size()-1; j++){

            }
        }
        System.out.println(count);
    }
}

class Person{
    int x;
    int y;
    int z;

    public Person(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}