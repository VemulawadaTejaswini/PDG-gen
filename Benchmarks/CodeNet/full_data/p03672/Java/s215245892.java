import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        LinkedList<Integer> a = new LinkedList<>();
        S.chars().forEach(c -> {
            a.add(c);
        });

        do{
            a.pollLast();
        } while (false == isEvenString(a));

        System.out.print(a.size());
    }

    private static boolean isEvenString(List s){

        if(s.size() % 2 != 0){
            return false;
        }

        List head = s.subList(0, s.size() / 2);
        List tail = s.subList(s.size() / 2, s.size());
        return head.equals(tail);

    }
}