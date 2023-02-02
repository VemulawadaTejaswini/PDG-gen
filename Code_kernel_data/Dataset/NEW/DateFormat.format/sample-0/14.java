//14
public class func{
public void getHeaderSection(){
    return String.format(".TH %s %d \"%s\" \"%s-%s\" \"%s\"\n", Version.PROJECT_NAME, 1, "Licensed under GPLv3", Version.RELEASE_VERSION, Version.BUILD_VERSION, df.format(new Date()));
}
}
