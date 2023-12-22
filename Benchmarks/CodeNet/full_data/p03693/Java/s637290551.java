import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        int r = dane.nextInt();
        if(r>9) {
            System.out.println("Nie mozna wpisac wiecej niż 9");
        }
        int g = dane.nextInt();
        if(g>9) {
            System.out.println("Nie mozna wpisac wiecej niż 9");
        }
        int b = dane.nextInt();
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
