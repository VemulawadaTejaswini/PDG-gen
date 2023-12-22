import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> NM = numbers();

        List<List<Character>> numbers = Stream.iterate(NM.get(0), i -> i + 1)
                .limit(NM.get(1) - NM.get(0) + 1)
                .map(num -> toBite(num))
                .collect(Collectors.toList());

        int maxLength = 0;
        for(List<Character> list: numbers) {
            if(maxLength < list.size()) {
                maxLength = list.size();
            }
        }

        for(List<Character> list: numbers) {
            int size = maxLength - list.size();
            for(int i=0; i < size; i++) {
                list.add(0, '0');
            }
        }

        List<Character> answer = new ArrayList<>();
        for(int i=0; i<maxLength; i++) {
            int sum = 0;
            for(List<Character> chars: numbers) {
                sum += chars.get(i);
            }

            answer.add((char)(sum % 2));
        }

        int dec = Integer.parseInt(answer.stream().map(n -> (int)n + "").collect(Collectors.joining()), 2);

        System.out.println(dec);
    }

    public static List<Character> toBite(long num) {
        char[] bins = Long.toBinaryString(num).toCharArray();
        List<Character> chars = new ArrayList<>();
        for(char bin: bins) {
            chars.add(bin);
        }

        return chars;
    }

    public static List<Integer> numbers() {
        List<Integer> integers = new ArrayList<>();
        for(String item: getLine().split(" ")) {
            integers.add(toInt(item));
        }
        return integers;
    }

    public static void add(int[][] a, int[] n, int[] m) {
        for(int i = 0; i < n.length; i++) {

        }
    }

    public static int sum(int[][] a, int[] n, int[] m) {
        int sum = 0;
        for(int i=0; i<n.length; i++) {
            for(int j=0; j<m.length; j++) {
                if(n[i] == 1 && m[j] == 1) {
                    sum += a[i][j];
                }
            }
        }

        return sum;
    }

    public static int getInt() {
        return scan.nextInt();
    }

    public static String getLine() {
        return scan.nextLine();
    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }

    public static long toLong(String str) {
        return Long.parseLong(str);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(int num) {
        print("" + num);
    }

    public static void print(long num) {
        print("" + num);
    }
}
