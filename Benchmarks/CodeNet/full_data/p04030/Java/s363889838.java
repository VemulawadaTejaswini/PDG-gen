import java.util.Scanner;
import java.util.ArrayList;

class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i;
        ArrayList<Character> al = new ArrayList<Character>();
        ArrayList<Character> il = new ArrayList<Character>();
        char c;

        for (char cc : s.toCharArray())
            al.add(cc);
        for (i = 0; i < al.size(); i++) {
            c = al.get(i);
            switch(c) {
                case '0':
                case '1':
                    il.add(c); break;
                default:
                    if ((il.size() > 0))
                        il.remove(il.size()-1);
                    break;
            }
        }
        for (i = 0; i < il.size(); i++)
            System.out.printf("%c", il.get(i));
        System.out.printf("\n");
    }
}
