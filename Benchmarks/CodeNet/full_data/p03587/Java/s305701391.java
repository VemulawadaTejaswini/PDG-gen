public class Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        String s = sc.next();
        int count = 0;
        char[] cArray = s.toCharArray();
        
        for(Character c : cArray){
            if(c.equals('1')) count++;
        }
        
        System.out.println(count);
    }
    
}