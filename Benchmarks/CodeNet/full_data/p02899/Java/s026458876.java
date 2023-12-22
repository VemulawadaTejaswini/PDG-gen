import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static class Elm {
        final int index;
        final int n;

        public Elm(int index, int n)
        {
            this.index = index;
            this.n = n;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Elm> xs = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            xs.add(new Elm(i + 1, scanner.nextInt()));
        }
        xs.sort(Comparator.comparingInt(a -> a.n));
        boolean isFirst = true;
        for (Elm elm : xs) {
            if (isFirst) {
                isFirst = false;
            }
            else {
                System.out.print(" ");
            }
            System.out.print(elm.index);
        }
        System.out.println();
    }
}

