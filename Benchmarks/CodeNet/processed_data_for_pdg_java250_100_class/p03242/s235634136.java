public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        String Ans = "";
        for (int i=0;i<3;i++){Ans += (a[i]=='1')?"9":"1";}
        System.out.println(Ans);
        sc.close();
    }
}
