public class Main {
    public static void main(String args[]) throws IOException {
	Scanner scanner = new Scanner(System.in);
	int summer = scanner.nextInt();
	int num = scanner.nextInt();
      int tmp = 0;
	for(int i=0;i<num;i++){
        tmp += scanner.nextInt();
	}
    int day = summer - tmp;
    if(day>=0){
      System.out.println(day);
    }else{
       System.out.println(-1);
    }
    }
}
