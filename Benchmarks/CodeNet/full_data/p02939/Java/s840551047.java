import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        ArrayList<String> sp = new ArrayList<>();
        sp.add(String.valueOf(s.charAt(0)));
        s = s.substring(1,s.length());
        sp.add(String.valueOf(s.charAt(0)));
        s = s.substring(1, s.length());

        for(int i = 2; s.length() != 0; ){
            if(sp.get(sp.size() - 2).equals(sp.get(sp.size() - 1))){
                sp.set(sp.size()-1, sp.get(sp.size()-1) + String.valueOf(s.charAt(0)));
                s = s.substring(1, s.length());
            }else{
                sp.add(String.valueOf(s.charAt(0)));
                s = s.substring(1, s.length()); 
            }
        }
        if(sp.get(sp.size()-2).equals(sp.get(sp.size()-1))){
            sp.set(sp.size()-2, sp.get(sp.size()-2) + sp.get(sp.size()-1));
            sp.remove(sp.size()-1);
        }
        System.out.println(sp.size());
   }
}