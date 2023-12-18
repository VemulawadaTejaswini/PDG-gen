public class Main { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(true) {
        int line = scan.nextInt();
        if(line == 0)
            break;
        System.out.println("Case " + i + ": " + line);                      
        i++;
        }
    }   
}   
