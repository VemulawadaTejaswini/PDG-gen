public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int thp = sc.nextInt();
        int tk = sc.nextInt();
		int ahp = sc.nextInt();
        int ak = sc.nextInt();
            String result = "";
      for(int i=0; i<100; i++){
        ahp = ahp - tk;
       if(ahp <= 0){
        result = "Yes";
        break;
       }
      	thp = thp - ak;
      if(thp <= 0){
        result = "No";
        break;
      }
      }
		System.out.println(result);
	}
}
