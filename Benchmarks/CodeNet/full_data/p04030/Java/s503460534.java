import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;


public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<Character>ss=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='B'){
                if(ss.size()==0){

                }else{
                    ss.remove(i-1);
                }
            }else{
                ss.add(s.charAt(i));
            }
        }
        for(int i=0;i<ss.size();i++){
            System.out.print(ss.get(i));
            if(i==ss.size()-1){
                System.out.println();
            }
        }


        
}
        
        
    }
