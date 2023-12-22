import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String S = sc.next();
        int[] l = new int[q];
        int[] r = new int[q];
        
        for(int i = 0;i < q;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        for(int i = 0;i < q;i++){
            String s = S.substring(l[i]-1,r[i]);
            int ans =0;
            for(int j = 0;j < s.length()-1;j++){
                if(s.charAt(j) == 'A'){
                    if(s.charAt(j+1) == 'C'){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
        
    }
}