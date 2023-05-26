public class func{
public void run(){
                                    URL url = classLoader.getResource(resourceName);
                                    if (url != null) {
                                        URLConnection connection = url.openConnection();
                                        if (connection != null) {
                                            connection.setUseCaches(false);
                                            is = connection.getInputStream();
                                        }
                                    }
}
}
