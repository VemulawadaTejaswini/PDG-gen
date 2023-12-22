import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        
        Set<String> st = new HashSet<String>();

        for (char cc:c) {
            st.add(String.valueOf(cc));
        }
        
        if (s.length()==st.size()) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

        //System.out.println("yes");
        sc.close();
    }
}