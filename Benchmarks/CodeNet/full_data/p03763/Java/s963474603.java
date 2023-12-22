import java.util.*;

public final class Main {


    static int N;

    static int[] array;

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        array = new int['z' - ('a' -1)];

        N = s.nextInt();

        String first[] = s.next().split("");

        for (int j = 0; j < first.length; j++) {

            char k  = first[j].charAt(0);

            array[k - 'a']++;

        }
        for (int i = 1; i < N; i++) {

            int[] now = new int[array.length];

            String line[] =  s.next().split("");

            for (int j = 0; j < line.length; j++) {

                char k  = line[j].charAt(0);

                if (array[k-'a'] > 0) {

                    array[k-'a']--;

                    now[k-'a']++;
                }
            }

            array = now;
        }

        for (int i = 0; i < array.length; i++) {

            char k = (char) (i+ 'a');

            for (int j = 0; j < array[i]; j++) {

                System.out.print(k);
            }
        }
    }




}