class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        List<String> list = new ArrayList<>();
        int i = 0;
        while(sc > i) {
            String sc2 = scanner.next();
            list.add(sc2);
            i++;
        }
        if(list.size() == new HashSet<>(list).size()) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
