import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        int tmp = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'A' | s.charAt(i) == 'C' | s.charAt(i) == 'G' | s.charAt(i) == 'T'){
                tmp++;
                if(s.length()-1 == i){
                    max = Math.max(tmp,max);
                }
            }else{
                max = Math.max(tmp,max);
                tmp = 0;
            }
        }
        System.out.println(max);
    }
}