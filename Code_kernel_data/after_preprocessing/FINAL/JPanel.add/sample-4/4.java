public class func{
public void testComponentParent(){
        JButton bean = new JButton();
        panel.add(bean);
        Object value = InvokerHelper.getProperty(bean, "parent");
        assertTrue(value != null);
}
}
