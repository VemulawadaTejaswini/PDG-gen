import java.util.*;

public class Main{
    
    static final int zero = 8000;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        char start = s.charAt(0);
        char end = s.charAt(s.length()-1);
        
        if(start == '0'){
            start = '1';
        }else{
            start = '0';
        }
        
        if(end == '0'){
            end = '1';
        }else{
            end = '0';
        }
        
        s = start + s + end;
        
        
        char[] line = s.toCharArray();
        
        ArrayList<Integer> interval = new ArrayList<Integer>();
        ArrayList<Integer> maxLen = new ArrayList<Integer>();
        
        int count = 1;
        char prev = line[0];
        for(int i=1; i<line.length; i++){
            char c = line[i];
            if(prev == c){
                count++;
            }else{
                interval.add(count);
                count = 1;
                prev = c;
                
            }
        }
        
        
        
        int odd = 0;
        int eve = 0;
        for(int i=1; i<interval.size(); i++){
            int a = interval.get(i);
            if(i%2==0){
                if(eve < a){
                    eve = a;
                }
            }else{
                if(odd < a){
                    odd = a;
                }
            }
        }
        
        int n = s.length()-2;
        
        if(n == 1){
            System.out.println(1);
        }else if(n == 3 && interval.size()>2){
            System.out.println(2);
        }else{
            System.out.println(Math.min(Math.max(eve, odd), n));
        }
    }
}