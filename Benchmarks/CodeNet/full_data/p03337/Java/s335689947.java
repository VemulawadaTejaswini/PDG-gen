public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c1 = a+b;
    int c2 = a-b;
    int c3 = a*b;
    int ans = 0;

    if(c1 >= c2){
        if(c1 >= c3){
        ans = c1;
        } else {
        ans = c3;
        }
    } else {
        if(c2 >= c3){
        ans = c2;
        } else {
        ans = c3;
    }

    System.out.println(ans);
    }
}