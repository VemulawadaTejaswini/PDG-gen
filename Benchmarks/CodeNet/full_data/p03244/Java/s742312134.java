import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ve = new int[n/2];
        int[] vo = new int[n/2];
        int[] ce = new int[100001];
        int[] co = new int[100001];
        int ans = 0;
        for(int i=0; i<n/2; i++){
            ve[i] = sc.nextInt();
            ce[ve[i]]++;
            vo[i] = sc.nextInt();
            co[vo[i]]++;
        }

        int maxe = ve[0];
        int maxo = vo[0];
        int bige = ve[0];
        int bigo = vo[0];
        int maxce = 0;
        int maxco = 0;
        
        for(int i=0; i<100001; i++){
            if(ce[i] > maxce){
                bige = maxe;
                maxe = i;
            }
            if(co[i] > maxco){
                bigo = maxo;
                maxo = i;
            }
        }
        
        if(maxe != maxo){
            ans = n-ce[maxe]-co[maxo];
        }else{
            if(maxe==bige && maxo==bigo){
                ans = n/2;
            }else if(ce[maxe] > co[maxo]){
                ans = n-ce[maxe]-co[bigo];
            }else{
                ans = n-ce[bige]-co[maxo];
            }
        }

        
        System.out.println(ans);
    }
}