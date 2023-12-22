import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        int max = n-1;

        int c = 0;
        String s;
        String even = "Male";
        while(true){
            System.out.println(c);
            s = sc.next();
            if(s.equals("Vacant")){
                return;
            }

            if(c == 0){
                even = s;
                min = 1;
            }else{
                if((c % 2 == 0 && s.equals(even)) || (c % 2 == 1 && !s.equals(even))){
                    min = c+1;
                }else{
                    max = c-1;
                }
            }
            c = (max + min) / 2;
            System.out.flush();
        }
    }
}
