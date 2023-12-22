import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strings = new String[n];
        for(int i=0;i<n;i++){
            strings[i] = sc.next();
        }

        String ans_string = "";
        String first_strings = strings[0];
        for(int i = 0;i<first_strings.length();i++){
            char c = first_strings.charAt(i);

            Boolean has_c_in_all_strings = true;
            for(int j=1;j<strings.length;j++){
                int index_of = strings[j].indexOf(c);
                if(index_of == -1){
                    has_c_in_all_strings = false;
                }
            }
            if(has_c_in_all_strings == true) {
                ans_string += c;

                for (int j = 1; j < strings.length; j++) {
                    strings[j].replaceFirst(String.valueOf(c),"");
                }
            }
        }

        char[] ans_chars = ans_string.toCharArray();

        Arrays.sort(ans_chars);

        System.out.println(ans_chars);
    }
}
