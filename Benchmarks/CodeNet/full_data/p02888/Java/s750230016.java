import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static class Set {
        private ArrayList<Integer> ValuesOrigin = new ArrayList<>();
        Set(int a, int b, int c) {
            this.ValuesOrigin.add(a);
            this.ValuesOrigin.add(b);
            this.ValuesOrigin.add(c);
        }

        public boolean isSamePattern(int a, int b, int c) {
            ArrayList<Integer> Values =(ArrayList<Integer>) ValuesOrigin.clone();

            if (Values.contains(a)) Values.remove(Values.indexOf(a));
            else return false;

            if (Values.contains(b)) Values.remove(Values.indexOf(b));
            else return false;

            if (Values.contains(c)) Values.remove(Values.indexOf(c));
            else return false;

            return true;

        }
    }

    public static void main(String[] args) {
        readLine();
        String Input = readLine();
        ArrayList<Integer> Values = new ArrayList<>();
        for (String s : Input.split(" ")) Values.add(Integer.parseInt(s));

        ArrayList<Set> TestedPatterns = new ArrayList<>();
        int result = 0;
        
        for (int index1 = 0; index1 < Values.size(); index1++) {
            for (int index2 = 0; index2 < Values.size(); index2++) {
                for (int index3 = 0; index3 < Values.size(); index3++) {
                    if (index1 == index2 || index2 == index3 || index1 == index3) continue;
                    boolean flag = false;
                    for (Set s : TestedPatterns) if (s.isSamePattern(index1, index2, index3)) flag = true;
                    if (flag) continue;

                    TestedPatterns.add(new Set(index1, index2, index3));

                    int a = Values.get(index1);
                    int b = Values.get(index2);
                    int c = Values.get(index3);


                    if (a<b+c && b<c+a && c<a+b) {
                        ++result;
                    }
                }
            }
        }

        Print(result);
    }

    private static final Scanner __in = new Scanner(System.in);
    private static String readLine() {
        return __in.nextLine();
    }

    private static void Print(int m) {
        System.out.println(m);
    }

    private static void Print(String m) {
        System.out.println(m);
    }
}
