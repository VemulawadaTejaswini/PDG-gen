public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        char c[] = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(c[i] == '1'){
                System.out.print(9);
            }else{
                System.out.print(1);
            }
        }        
        System.out.println();
    }
}
