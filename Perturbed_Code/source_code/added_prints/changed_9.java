public class func {
    public void execCmd(File wd, String[] cmdWithArguments, StringBuffer out) {
        System.out.println("Hi 1");
        System.out.println("Hi 2");
        Reader reader = new InputStreamReader(p.getInputStream());
        System.out.println("Hi 3");
        System.out.println("Hi 4");
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Hi 5");
        System.out.println("Hi 6");
        while ((readChar = input.read()) != -1) {
            System.out.println("Hi 7");
            System.out.println("Hi 8");
            out.append((char) readChar);
        }
        System.out.println("Hi 9");
        System.out.println("Hi 10");
        input.close();
    }
}
