public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int num = 0;
		char[] ch = new char[4];
		for(int i=0; i<4; i++){
	 		ch[i] = S.charAt(i);
        }
        for(int i=0; i<4; i++){
          if(ch[i] == '+'){
        	num++;
          } else {
        	num--;
          }
        }
		System.out.println(num);
	}
}
