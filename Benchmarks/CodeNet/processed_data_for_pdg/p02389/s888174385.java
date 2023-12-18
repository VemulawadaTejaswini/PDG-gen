class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int v = Integer.valueOf(sc.next());
        int h = Integer.valueOf(sc.next());
        System.out.println(v*h + " " + 2*(v+h));
        sc.close();
    }
}
