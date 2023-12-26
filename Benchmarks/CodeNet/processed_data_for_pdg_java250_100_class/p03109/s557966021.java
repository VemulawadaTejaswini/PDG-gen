public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        char c[] = s.toCharArray();
        boolean heisei = true;
        if(c[5] == '1'){
            heisei = false;
        }else if(c[6] == '5' ||c[6] == '6' ||c[6] == '7' ||c[6] == '8' ||c[6] == '9'){
            heisei = false;
        }
        if(heisei){
            System.out.println("Heisei");
        }else{
            System.out.println("TBD");
        }
    }
}
