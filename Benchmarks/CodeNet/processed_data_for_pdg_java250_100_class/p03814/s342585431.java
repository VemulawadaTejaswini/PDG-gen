public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
        String S = scan.next();
        boolean isBetween = false;
        int topA = 0;
        int bottomZ = 0;
        int cnt = 0;
        int i = 0;
        for(i = 0 ; ; i++){
          if(S.substring(i,i+1).charAt(0) == 'A'){
            topA = i;
            break;
          }
        }
        for(i = S.length() ; ; i--){
          if(S.substring(i-1,i).charAt(0) == 'Z'){
            bottomZ = i-1;
            break;
          }
        }
        cnt = bottomZ - topA + 1;
        System.out.println(cnt);
	  }
}
