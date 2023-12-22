import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] box = new int[s.length()];
        for(int i=0;i<s.length();i++){
            box[i] = 1;
        }

        int[] previous2Pattern = box;
        int i = 1;
        while (true){
            box = move(s,box);
            if(i%2==0) {
                if(equals(box,previous2Pattern)){
                    break;
                }else {
                    previous2Pattern = box;
                }
            }
            i++;
        }

        System.out.println(makePattern(previous2Pattern));
    }

    private static int[] move(String s,int[] box){
        int l = s.length();
        int[] tempbox = new int[s.length()];
        for(int i=0;i<l;i++){
            tempbox[i] = 0;
        }
        for(int i=0;i<l;i++){
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
        int l = box.length;
        for(int i=0;i<l;i++){
            stringBuilder.append(box[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
    
    private static boolean equals(int[] a,int[] b){
        int len = a.length;
        for(int i=0;i<len;i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
