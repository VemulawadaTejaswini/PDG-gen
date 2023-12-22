import java.util.Scanner;
public class Main {

	public void run() throws Exception {
		int anw = 0;
		int num = 0;
		String ACGT = "ACGT";
	    Scanner sc = new Scanner(System.in);
	    char[] cs = sc.next().toCharArray();
	    for(int i=0;i<cs.length;i++){
	    	
	    	if(ACGT.indexOf(cs[i]) != -1){
	    		num++;
	    		if(num > anw){
	    			anw = num;
	    		}
	    	}else{	    		
	    		num = 0;
	    	}
	    }
	    
	    
	    System.out.println(anw);
	}
    public static void main(String[] args) throws Exception {
        new Main().run();
    }

}