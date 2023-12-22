import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        char[] chars = S.toCharArray();
        Arrays.sort(chars);

        String sorted = new String(chars);
        String output = "";
        for(int i = 0; i<chars.length;i++){
            int num = chars[i] + N;
            if(num > 'Z'){
                num = num-26;
            }
            output += (char)(num);
        }

        System.out.println(output);
    }
}
