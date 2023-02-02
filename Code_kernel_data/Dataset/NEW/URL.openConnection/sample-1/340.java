//340
public class func{
public void openTicket(){
        URL url = new URL(URL_TICKET);
        URLConnection conn = url.openConnection();
        return getCookie(COOKIE_TICKET, conn);
}
}
