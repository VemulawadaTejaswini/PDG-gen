import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        String slist[] = s.split("");
        int count1 = 0;
        int count2 = 0;
        for(int i =0; i < N; ++i){
            slist[i] = sc.next();
        }
        for (int i = 0; i < N; ++i){
            if(slist[i].equals("R")){
                count1 += 1;
            }
            if(slist[i].equals("B")){
                count2 += 1;
            }
            if(count1 > count2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}