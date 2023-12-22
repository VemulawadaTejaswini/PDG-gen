import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        // int b = stdIn.nextInt();
        // int c = stdIn.nextInt();
        // String s = stdIn.next();
        // boolean flag = true;
         
        // if(a == b && b == c){
        //     flag = false;
        // } 
        
        // if(a != b && a != c && b != c){
        //     flag = false;
        // }
        
        int count = 0;
        String word[] = new String[n];
        int num[] = new int[n];
        int max = 1;
        
        for(int i = 0; i < n; i++){
            String s = stdIn.next();
            boolean flag = false; //なかったら flase
            
            for(int j = 0; j < count; j++){
                if(word[j].equals(s)){
                    flag = true;
                    num[j]++;
                    
                    if(num[j] > max){
                        max = num[j];
                    }
                }
            }
            
            if(!flag){
                word[count] = s;
                num[count]++;
                count++;
            }
        }
        
        // char c[] = s.toCharArray();
        
        // for(int i = 0; i < s.length(); i++){
        //     c[i];
        // }
        
        int maxcount = 0;
        int aa[] = new int[n];
        
        for(int i = 0; i < count; i++){
            if(max == num[i]){
                aa[maxcount] = i;
                maxcount++;
            }
        }
        
        //System.out.println(max);
        
        String maxs[] = new String[maxcount];
        
        for(int i = 0; i < maxcount; i++){
            maxs[i] = word[aa[i]];
        }
        
        Arrays.sort(maxs);
        
        for(int i = 0; i < maxcount; i++){
            System.out.println(maxs[i]);
        }
        
        
        // System.out.println();
        // System.out.print();
    }
}
