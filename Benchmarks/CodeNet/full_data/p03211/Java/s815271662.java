import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans;
        int ori = 753;
        int min = 1000;
        String tmp = "";
        int imin;
        for(int i = 0;i<s.length();i++){
            if(i+2==s.length()){
                break;
            }
            tmp = s.substring(i,i+3);
            imin = Integer.valueOf(tmp);
            imin = Math.abs(imin - ori);
            if(imin < min){
                min = imin;
            }
        }
        System.out.println(min);
    }
}