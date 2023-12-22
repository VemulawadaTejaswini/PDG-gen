import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next(),T=sc.next(),res="Yes";
        HashMap<Integer,Integer> s=new HashMap<>(),t=new HashMap<>();
        for(int i=0;i<S.length();i++){
            if(!s.containsKey(((int)S.charAt(i)))){
                s.put((int)S.charAt(i),(int)T.charAt(i));
            }
            else if((int)T.charAt(i)!=s.get((int)S.charAt(i))){
                res="No";
                break;
            }
            if(!t.containsKey(((int)T.charAt(i)))){
                t.put((int)T.charAt(i),(int)S.charAt(i));
            }
            else if((int)S.charAt(i)!=t.get((int)T.charAt(i))){
                res="No";
                break;
            }
        }
        System.out.println(res);
    }
}
