import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(s);
        boolean judge = false;
        
        int i=1;
        while(judge == false){
            if(data.get(i-1)%2 == 0){
                int tmp1 = data.get(i-1)/2;
                if(data.contains(tmp1)){
                    System.out.println(i+1);
                    judge = true;
                }
                data.add(tmp1);
            }else{
                int tmp2 = 3*data.get(i-1)+1;
                if(data.contains(tmp2)){
                    System.out.println(i+1);
                    judge = true;
                }
                data.add(tmp2);
            }
            
            i++;
            
        }
    }
}
