import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valueKodomo = scanner.nextInt();
        int valueOkasi = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < valueKodomo;i++){
            list.add(scanner.nextInt());
        }
        int returnValue = 0;
        for(Integer integer : list){
            if(valueOkasi != integer){
                if(valueOkasi > integer){
                    valueOkasi -= integer;
                    returnValue++;
                }
            }else{
                returnValue++;
                break;
            }
        }
        if(valueOkasi != 0&&returnValue != 0) returnValue -= 1;
        System.out.println(returnValue);
    }
}