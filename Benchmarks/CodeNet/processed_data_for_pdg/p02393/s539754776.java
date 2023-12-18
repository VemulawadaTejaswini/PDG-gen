class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String is = r.readLine();
        String[] sp = is.split(" ");
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(Integer.parseInt(sp[0]));
        al.add(Integer.parseInt(sp[1]));
        al.add(Integer.parseInt(sp[2]));
        Collections.sort(al);
        System.out.println(al.get(0) + " " + al.get(1) + " " + al.get(2));
    }
}
