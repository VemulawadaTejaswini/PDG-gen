import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        StringBuilder S_List = new StringBuilder();
        S = sc.next();
        S_List.append(S);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int a=0;a<S.length()-1;a++){
            if(S_List.charAt(a)!=S_List.charAt(a+1)){
                int num=S_List.length()-(a+1);
                if(num>a){
                    if(num>=2) {
                        list2.add(num);
                    }
                }
                else if(num<=a){
                    if(a>=2){
                        list2.add(a+1);
                    }
                }
            }
        }
        System.out.println(Collections.min(list2));
    }
}