import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Integer[] lines = getStdinInt();
        int sum  = 0;
        for(int i = 0; i < lines[0]; i++){
            sum = sum + (i + 1);
        }
        System.out.println(sum);

    }
    private static Integer[] getStdinInt() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextInt());
        }
        return lines.toArray(new Integer[lines.size()]);
    }
}
