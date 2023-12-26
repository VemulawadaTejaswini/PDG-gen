public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
      	String S = scan.next();
		char[] cArray = S.toCharArray();
      	int yesCnt = 0;
      	for(int i = 0; i < S.length(); i++){
      		if((i + 1) % 2 == 0){
              	if('L' == cArray[i] || 'U' == cArray[i] || 'D' == cArray[i]) {
                	yesCnt++;
                }
            } else {
              	if('R' == cArray[i] || 'U' == cArray[i] || 'D' == cArray[i]) {
                	yesCnt++;
                }
            }
        }
      	if(yesCnt == S.length()){
          	System.out.println("Yes");
        } else {
        	System.out.println("No");  
        }
    }
}
