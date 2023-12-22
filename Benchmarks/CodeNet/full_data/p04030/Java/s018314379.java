import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sa = scanner.next();
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i<sa.length(); i++) {
            char c = sa.charAt(i);
            if(c=='B') {
                if (list.size() > 0) list.remove(list.size() - 1);
            }
            else list.add(c);
        }
        Character[] carray = list.toArray(new Character[list.size()]);
        for(char c: carray) System.out.print(c);
        System.out.println();

    }
}