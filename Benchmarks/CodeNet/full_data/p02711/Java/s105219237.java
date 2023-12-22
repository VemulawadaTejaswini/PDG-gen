import java.util.Scanner;

class Main{

  	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
        if(str.contains("7")){
        	System.out.println("yes");
        }else{
        	System.out.println("no");
        }
        scan.close();
    }

}