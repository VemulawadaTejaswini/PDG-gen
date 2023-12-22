import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        String s = sc.next();
        ArrayList<Integer> back = new ArrayList<Integer>();
        int ind = s.length()+c+1;
        
        while(true){
            ind = s.lastIndexOf("o", ind-c-1);
            if(ind == -1){
                break;
            }else if(ind == 0){
                back.add(ind);
                break;
            }else{
                back.add(ind);
            }
            if(back.size() == k) break;
        }
        ind = -c-1;
        int cnt = 0;
        while(true){
            ind = s.indexOf("o", ind+c+1);
            if(ind == -1){
                break;
            }else if(ind == s.length()){
                if(back.contains(ind)){
                    System.out.println(ind+1);
                }
                break;
            }else{
                if(back.contains(ind)){
                    System.out.println(ind+1);
                }
            }
            cnt++;
            if(cnt == k) break;
        }
    }

}
