import java.io.*;
import java.util.*;

public class Main {
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.charAt(0)!='A'){
            System.out.println("WA");
        }else{
            String a1 = s.substring(2, s.length()-1);
//            String a2 = s.substring(s.length()-2,s.length()-1);
//            System.out.println(a1+" "+a2);
            int n1 = a1.length()-a1.replaceAll("C","").length();
//            int n2 = a2.length()-a2.replaceAll("C","").length();
            if(n1!=1){
                System.out.println("WA");
            }else{
                String sa = s.replaceAll("A","");
                String sb = sa.replaceAll("C","");
                String lwr = sb.toLowerCase();
                if(lwr.equals(sb)){
                    System.out.println("AC");
                }else{
                    System.out.println("WA");
                }
            }
        }
    }
}