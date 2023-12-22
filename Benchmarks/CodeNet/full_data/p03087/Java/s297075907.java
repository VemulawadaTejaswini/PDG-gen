
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> txt = new ArrayList<>();
        int numberlong = sc.nextInt();
        int number = sc.nextInt();
        String letter = sc.next();
        String[] letters = letter.split("");

        for (int i = 0; i < number * 2; i++) {
            txt.add(sc.nextInt());
        }
        
        for(int n = 0; n < number; n++){
            int count = 0;
            for(int first = txt.get(n * 2); first < txt.get(n * 2 +1) -1;n++){
                if(letters[first].equals("A") && letters[first +1].equals("T")){
                    count++;
                }
            System.out.println(count);
        }
        

    }

}
}
