import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0, end=0;
        char s[] = sc.next().toCharArray();
        for(int i = 0; i<s.length; i++){
            if(s[i]=='A'){
                start = i;
                break;
            }
        }
        for(int i = s.length-1;0<=i; i--){
            if(s[i]=='Z'){
                end = i;
                break;
            }
        }
        System.out.println(end-start+1);
    }
}
