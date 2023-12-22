import java.util.Scanner;
        import java.util.*;

/**
 * Created by Admin on 2017-06-04.
 */
class Main {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        Integer r = Integer.parseInt(dane.next());
        if(r>9) {
            System.out.println("Nie mozna wpisac wiecej niż 9");
        }
        Integer g = Integer.parseInt(dane.next());
        if(g>9) {
            System.out.println("Nie mozna wpisac wiecej niż 9");
        }
        Integer b = Integer.parseInt(dane.next());
        if(b>9) {
            System.out.println("Nie mozna wpisac wiecej niż 9");
        }
        int a = (r * 100  + g * 10  + b);
        if (a % 4 == 0) {
            System.out.println(a + " " + " jest podzielna przez 4");
        }
        else {
            System.out.println(a +" " + "nie jest podzielna przez 4");
        }
    }
}