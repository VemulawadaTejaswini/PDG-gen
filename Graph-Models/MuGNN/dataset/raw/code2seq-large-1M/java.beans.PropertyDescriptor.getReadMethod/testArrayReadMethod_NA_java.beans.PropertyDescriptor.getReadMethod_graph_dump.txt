Line_2 $$ public void testArrayReadMethod() throws Exception --> Line_3 $$ final PropertyDescriptor descriptor = propertyUtilsBean.getPropertyDescriptor(bean, "stringArray") [CD]
Line_2 $$ public void testArrayReadMethod() throws Exception --> Line_4 $$ assertNotNull("No Array Read Method", descriptor.getReadMethod()) [CD]
Line_3 $$ final PropertyDescriptor descriptor = propertyUtilsBean.getPropertyDescriptor(bean, "stringArray") --> Line_4 $$ assertNotNull("No Array Read Method", descriptor.getReadMethod()) [FD]
