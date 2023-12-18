public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
    int i =1;
    while(kbd.hasNext()){
        int x = kbd.nextInt();
        if(x!=0){
        System.out.println("Case "+i+": "+x);
        i++;
        }
    }
    }
}
