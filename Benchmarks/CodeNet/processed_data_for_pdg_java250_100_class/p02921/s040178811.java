public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        String[] s_arr =  s.split("");
        String[] t_arr =  t.split("");
        int count=0;
        for(int i = 0;i<s_arr.length;i++){
            if(s_arr[i].equals(t_arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
