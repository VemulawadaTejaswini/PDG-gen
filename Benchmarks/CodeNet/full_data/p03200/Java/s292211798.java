import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next();
        //HashMap<Integer,Integer>wh=new HashMap<>();
        int w=0,res=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='W') {
                //wh.put(w,i);
                res+=i-w;
                w++;
            }
        }
        System.out.println(res);
    }
}