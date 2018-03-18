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
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author ma8521e
 */
public class ColorMixerBeanInfo extends SimpleBeanInfo {

    private final static Class myClass = ColorMixer.class;


    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        System.out.println("sd");
        try {
            PropertyDescriptor red = new PropertyDescriptor("red",
                    myClass);
            PropertyDescriptor green = new PropertyDescriptor("green",
                    myClass);
            PropertyDescriptor blue = new PropertyDescriptor("blue",
                    myClass);
            PropertyDescriptor brightness = new PropertyDescriptor("brightness",
                    myClass);
          PropertyDescriptor mix = new PropertyDescriptor("mix",
                    myClass);
            PropertyDescriptor[] pds = new PropertyDescriptor[]{red, green, blue, brightness,mix};
            return pds;
        } catch (IntrospectionException ex) {
            return null;
        }
    }

    @Override
    // Get the image to use as an icon.  Note that the image files need to be included
// in the bean's jar file.  One way is to put them in the same folder as the .java files
// Another way is to create a folder (e.g. called icons) and in NetBeans 
// right-click the project and choose Properties->Sources to add that folder 
// to the Source Packages folders
    public Image getIcon(int iconKind) {
        switch (iconKind) {
            case BeanInfo.ICON_COLOR_16x16:
                return loadImage("/colormixerbean/icons/paint-palette.png");
            case BeanInfo.ICON_COLOR_32x32:
                return loadImage("/colormixerbean/icons/paint-palette.png");
            case BeanInfo.ICON_MONO_16x16:
                return loadImage("/colormixerbean/icons/paint-palette.png");
            case BeanInfo.ICON_MONO_32x32:
                return loadImage("/colormixerbean/icons/paint-palette.png");
        }
        return null;
    }

}
