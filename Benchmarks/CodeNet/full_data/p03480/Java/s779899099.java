import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        StringBuilder S_List = new StringBuilder();
        S = sc.next();
        S_List.append(S);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        for(int a=0;a<S.length()-1;a++){
            if(S_List.charAt(a)!=S_List.charAt(a+1)){
                int num=S_List.length()-(a+1);
                if(num>a){
                    if(num>=2) {
                        list2.add(num);
                        list2.remove(0);
                    }
                }
                else if(num<=a){
                    if(a>=2){
                        list2.add(a+1);
                        list2.remove(0);
                    }
                }
            }
        }
        System.out.println(list2.get(0));
    }
}
