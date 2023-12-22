
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int ans=2018;
        for(int i=0;i<Math.min(r-l,2018);i++){
            for(int j=i+1;j<Math.min(r-l+1,2019);j++){
                ans=Math.min((l+i)*(l+j)%2019,ans);
            }
        }
        System.out.println(ans);
    }
}
