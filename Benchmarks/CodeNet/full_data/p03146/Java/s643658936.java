import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        Map<Integer,Integer> list = new HashMap<Integer,Integer>();
        int n = 1;
        while(true){
            list.put(s, s);
            n++;
            if(s % 2 == 0){
                s /= 2;
            }else{
                s = s * 3 + 1;
            }
            if(list.containsKey(s)){
                System.out.println(n);
                break;
            }
        }
    }
}
