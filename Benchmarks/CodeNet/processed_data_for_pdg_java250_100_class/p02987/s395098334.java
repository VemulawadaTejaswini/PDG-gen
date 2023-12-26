public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String str = sc.next();
      	int cnt = 0;
      	for(int i = 0; i < 4; i++){
      		char st = str.charAt(i);
      		for(int j = 0; j < 4; j++){
      			char stt = str.charAt(j);
	      		if (stt == st){
	      			cnt++;
	    	  	}
      		}
      	}
      	if(cnt == 8){
      		System.out.println("Yes");
      	}else{
      		System.out.println("No");
      	}
    }
}
