public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System. in);
      	boolean isBad = false;
      	String str = sc.next();
      	String a = "";
      	for (int i = 0; i <= 3; i++){
           if (String.valueOf(str.charAt(i)).equals(a)){
            isBad = true; 
           }
          a = String.valueOf(str.charAt(i));
        }
      	String out = "";
      	if (isBad == true){
          out = "Bad";
        }else{
          out = "Good";
        }
		System.out.println(out);
	}
}
