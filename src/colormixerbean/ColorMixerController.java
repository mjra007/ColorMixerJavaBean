/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colormixerbean;

import java.awt.Color;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author ma8521e
 */
public class ColorMixerController {

    private ColorMixer view;


    public ColorMixerController(ColorMixer viewBean) {
        view = viewBean;
        setupAdjustmentListeners();
    }

    public void setupAdjustmentListeners() {
        view.getscrBlue().addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrColourAdjustmentHandler(evt);
            }
        });
        view.getscrRed().addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrColourAdjustmentHandler(evt);
            }
        });
        view.getscrGreen().addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrColourAdjustmentHandler(evt);
            }
        });
        view.getscrBrightness().addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrBrightnessAdjustmentHandler(evt);
            }
        });
        
    }

    private void scrColourAdjustmentHandler(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrColourAdjustmentHandler
        int currentRed, currentGreen, currentBlue;
        currentRed = view.getscrRed().getValue();
        currentGreen = view.getscrGreen().getValue();
        currentBlue = view.getscrBlue().getValue();
        view.setColor(new Color(currentRed, currentGreen, currentBlue));
        updateColorDisplay();
    }

    private void scrBrightnessAdjustmentHandler(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrColourAdjustmentHandler
        view.setBrightness(view.getscrBrightness().getValue());
        updateColorDisplay();
    }

    private void updateColorDisplay() {
        view.getlblColor().setBackground(view.getMix());
    }

}
