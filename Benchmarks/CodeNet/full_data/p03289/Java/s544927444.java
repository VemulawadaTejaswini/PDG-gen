import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        boolean ac = true;
        
        if(s.charAt(0) != 'A') ac = false;
        
        int c = 0;
        int index = 0;
        for(int i = 2; i <= s.length()-2; i++){
            if(s.charAt(i) == 'C'){
                c++;
                index = i;
            }
        }
        if(c != 1) ac = false;
        
        for(int i = 1; i < s.length(); i++){
            if(i == index) continue;
            if(!('a' <= s.charAt(i) && s.charAt(i) <= 'z')){
                ac = false;
            }
        }
        
        if(ac){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }
}