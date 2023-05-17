public class func{
public void CueBannerPanel(String welcomeLogo){
        ClassLoader cl = Lookup.getDefault().lookup(ClassLoader.class);
        if (cl != null) {
            ImageIcon icon = new ImageIcon(cl.getResource(welcomeLogo));
            autopsyLogo.setIcon(icon);
        }
}
}
