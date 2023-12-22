import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int cnt = 0;
        int nd_c = 0;
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(x - a*500 - b*100 >=0){
                    nd_c = (x - a*500 - b*100)%50;
                }else{
                    break;
                }
                if(nd_c<c){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
