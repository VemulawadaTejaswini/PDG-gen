import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String ss =s.substring(0,s.length()-1);
        
        for(int i =0;i<ss.length();i++){
            if(ss.length()==1){
                System.out.println(2);
            }
            if(ss.length()%2==0){
                //System.out.println(i);
                //System.out.println(ss.substring(0,(ss.length()/2)-1));
                //System.out.println(ss.substring(ss.length()/2,ss.length()));
                if(ss.substring(0,(ss.length()/2)).equals(ss.substring(ss.length()/2,ss.length()))){
                    System.out.println(ss.length());
                    //System.out.println("yes");
                    break;
                }
            }
            ss = ss.substring(0,ss.length()-1);
        }
    }
}




