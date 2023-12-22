import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cnt[] = new long[5];
        for(int i=0; i<n; i++){
            String s = sc.next();
            if(s.charAt(0)=='M'){
                cnt[0] += 1;
            }else if(s.charAt(0)=='A'){
                cnt[1] += 1;
            }else if(s.charAt(0)=='R'){
                cnt[2] += 1;
            }else if(s.charAt(0)=='C'){
                cnt[3] +=1;
            }else if(s.charAt(0)=='H'){
                cnt[4] +=1;
            }else{

            }
        }
        long ans = 0;
        for(int i=0; i<3; i++){
            for(int j=i+1; j<4; j++){
                for(int k=j+1; k<5; k++){

                    ans += cnt[i]*cnt[j]*cnt[k];
                }
            }
        }
        System.out.println(ans);
    }
}
