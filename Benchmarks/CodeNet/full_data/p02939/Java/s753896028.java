import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        //List<String> list = new ArrayList<>();
        int length = S.length();

        int previousLength = 2;
        int stringCount = 0;
        String previousTxt = "";
        String before = "";
        String after = "";
        int count=0;
        for (int i = 0;i<length; i++){
            before = String.valueOf(S.charAt(stringCount));
            after = String.valueOf(S.charAt(stringCount+1));

            if (previousLength > 1||!previousTxt.equals(before)){
                //System.out.println(before);
                previousTxt = before;
                previousLength =1;
                stringCount++;
                count++;
            }else {
                //System.out.println(before+after);
                stringCount = stringCount +2;
                previousLength =2;
                count++;
            }
            if (stringCount+1 == length){
                if (previousTxt.equals(after)){
                    break;
                }else {
                    count++;
                    break;
                }
            }else if (stringCount == length){
                count++;
                break;
            }
        }
        System.out.println(count);


    }
}

