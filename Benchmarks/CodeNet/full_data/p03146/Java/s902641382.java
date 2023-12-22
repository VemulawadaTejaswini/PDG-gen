import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(s);
        int count = 0;
        while(true){
            
            if(s%2 == 0){
                s = s/2;
            }else{
                s = 3*s + 1;
            }
            count++;
            if(list.contains(s)){
                System.out.println(count+1);
                return;
            }else{
                list.add(s);
            }
        }
    }
}
