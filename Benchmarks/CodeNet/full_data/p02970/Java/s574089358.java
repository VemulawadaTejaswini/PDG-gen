public class Main {
 
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int maxOrMin = Integer.parseInt(scn.nextLine());
 
        int hatena = 0;
        int x = 0;
        int y = 0;
 
        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
            case 'L':
                x -= 1;
                break;
 
            case 'R':
                x += 1;
                break;
 
            case 'U':
                y -= 1;
                break;
 
            case 'D':
                y += 1;
                break;
            case '?':
                hatena += 1;
                break;
            }
 
        }
 
        int ans = Math.abs(x) + Math.abs(y);
        if(maxOrMin == 1){
            ans += hatena;
        }else if((ans - hatena) > 0){
            ans -= hatena;
        }else {
            if((hatena + ans) % 2 == 0) ans = 0;
            else ans = 1;
        }
 
        System.out.println(ans);
    }
}