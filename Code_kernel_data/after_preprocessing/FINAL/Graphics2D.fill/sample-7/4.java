public class func{
public void paintIcon(java.awt.Component c,java.awt.Graphics gr,int x,int y){
        DrawingView view = editor.getActiveView();
        if (view != null && view.getSelectedFigures().size() == 1) {
            color = view.getSelectedFigures().iterator().next().get(key);
        } else {
            color = key.get(editor.getDefaultAttributes());
        }
        if (color != null) {
            g.setColor(color);
            g.translate(x, y);
            g.fill(colorShape);
            g.translate(-x, -y);
        }
}
}
