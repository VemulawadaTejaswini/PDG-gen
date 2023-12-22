public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
	  String n = sc.next();
      String a = "a";
      int goodCount;
      for(int i=0; i<4; i++){
        //一緒だったらカウントする
      	if(i > 0 && a == n.substring(i,i+1)) goodCount++;
        //文字確認する値を一つズラす
        String a = n.substring(i,i+1);
      }
      if(goodCount >= 3){
        System.out.plintln("Yes");
      }else{
        System.out.println("No);
      }
    }     
}
