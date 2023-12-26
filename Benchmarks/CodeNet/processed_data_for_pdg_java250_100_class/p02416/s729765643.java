public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
    while(kbd.hasNext()){
        String n = kbd.next();
        if(!(n.equals("0"))){
        int sum = 0;
        int i=0;
        for(; i<n.length(); i++){
            String a = n.substring(i,i+1);
            int b = Integer.parseInt(a);
            sum += b;
        }
            System.out.println(sum);
        }
    }
    }
}       
