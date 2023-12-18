public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean can=true;
        int i=1;
        while(can){
            int x=sc.nextInt();
            if(x!=0){
                System.out.println("Case"+" "+i+":"+" "+x);
                i++;
            }
            else can=false;
        }
    }
}
