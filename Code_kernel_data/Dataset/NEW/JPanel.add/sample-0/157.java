//157
public class func{
public void addChart(Chart chart,int id){
            chartPanel.add((java.awt.Component) chart.getCanvas(), BorderLayout.CENTER);
            add(chartPanel, "cell 0 " + id + ", grow");
}
}
