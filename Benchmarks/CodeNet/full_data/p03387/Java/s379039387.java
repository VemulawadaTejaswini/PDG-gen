import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]po=new int[3];
        for(int i=0;i<3;i++){
            po[i]=sc.nextInt();
        }
        Arrays.sort(po);
        int ans=0;
        while(po[0]<po[1]){
            po[0]+=2;
            ans++;
        }
            System.out.println(ans+(po[2]-po[1]+(po[0]-po[1])));
    }
    
    
}