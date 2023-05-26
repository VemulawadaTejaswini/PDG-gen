public class func{
public void openTicket(){
        URL url = new URL(JSTORFetcher.URL_TICKET);
        URLConnection conn = url.openConnection();
        return JSTORFetcher.getCookie(JSTORFetcher.COOKIE_TICKET, conn);
}
}
