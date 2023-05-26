public class func{
public void nextPage(){
            if(RELATIVE_LINK_NOT_FOUND.equals(nextPageUrl)) {
                throw new IllegalStateException("GitHub API no more issues to fetch");
            }
            URL url = new URL(nextPageUrl);
            LOG.info("GitHub API querying issue page {}", queryParamValue(url, "page"));
            URLConnection urlConnection = url.openConnection();
            LOG.info("GitHub API rate info => Remaining : {}, Limit : {}",
                    urlConnection.getHeaderField("X-RateLimit-Remaining"),
                    urlConnection.getHeaderField("X-RateLimit-Limit")
            );
            nextPageUrl = extractRelativeLink(urlConnection.getHeaderField("Link"), "next");
            return parseJsonFrom(urlConnection);
}
}
