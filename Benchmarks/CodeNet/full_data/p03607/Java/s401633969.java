import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> number = new ArrayList<>();
        for (int i=0;i<n;i++){
            number.add(scanner.nextInt());
        }
        int count = 1;
        Collections.sort(number);
        for (int i=1;i<number.size();i++){
            count++;
            if ((number.get(i-1).equals(number.get(i)))){
                count-=2;
            }
        }
        System.out.println(count);

    }

}