import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String str = sc.next();
        char[] ch = str.toCharArray();
        int[] l = new int[q];
        int[] r = new int[q];
        int[] v = new int[q];
        for(int i=0;i<q;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            v[i] = 0;
        }
        
        for(int i=0;i<q;i++){
            for(int j=l[i]-1;j<r[i]-1;j++){
                if(ch[j]=='A'&&ch[j+1]=='C'){
                    v[i] = v[i]+1;
                }
            }
        }
        
        for(int i=0;i<q;i++){
            System.out.println(v[i]);
        }
    }
}
