public class Main{
	public static void main(String args[]){
        String a = args[0];
        String b = args[1];
        String c = args[2];
        if(a == "7"&& b == "5"&& c == "5"){
            System.out.print("YES");
        }else if(a == "5"&& b == "7"&& c == "5"){
            System.out.print("YES");
        }else if(a == "5"&& b == "5"&& c == "7"){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}