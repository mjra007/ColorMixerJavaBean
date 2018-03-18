/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colormixerbean;

import java.awt.Color;
import java.awt.FlowLayout;
import java.beans.PropertyChangeSupport;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;

/**
 *
 * @author ma8521e
 */
public class ColorMixer extends JMenuItem {


    public ColorMixer() {
        initComponents();
        new ColorMixerController(this);
        red = 255;
        green = 255;
        blue = 255;
        brightness = 0.0f;
        mix = new Color(255, 255, 255);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        panGreenScroller = new javax.swing.JPanel();
        lblGreen = new javax.swing.JLabel();
        scrGreen = new javax.swing.JScrollBar();
        panRedScroller = new javax.swing.JPanel();
        lblred = new javax.swing.JLabel();
        scrRed = new javax.swing.JScrollBar();
        panBlueScroller = new javax.swing.JPanel();
        lblBlue = new javax.swing.JLabel();
        scrBlue = new javax.swing.JScrollBar();
        panBrightness = new javax.swing.JPanel();
        lblBrightness = new javax.swing.JLabel();
        scrBrightness = new javax.swing.JScrollBar();
        lblFinalColor = new javax.swing.JLabel();
        labColor = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(300, 170));
        this.setMinimumSize(new java.awt.Dimension(300, 170));
        this.setMaximumSize(new java.awt.Dimension(300, 170));
        this.setLayout(new FlowLayout());
        panGreenScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panGreenScroller.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        panGreenScroller.setOpaque(false);

        lblGreen.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblGreen.setText("Green");
        lblGreen.setPreferredSize(new java.awt.Dimension(35, 14));
        panGreenScroller.add(lblGreen);
        scrGreen.setMaximum(256);
        scrGreen.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrGreen.setVisibleAmount(1);
        scrGreen.setPreferredSize(new java.awt.Dimension(150, 16));
        panGreenScroller.add(scrGreen);

        add(panGreenScroller);

        panRedScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panRedScroller.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        panRedScroller.setOpaque(false);
        lblred.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblred.setText("Red");
        lblred.setPreferredSize(new java.awt.Dimension(35, 14));

        panRedScroller.add(lblred);

        scrRed.setMaximum(256);
        scrRed.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrRed.setVisibleAmount(1);
        scrRed.setPreferredSize(new java.awt.Dimension(150, 16));
        panRedScroller.add(scrRed);

        add(panRedScroller);

        panBlueScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panBlueScroller.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        lblBlue.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblBlue.setText("Blue");
        lblBlue.setPreferredSize(new java.awt.Dimension(35, 14));
        panBlueScroller.setOpaque(false);

        panBlueScroller.add(lblBlue);

        scrBlue.setMaximum(256);
        scrBlue.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrBlue.setVisibleAmount(1);
        scrBlue.setPreferredSize(new java.awt.Dimension(150, 16));

        panBlueScroller.add(scrBlue);

        add(panBlueScroller);

        lblBrightness.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblBrightness.setText("Brightness");
        panBrightness.add(lblBrightness);

        scrBrightness.setMaximum(110);
        scrBrightness.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrBrightness.setValue(50);
        scrBrightness.setPreferredSize(new java.awt.Dimension(150, 16));
        panBrightness.setOpaque(false);
        panBrightness.add(scrBrightness);

        add(panBrightness);

        lblFinalColor.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblFinalColor.setText("Final Colour");
        add(lblFinalColor);

        labColor.setBackground(new java.awt.Color(0, 0, 0));
        labColor.setText("           ");
        labColor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labColor.setOpaque(true);
        add(labColor);

    }

    public JScrollBar getscrBlue() {
        return this.scrBlue;
    }

    public JScrollBar getscrRed() {
        return this.scrRed;
    }

    public JScrollBar getscrGreen() {
        return this.scrGreen;
    }

    public JScrollBar getscrBrightness() {
        return this.scrBrightness;
    }

    public JLabel getlblColor() {
        return this.labColor;
    }
    public Color getMix(){
        return mix;
    }

    /**
     *
     * @return color with brightness applied
     */

    /**
     *
     * @return just the color without the brightness
     */
    public Color getColor() {
        return new Color(getRed(), getGreen(), getBlue());
    }

    /**
     *
     * @return just brightness
     */
    public float getBrightness() {
        return this.brightness;
    }

    /**
     *
     * @return the red color
     */
    public int getRed() {
        return this.red;
    }

    /**
     *
     * @return the green color
     */
    public int getGreen() {
        return this.green;
    }

    /**
     *
     * @return the blue color
     */
    public int getBlue() {
        return this.blue;
    }

    public void setRed(int r) {
        this.red = r;
        setColor(new Color(r,getColor().getGreen(), getColor().getBlue()));
    }

    public void setGreen(int g) {
        this.green = g;
        setColor(new Color(getColor().getRed(),g,getColor().getBlue()));

    }

    public void setBlue(int b) {
        this.blue = b;
        setColor(new Color(getColor().getRed(),getColor().getGreen(),b));

    }

    public void setBrightness(float f) {
        this.brightness = f;
        setColor(this.getColor());
    }

    public void setColor(Color c) {
        this.red = c.getRed();
        this.green = c.getGreen();
        this.blue = c.getBlue();
        setMix(getColorBrightness(c,getBrightness()));
    }

    public Color getColorBrightness(Color c, float brightness){
        int redBright = (int) (getRed() * (100 - getBrightness()) / 100);
        int greenBright = (int) (getGreen() * (100 - getBrightness()) / 100);
        int blueBright = (int) (getBlue() * (100 - getBrightness()) / 100);
        Color newColor = new Color(redBright, greenBright, blueBright);
        return newColor;
    }
    
    public void setMix(Color c) {
        firePropertyChange("colormix", mix, c);
        mix=c;
    }
    
    private int red;
    private int green;
    private int blue;
    private float brightness;
    private Color mix;
    private javax.swing.JLabel lblBrightness;
    private javax.swing.JLabel lblred;
    private javax.swing.JLabel lblGreen;
    private javax.swing.JLabel lblBlue;
    private javax.swing.JLabel lblFinalColor;
    private javax.swing.JLabel labColor;
    private javax.swing.JPanel panBlueScroller;
    private javax.swing.JPanel panBrightness;
    private javax.swing.JPanel panGreenScroller;
    private javax.swing.JPanel panRedScroller;
    private javax.swing.JScrollBar scrBlue;
    private javax.swing.JScrollBar scrBrightness;
    private javax.swing.JScrollBar scrGreen;
    private javax.swing.JScrollBar scrRed;
    // End of variables declaration//GEN-END:variables

}
