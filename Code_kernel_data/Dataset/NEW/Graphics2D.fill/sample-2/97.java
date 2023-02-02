//97
public class func{
public void drawWord(EngineWord word,Color color){
        Graphics2D g2 = ((PGraphicsJava2D)destination).g2;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(color);
        g2.fill(path2d);
}
}
