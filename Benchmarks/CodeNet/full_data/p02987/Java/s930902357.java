import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String str=entrada.next();
        String str2="";
        int p=-2;
        for(int i=0; i<str.length();i++){
            char c=str.charAt(i);
            p=str2.indexOf(c);
            if(p<0){
                str2=str2+c;
            }
        }
        if(str2.length()==2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(str2);
        }
    }
    
