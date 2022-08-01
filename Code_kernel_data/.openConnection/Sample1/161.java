//160
public class func{
	public void onSubmit(AjaxRequestTarget target,Form form){
                if (logo.getDefaultModelObjectAsString() != null) {
                    try { 
                        URL url = new URL(logo.getDefaultModelObjectAsString());
                        URLConnection conn = url.openConnection();
                        type.getModel().setObject(conn.getContentType());
                        BufferedImage image = ImageIO.read(conn.getInputStream());
                        height.setModelValue("" + image.getHeight());
                        width.setModelValue("" + image.getWidth());
                    } catch (Exception e) {
                    }
                }
}
}
