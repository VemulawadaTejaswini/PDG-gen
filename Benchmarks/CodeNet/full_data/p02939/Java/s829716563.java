import java.util.*;
import java.util.List;
public class Main{
	
	public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        String S = "";
        int K = 0;

        try{
            String str = sn.nextLine();
            List<String> ans = new ArrayList<String>();
            String tmp="";
            str = str + "a";

            while(true){
                tmp=tmp + str.substring(0,1);
                str=str.substring(1);
                if(!ans.contains(tmp)){
                    ans.add(tmp);
                    tmp="";
                }
                if("a".equals(str)){
                    break;
                }
            }
            System.out.println(ans.size());
        }catch(Exception e){
            //do nothing
            return;
        }
        
    }
}