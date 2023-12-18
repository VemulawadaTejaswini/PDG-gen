public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;  
        int[] file;
        file = new int[10000];
        int cnt=0;
        String line;
        while(true){
            line = sc.nextLine();
            num = Integer.parseInt(line);
            if(num == 0)
                break;
            file[cnt] = num;
            cnt++;
        }
        for(int i=0; i<cnt; i++){
            System.out.println("Case " + (i+1) + ": " + file[i]);
        }
        sc.close();
    }
}
