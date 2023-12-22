import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] line = new String[input.length()];
        line = input.split("");

        List<String> list = new ArrayList<>();
        list.remove(list.get(0));
        for (String word : line) {
            switch (word) {
                case ("0"):
                    list.add(word);
                    break;
                case ("1"):
                    list.add(word);
                    break;
                case ("B"):
                    if (list.size() == 0) {
                        break;
                    } else {
                        list.remove(1);
                        break;
                    }
            }
        }
        String result = "";
        for (String word : list) {
            result += word;
        }
        System.out.println(result);
    }
}