import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        int list[] = new int[N];
        for (int i = 0; i < N; i++) {
            switch (s.charAt(i)) {
                case 'R':
                    list[i] = 1;
                    break;
                case 'G':
                    list[i] = 2;
                    break;
                case 'B':
                    list[i] = 3;
                    break;
            }
        }
        int ans = aP(list);
        System.out.println(ans);

    }
    public static final int aP(int[] list){
        int ans = 0;
        int N = list.length;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    boolean bool1 = (list[i]-list[j])!=0;
                    boolean bool2 = (list[i]-list[k])!=0;
                    boolean bool3 = (list[j]-list[k])!=0;
                    boolean bool4 = !((j-i)==(k-j));
                    if(bool1 && bool2 && bool3 && bool4){
                        ans++;
                    }

                }
            }
        }

        return ans;
    }

}