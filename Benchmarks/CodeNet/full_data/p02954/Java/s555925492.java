import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] box = new int[s.length()];
        for(int i=0;i<s.length();i++){
            box[i] = 1;
        }

        String previous2Pattern = null;
        int i = 1;
        while (true){
            box = move(s,box);
            if(i%2==0) {
                String currentPattern = makePattern(box);
                if(currentPattern.equals(previous2Pattern)){
                    break;
                }else {
                    previous2Pattern = makePattern(box);
                }
            }
            i++;
        }

        System.out.println(previous2Pattern);
    }

    private static int[] move(String s,int[] box){

        int[] tempbox = new int[s.length()];
        for(int i=0;i<s.length();i++){
            tempbox[i] = 0;
        }
        for(int i=0;i<s.length();i++){
            if(s.substring(i,i+1).equals("R")){
                tempbox[i+1] = box[i];
            }else {
                tempbox[i-1] += box[i];
            }
        }
        return tempbox;
    }

    private static String makePattern(int[] box){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<box.length;i++){
            stringBuilder.append(box[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
