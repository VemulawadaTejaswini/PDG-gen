import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        String []S={"SUN","MON","TUE", "WED", "THU", "FRI", "SAT"};
        for(int i=0;i<7;i++){
            if(s.equals(S[i])){
                System.out.println(7-i);
                return;
            }
        }
    }
}
