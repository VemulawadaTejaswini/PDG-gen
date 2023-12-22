import java.util.*;
import java.lang.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] list = new String[s.length()];
        int[] l = new int[s.length()];
        list = s.split("");
        int count =0;
        for( int i =0; i <s.length(); i++){
         if(list[i]=="A" ||list[i]=="G"||list[i]=="C"||list[i]=="T" ){
             count++;
         }else{
             l[i] = count;
             count =0;
         }
        }
        Arrays.sort(l);
        System.out.println(l[s.length()-1]);
    }
}