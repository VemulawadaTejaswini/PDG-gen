public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        String ss = s.toUpperCase();
        if(s.equals(ss)){
            System.out.println("A");
        }else{
            System.out.println("a");
        }
    }
}
