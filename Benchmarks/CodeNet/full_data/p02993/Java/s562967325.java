import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System. in);
      
      	boolean isBad = false;
      	String str = sc.next();
      	//String [] strArr = str.split("");
      	String a = "";
      
      	for (int i = 0; i <= 3; i++){
          //	System.out.println(strArr[i]);
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