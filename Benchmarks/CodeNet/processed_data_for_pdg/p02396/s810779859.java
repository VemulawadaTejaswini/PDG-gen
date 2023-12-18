public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x,co=1;
        while(true){
            x = s.nextInt();
            if(x==0)break;
            else System.out.println("Case "+co+": "+x);
            co++;
        }
    }
}
