import java.util.Scanner;

public class Main {
	static int num=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//500
		int b=sc.nextInt();//100
		int c=sc.nextInt();//50
		int x=sc.nextInt();
		if(x%50==0){
			/** 
		     * 递归求解其中 
		     * @param x 总共的钱数
		     */ 
			f(x,a,b,c);
			System.out.println(num);
		}else{
			System.out.println(0);
		}
		
	}

	static void f(int x, int a,int b,int c) {
		// TODO Auto-generated method stub
		if(a<0||b<0||c<0){
    		return;
    	}
		if(x<0){   //不符合分钱的总数，不和题意 
            return;  
        }
        if(x==0){   //当x=0时，刚好分完了所有的钱
        	if(a+b+c>=1){
        		num++;    //方案数量加1 
                return;
        	}
        	  
        }  
        /** 
         * 当钱还没有分完时，继续走下去 
         * 每一次可以分50，100，500(q,w,e)
         */  
        f(x-50,a,b,c-1); 
        f(x-100,a,b-1,c); 
        f(x-500,a-1,b,c); 
        
	}

}