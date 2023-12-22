import java.util.ArrayList;
import java.util.Scanner;

public class test5{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String numA = scanner.nextLine();
        String numB = scanner.nextLine();
        String tmpNumStr = numA + numB;
        int num = Integer.parseInt(tmpNumStr);
        System.out.println("num: " + num);
        int div = 2;
        int i = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(true) {
            if(num % div == 0) {
                num /= div;
                array.add(div);
                continue;
            }else if(num <= 1) {
                break;
            }else{
                div++;
            }
        }
        boolean isSquare = false;
        System.out.println("size: " + array.size());
        if(array.size() == 1) {
            ;
        } else {
            int tmpNum = 0;
            for(int j=0; j<array.size(); j++) {
                System.out.println(array.get(j));
                tmpNum = array.get(j);
                boolean isMatchedOnce = false;
                for(int jj=0; jj<array.size(); jj++) {
                    if(tmpNum == array.get(jj)) {
                        isMatchedOnce = true;
                        continue;
                    }else if(tmpNum == array.get(jj) && isMatchedOnce) {
                        isSquare = true;
                        break;
                    } else {
                        isSquare = false;
                    }
                }
            }
        }
        System.out.println(isSquare);
    }
}
