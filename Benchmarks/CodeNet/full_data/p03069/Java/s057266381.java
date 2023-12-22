import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        int counter = 0;
        


        int i;
        for(i = 0; i < s.length() - 1; i++){
            String tmp = s.substring(i, i + 1) + s.substring(i + 1, i + 2);
            if(tmp.equals("#.")){
                sb.setCharAt(i, '.');
                s = sb.toString();
                counter++;
                
            }else{
                
            }


        }
        System.out.println(counter);


    }
}

