import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vertex = sc.nextLine();
        Integer N = Integer.parseInt(vertex);
        String lineList = sc.nextLine();
        String lines[] = lineList.split(" ");

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int index=0; index<lines.length; index++) {
            list.add(Integer.parseInt(lines[index]));
        }

        Integer[] numbers = list.toArray(new Integer[list.size()]);
        Arrays.sort(numbers, Collections.reverseOrder());

        Integer largestLine = numbers[0];
        int lineSum = 0;
        for(int i = 0; i<numbers.length; i++) {
            lineSum += numbers[i];
        }
        if (largestLine < (lineSum - largestLine)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}