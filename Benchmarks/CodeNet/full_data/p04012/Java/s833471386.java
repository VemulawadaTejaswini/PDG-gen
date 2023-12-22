    import java.util.Scanner;
    class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if(n.length() % 2 == 1){
        System.out.println("no");
        System.exit(0);
        }else{
            boolean b = true;
            String s = "abcdefghijklmnopqrstuvwxyz";
            for(int i =0;i<26;i++){
                int count = 0;
                String compStr = String.valueOf(s.charAt(i));
                for(int j=0;j<n.length();j++){
                    String target = String.valueOf(n.charAt(j));
                    if(target.equals(compStr)){ count++; }
                }
                if(count %2 == 1){b=false;}
            }
            if(b){System.out.println("Yes");}
            }
        }
    }