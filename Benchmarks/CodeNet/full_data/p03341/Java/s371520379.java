import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        String slist[] = s.split("");
        int count = 0;
        int min = N;
        for(int i = 0; i < N; i++){
            if(slist[i].equals("E")){
                count++;
            }
        }
        min = Math.min(min, count);
        for(int i = 1; i < N; i++){
            if(slist[i-1].equals("W"){
                count++;
            }
            if(slist[i].equals("E")){
                count--;
            }
            min = Math.min(min, count);
        }
        System.out.println(min);
    }
}
