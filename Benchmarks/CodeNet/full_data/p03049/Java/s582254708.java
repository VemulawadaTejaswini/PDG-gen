import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        int a=0;
        int b=0;
        int ab=0;
        int total=0;
        for(int i=0; i<num; i++){
            String str = sc.nextLine();
            total+=simple(str);
            // System.out.println(str.charAt(0)=='B');
            // System.out.println(str.charAt(str.length()-1)=='A');
            if(str.charAt(0)=='B'&&str.charAt(str.length()-1)=='A'){
                ab++;
            }else if(str.charAt(str.length()-1)=='A'){
                a++;
            }else if(str.charAt(0)=='B'){
                b++;
            }
        }
        if(a>b){
            if(a-b>ab){
                total+=(b+ab);
            }else{
                total+=(a+b+ab)/2;
            }
        }else{
            if(b-a>ab){
                total+=(a+ab);
            }else{
                total+=(a+b+ab)/2;
            }
        }
        System.out.println(total);
        // System.out.println("XXXXXXXX");
    }
 
    static int simple(String str){
        int count = 0;
        boolean flag =false;
    	for(char x: str.toCharArray()){
    		if(x == 'A'){
    			flag = true;
    		}else if(x=='B'){
    		    if(flag){
    		        count++;
    		    }
    		    flag=false;
    		}else{
    		    flag=false;
    		}
    	}
    	return count;
    }
}
