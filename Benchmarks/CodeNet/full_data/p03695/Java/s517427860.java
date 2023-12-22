import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        int free = 0;
        int ans=0;
        int hai=0;
        int cha=0;
        int midori=0;
        int mizu=0;
        int ao=0;
        int ki=0;
        int dai=0;
        int aka=0;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        
        for(int i=0; i<n; i++){
            if(a[i]<400){
                hai=1;
            }else if(a[i]<800){
                cha=1;
            }else if(a[i]<1200){
                midori=1;
            }else if(a[i]<1600){
                mizu=1;
            }else if(a[i]<2000){
                ao=1;
            }else if(a[i]<2400){
                ki=1;
            }else if(a[i]<2800){
                dai=1;
            }else if(a[i]<3200){
                aka=1;
            }else{
                free++;
            }
            if(hai+cha+midori+mizu+ao+ki+dai+aka==8){
                break;
            }
        }
        
        ans= hai+cha+midori+mizu+ao+ki+dai+aka;
        
        if(free==0){
            System.out.println(ans +" "+ans);
        }else {
            int c = ans+free;
            if(c>8){
                c=8;
            }
            System.out.println(ans +" "+c);
        }
   }
}
