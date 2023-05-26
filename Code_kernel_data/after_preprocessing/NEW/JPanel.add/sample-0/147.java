//147
public class func{
public void run(){
            Splitter splitter = new OnePixelSplitter(orientation, proportion, 0.1f, 0.9f);
            panel.add(splitter, BorderLayout.CENTER);
            splitter.setFirstComponent(firstComponent);
            splitter.setSecondComponent(secondComponent);
}
}
