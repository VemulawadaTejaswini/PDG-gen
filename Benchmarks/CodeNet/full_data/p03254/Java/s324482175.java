import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] main_a_1){
        Scanner scanner = new Scanner(System.in);
        int main_a_2 = scanner.nextInt();
        int main_a_3 = scanner.nextInt();
        List<Integer> main_a_4 = new ArrayList<>();
        for(int main_a_5 = 0;main_a_5 < main_a_2;main_a_5++){
            main_a_4.add(scanner.nextInt());
        }
        int main_a_6 = 0;
        for(Integer main_a_7 : main_a_4){
            if(main_a_3 > main_a_7){
                main_a_3 = main_a_3 - main_a_7;
                main_a_6++;
            }else if(main_a_3 == main_a_7){
                main_a_6++;
                break;
            }
        }
        System.out.println(main_a_6);
    }
}