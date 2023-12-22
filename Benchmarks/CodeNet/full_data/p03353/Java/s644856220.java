import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        HashSet<String> a = new HashSet<String>();

        for (int i=1;i<=Math.min(k,s.length());i++){
            for (int j=0;j<s.length()+1-i;j++){
                a.add(s.substring(j,j+i);
            }
        }
        ArrayList<String> b = new ArrayList<String>(a);
        Collections.sort(b);
        System.out.println(b.get(k-1));
    }
    
}