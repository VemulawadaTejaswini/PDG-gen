//8
public class func{
public void componentFor(Object o){
          Viewer subView=new SmartVanillaViewer(sa.segmenter);
          subView.setSuperView(this);
          mainPanel.add(subView);
          return new JScrollPane(mainPanel);
}
}
