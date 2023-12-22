import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 文字の入力
		String S = sc.next();
		String T = sc.next();

		int len = S.length();//文字の桁数
		String tmp = S; 	
		String wk = null ;
		if(tmp.equals(T)){
    		System.out.println("Yes");
    		sc.close();
    		return;
		}
		
		//文字数分繰り返す
		for(int i = 0;i < len;i++)
		{
			String wk2 = "";
			String[] strArray = tmp.split("");
			for(int j = 0;j < len;j++){
				if(j==0){
					wk = strArray[0]; 
				}else{
					wk2 = wk2 + strArray[j];
//					wk2.concat(strArray[j]);
//					strArray[j-1] = strArray[j];
					if(len - 1 == j){
						wk2 = wk2 + wk;
//						wk2.concat(wk);
//						strArray[j] = wk;
					}
				}
			}
//			tmp = strArray.toString();
			tmp = wk2;
			
			if(tmp.equals(T)){
	    		System.out.println("Yes");
	    		sc.close();
	    		return;
			}
		}

        	
   		System.out.println("No");
   		sc.close();
        return ;

    }
    
}

