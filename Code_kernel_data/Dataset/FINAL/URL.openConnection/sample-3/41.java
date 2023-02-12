public class func{
public void getURLConnection(String originalPath,boolean virtual){
        ServletContextAndPath csAndP = getServletContextAndPath(originalPath,
                virtual);
        ServletContext context = csAndP.getServletContext();
        String path = csAndP.getPath();
        URL url = context.getResource(path);
        if (url == null) {
            throw new IOException("Context did not contain resource: " + path);
        }
        URLConnection urlConnection = url.openConnection();
}
}
