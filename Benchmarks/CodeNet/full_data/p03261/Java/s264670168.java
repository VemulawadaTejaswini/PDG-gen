import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int N = sc.nextInt();
        int flag = 0;

        String[] moji = new String[N];
        for(int i=0; i<N; i++){
            moji[i] = sc.next();
            if(i>0){
                //if((moji[i].charAt(0)) != moji[i-1].charAt((moji[i-1].length)-1))flag=1;
                String tmp = moji[i-1]; 
                char Ctmp = (tmp.charAt(tmp.length()-1));
                if((moji[i].charAt(0)) != Ctmp)flag=1;
            }
            if(flag == 1)break;
        }

        for(int i=0; i<N-2; i++){
            for(int j=1; j<N-1; j++){
                if(moji[i]==moji[j]){
                    flag=1;
                    break;
                }
            }if(flag==1)break;
        }

        if(flag==0)System.out.println("Yes");
        else System.out.println("No");
	}
}