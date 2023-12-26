class Main
{
    public static void main(String[] args)
    {
        int ans = 0;
        int count = 0;
        int a;
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String[] ar = n.split("");
        a = n.length();
        for(int i = 0; i < a;i++){
            switch (ar[i]){
                case "+":
                    ans = ans + 1;
                    break;
                case "-":
                    ans = ans - 1;
                    break;
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}
