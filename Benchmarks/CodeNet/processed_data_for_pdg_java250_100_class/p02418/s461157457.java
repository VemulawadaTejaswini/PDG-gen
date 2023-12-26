public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String p=scanner.next();
        s=s+s;
        int index=s.indexOf(p);
        if(index==-1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
