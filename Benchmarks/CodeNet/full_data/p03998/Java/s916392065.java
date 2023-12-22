import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String SA = sc.next();
        String SB = sc.next();
        String SC = sc.next();
        
        int counta= 0;
        int countb= 0;
        int countc= 0;
        int idx = 0;
        boolean judge =true;
        
        while(judge){
            if(idx == 0){
                if(counta>SA.length()){
                    break;
                }
                if(SA.charAt(counta) == 'b'){
                    idx = 1;
                }else if(SA.charAt(counta) == 'c'){
                    idx = 2;
                }
                counta++;
                if(counta == SA.length() && idx == 0){
                    break;
                }
        }else if(idx == 1){
                if(countb>SB.length()){
                    break;
                }
                if(SB.charAt(countb) == 'a'){
                    idx = 0;
                }
                else if(SB.charAt(countb) == 'c'){
                    idx = 2;
                }
                countb++;
                if(countb == SB.length() && idx == 1){
                    break;
                }
            }else{
                if(countc>SC.length()){
                    break;
                }
                if(SC.charAt(countc) == 'a'){
                    idx = 0;
                }else if(SC.charAt(countc) == 'b'){
                    idx = 1;
                }
                countc++;
                if(countc == SC.length() && idx == 2){
                    break;
                }
            }
        }
        
        if((counta == SA.length() && idx == 0) || counta>SA.length()) System.out.println("A");
        if((countb == SB.length() && idx == 1) || countb>SB.length()) System.out.println("B");
        if((countc == SC.length() && idx == 2) || countc>SC.length()) System.out.println("C");
        
    }
}