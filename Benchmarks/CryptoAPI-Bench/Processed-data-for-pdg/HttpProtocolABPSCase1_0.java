public class Dummy {
    public static void main(String[] args) throws Exception {
        int choice = 2;
        String url = "http:
        if(choice>1)
            url = "https:
        System.out.println(new URL(url));
    }
}
