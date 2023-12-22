import java.util.*;

class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S=scan.next();
        char[] s=S.toCharArray();
        int k;
        boolean judge = false;

            if(S.charAt(0)!='Y'){
                System.out.println("No");
		
            }
            else if(S.charAt(1)!='A'){
                System.out.println("No");
		
            }
            else if(S.charAt(2)!='K'){
                System.out.println("No");

		
            }
            else if(S.charAt(3)!='I'){
                System.out.println("No");
		
	    }else{
        	
            System.out.println("Yes");
            }


    }
}
