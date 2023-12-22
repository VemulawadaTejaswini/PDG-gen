import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Character> hm = new HashMap<>();
        char arr[] = new char[] { 'r','p','s' };
        hm.put('r', 'p'); hm.put('p','s'); hm.put('s', 'r');
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt(),  s = sc.nextInt(), p = sc.nextInt();

        String comp = sc.next();

        String hum = "";
        Integer ans = 0;
        for (int i = 0; i < comp.length(); i ++) {
            char temp = hm.get(comp.charAt(i));
            if (i - k >= 0 && hum.charAt(i - k) != temp) {
                hum += temp;
                if (temp == 'r') ans += r; else if (temp == 's') ans += s;
                else ans += p;
            }

            else if (i - k >= 0 && hum.charAt(i - k) == temp) {
                if (i + k < n) {
                    char temp2 = hm.get(comp.charAt(i + k));
                    for (int j = 0; j < 3; j ++){
                        if (arr[j] != temp && arr[j] != temp2) {
                            hum += arr[j];
                            break;
                        }
                    }
                }
                else {
                    hum += comp.charAt(i);
                }
            }
            else {
                hum += temp;
                if (temp == 'r') ans += r; else if (temp == 's') ans += s;
                else ans += p;
            }

        }
        System.out.println(ans);
    }
}