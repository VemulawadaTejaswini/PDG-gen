public class Main {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        String result = "Yes";
        s = sc.next();
        for(int i = 0; i < s.length(); i++){
            int index = s.indexOf("L", i);
            if(index != -1){
                if((index + 1) % 2 != 0){
                    result = "No";
                }
                i = index;
            }
        }
        for(int i = 0; i < s.length(); i++){
            int index = s.indexOf("R", i);
            if(index != -1){    
                if((index + 1) % 2 == 0){
                    result = "No";
                }
                i = index;
            }
        }
        System.out.println(result);
    }
}
