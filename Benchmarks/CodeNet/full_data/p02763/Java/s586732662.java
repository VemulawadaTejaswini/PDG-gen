import java.util.*;

public class Main {

	void run() {

		//
		// 画面入力
		//
		Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String S = sc.next();
    	int Q = sc.nextInt();

    	StringBuilder sb = new StringBuilder(S);
    	// char[] charArray = S.toCharArray();

    	for (int i=0; i<Q; i++) {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	int c;
        	//char[] d;
        	String d;
        	if(a==1){
        		d=sc.next();
        		//sb.replace(b-1, b, d); //index b-1がreplaceされる
        		
            	// d=sc.next().toCharArray();
        		// charArray[b-1] = d[0];
        	}else{
            	c=sc.nextInt();

            	// String subS = sb.substring(b-1, c); //開始箇所, \0付ける箇所
            	
            	int alCnt = 0;
            	/*
            	for(char al = 'a'; al <= 'z'; al++){
            		if(subS.indexOf(al)!=-1){
            			alCnt++;
            		}
            	}
            	*/
            	System.out.println(alCnt);
            	
        		/* 遅い
            	Set<Character> uniqueChar = new HashSet<Character>();
        		for(int j=b-1; j <= c-1; j++ ){
        			uniqueChar.add(charArray[j]);
        		}
        		System.out.println(uniqueChar.size());
        		*/
        	}
    	}
    	
    	sc.close();
    	
	}
	
    public static void main(String[] args) {
        new Main().run();
    }
}