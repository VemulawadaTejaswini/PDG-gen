public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split("");
        int count = 0;
        int countStart = 0;
        int countEnd = 0;
        for (int i = 0; i < str.length; ++i){
            if (str[i].equals("A")){    
                countStart = 1;
            }
            if (countStart == 1){  
                ++count;
                if (str[i].equals("Z")){  
                    countEnd = count;
                }
            }
        }
        System.out.println(countEnd);
    }
}
