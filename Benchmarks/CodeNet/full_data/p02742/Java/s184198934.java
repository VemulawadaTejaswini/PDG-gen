import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());

        int wCount = w / 2;
        int answer = 0;

            for (int i = 0; i < h; i++) {
                if(w %2 == 0){
                    answer += w/2;
                }else {
                    if(i%2==0){
                        answer += w/2+1;
                    }else{
                        answer += w/2;
                    }
                }
            }

//        String[] array = s.split(' ');
        System.out.println(answer);
    }
}
