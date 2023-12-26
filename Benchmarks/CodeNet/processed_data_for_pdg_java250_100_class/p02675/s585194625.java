public class Main {
	public static void main(String[] args){
    String yomi[] = {"hon","pon","bon"};
    int index = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    int keta_1 = N%10;
    if ( keta_1 == 0 || keta_1==1 || keta_1==6 || keta_1==8 ){
      index=1;
    }else if( keta_1==3 ){
      index=2;
    }
		System.out.println(yomi[index]);
	}
}
