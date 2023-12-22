import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	String N = sc.nextLine();

    	if(N.equals("A")){
    		System.out.println("T");
    	}else if(N.equals("T")){
    		System.out.println("A");
    	}else if (N.equals("C")){
    		System.out.println("G");
    	}else {
    		System.out.println("C");
    	}



}

}
