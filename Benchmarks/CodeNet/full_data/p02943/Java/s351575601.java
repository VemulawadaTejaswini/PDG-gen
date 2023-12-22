import java.util.*;

public class E {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();

        String st[] = new String[n];
        st[n-1] = str;

        for (int i=0; i<k; i++){
            char ch[] = st[n-1].toCharArray();
            str = "";
            for (int w=0; w<n; w++) str += ch[w];
            String T = "";
            for (int j=n-1; j>=0; j--){
                T += ch[j];
            }
            str = str + T;

            for (int q=0; q<n; q++){
                st[q] = str.substring(q, q+n);
            }

            for (int l=0; l<n-1; l++){
                if ((st[l]).compareTo(st[l+1])<=0){
                    st[l+1] = st[l];
                }
            }
        }
        System.out.println(st[n-1]);
    }
}
