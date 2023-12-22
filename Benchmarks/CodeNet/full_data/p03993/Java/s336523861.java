import java.util.ArrayList;
import java.util.Scanner;

class Main {

    /*
    B - 仲良しうさぎ
    */    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> a = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int nextInt = sc.nextInt();
            a.add(nextInt);
            if (a.indexOf(i+1) != -1 && nextInt == a.indexOf(i+1)+1) {
                ++count;
            }
        }

        System.out.println(count);
        

    }
}