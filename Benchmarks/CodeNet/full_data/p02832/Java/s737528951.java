import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder before = new StringBuilder();
        
        for(int i=0; i<n; i++){
            before.append(sc.next());
        }
        
        
        StringBuilder after = new StringBuilder(before.toString());
        
        int t = 1;
        int count = 0;
        while(true){
            String target = String.valueOf(t);
            if(after.indexOf(target)!=-1){
                after = new StringBuilder(after.substring(after.indexOf(target)));
                count++;
                t++;
            }
            else{
                break;
            }
        }
        
        System.out.println(count!=0?before.length()-count:-1);
    }
}