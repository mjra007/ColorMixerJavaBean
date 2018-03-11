/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colormixerbean;

import java.awt.Image;
import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author ma8521e
 */
public class ColorMixerBeanInfo extends SimpleBeanInfo {

    @Override
    public BeanDescriptor getBeanDescriptor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDefaultEventIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor red = new PropertyDescriptor("red",
                    ColorMixer.class, "getRed", "setRed");
            PropertyDescriptor green = new PropertyDescriptor("green",
                    ColorMixer.class, "getGreen", "setRed");
            PropertyDescriptor blue = new PropertyDescriptor("blue",
                    ColorMixer.class, "getBlue", "setBlue");
            PropertyDescriptor brightness = new PropertyDescriptor("brightness",
                    ColorMixer.class, "getBrightness", "setBrightness");
            PropertyDescriptor mix = new PropertyDescriptor("mix",
                    ColorMixer.class, "getMix", "setMix");
            PropertyDescriptor[] pds = new PropertyDescriptor[]{red, green, blue, brightness,mix};
            return pds;
        } catch (IntrospectionException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public int getDefaultPropertyIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public MethodDescriptor[] getMethodDescriptors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BeanInfo[] getAdditionalBeanInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Image getIcon(int iconKind) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
