public class Main {

    public static void main(String[] args) {
int a = 1;
int b = 2;
int c = 3;

a = swap(b, b=a);
a = swap(c, c=a);

System.out.println(c);
    }

    public static int swap(int... args) {
        return args[0];
    }
}
