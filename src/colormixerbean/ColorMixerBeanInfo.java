/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colormixerbean;

import java.beans.*;

/**
 *
 * @author micae
 */
public class ColorMixerBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( colormixerbean.ColorMixer.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accelerator = 0;
    private static final int PROPERTY_accessibleContext = 1;
    private static final int PROPERTY_action = 2;
    private static final int PROPERTY_actionCommand = 3;
    private static final int PROPERTY_actionListeners = 4;
    private static final int PROPERTY_actionMap = 5;
    private static final int PROPERTY_alignmentX = 6;
    private static final int PROPERTY_alignmentY = 7;
    private static final int PROPERTY_ancestorListeners = 8;
    private static final int PROPERTY_armed = 9;
    private static final int PROPERTY_autoscrolls = 10;
    private static final int PROPERTY_background = 11;
    private static final int PROPERTY_backgroundSet = 12;
    private static final int PROPERTY_baselineResizeBehavior = 13;
    private static final int PROPERTY_blue = 14;
    private static final int PROPERTY_border = 15;
    private static final int PROPERTY_borderPainted = 16;
    private static final int PROPERTY_bounds = 17;
    private static final int PROPERTY_brightness = 18;
    private static final int PROPERTY_changeListeners = 19;
    private static final int PROPERTY_color = 20;
    private static final int PROPERTY_colorModel = 21;
    private static final int PROPERTY_component = 22;
    private static final int PROPERTY_componentCount = 23;
    private static final int PROPERTY_componentListeners = 24;
    private static final int PROPERTY_componentOrientation = 25;
    private static final int PROPERTY_componentPopupMenu = 26;
    private static final int PROPERTY_components = 27;
    private static final int PROPERTY_containerListeners = 28;
    private static final int PROPERTY_contentAreaFilled = 29;
    private static final int PROPERTY_cursor = 30;
    private static final int PROPERTY_cursorSet = 31;
    private static final int PROPERTY_debugGraphicsOptions = 32;
    private static final int PROPERTY_disabledIcon = 33;
    private static final int PROPERTY_disabledSelectedIcon = 34;
    private static final int PROPERTY_displayable = 35;
    private static final int PROPERTY_displayedMnemonicIndex = 36;
    private static final int PROPERTY_doubleBuffered = 37;
    private static final int PROPERTY_dropTarget = 38;
    private static final int PROPERTY_enabled = 39;
    private static final int PROPERTY_focusable = 40;
    private static final int PROPERTY_focusCycleRoot = 41;
    private static final int PROPERTY_focusCycleRootAncestor = 42;
    private static final int PROPERTY_focusListeners = 43;
    private static final int PROPERTY_focusOwner = 44;
    private static final int PROPERTY_focusPainted = 45;
    private static final int PROPERTY_focusTraversable = 46;
    private static final int PROPERTY_focusTraversalKeys = 47;
    private static final int PROPERTY_focusTraversalKeysEnabled = 48;
    private static final int PROPERTY_focusTraversalPolicy = 49;
    private static final int PROPERTY_focusTraversalPolicyProvider = 50;
    private static final int PROPERTY_focusTraversalPolicySet = 51;
    private static final int PROPERTY_font = 52;
    private static final int PROPERTY_fontSet = 53;
    private static final int PROPERTY_foreground = 54;
    private static final int PROPERTY_foregroundSet = 55;
    private static final int PROPERTY_graphics = 56;
    private static final int PROPERTY_graphicsConfiguration = 57;
    private static final int PROPERTY_green = 58;
    private static final int PROPERTY_height = 59;
    private static final int PROPERTY_hideActionText = 60;
    private static final int PROPERTY_hierarchyBoundsListeners = 61;
    private static final int PROPERTY_hierarchyListeners = 62;
    private static final int PROPERTY_horizontalAlignment = 63;
    private static final int PROPERTY_horizontalTextPosition = 64;
    private static final int PROPERTY_icon = 65;
    private static final int PROPERTY_iconTextGap = 66;
    private static final int PROPERTY_ignoreRepaint = 67;
    private static final int PROPERTY_inheritsPopupMenu = 68;
    private static final int PROPERTY_inputContext = 69;
    private static final int PROPERTY_inputMap = 70;
    private static final int PROPERTY_inputMethodListeners = 71;
    private static final int PROPERTY_inputMethodRequests = 72;
    private static final int PROPERTY_inputVerifier = 73;
    private static final int PROPERTY_insets = 74;
    private static final int PROPERTY_itemListeners = 75;
    private static final int PROPERTY_keyListeners = 76;
    private static final int PROPERTY_label = 77;
    private static final int PROPERTY_layout = 78;
    private static final int PROPERTY_lblColor = 79;
    private static final int PROPERTY_lightweight = 80;
    private static final int PROPERTY_locale = 81;
    private static final int PROPERTY_location = 82;
    private static final int PROPERTY_locationOnScreen = 83;
    private static final int PROPERTY_managingFocus = 84;
    private static final int PROPERTY_margin = 85;
    private static final int PROPERTY_maximumSize = 86;
    private static final int PROPERTY_maximumSizeSet = 87;
    private static final int PROPERTY_menuDragMouseListeners = 88;
    private static final int PROPERTY_menuKeyListeners = 89;
    private static final int PROPERTY_minimumSize = 90;
    private static final int PROPERTY_minimumSizeSet = 91;
    private static final int PROPERTY_mix = 92;
    private static final int PROPERTY_mnemonic = 93;
    private static final int PROPERTY_model = 94;
    private static final int PROPERTY_mouseListeners = 95;
    private static final int PROPERTY_mouseMotionListeners = 96;
    private static final int PROPERTY_mousePosition = 97;
    private static final int PROPERTY_mouseWheelListeners = 98;
    private static final int PROPERTY_multiClickThreshhold = 99;
    private static final int PROPERTY_name = 100;
    private static final int PROPERTY_nextFocusableComponent = 101;
    private static final int PROPERTY_opaque = 102;
    private static final int PROPERTY_optimizedDrawingEnabled = 103;
    private static final int PROPERTY_paintingForPrint = 104;
    private static final int PROPERTY_paintingTile = 105;
    private static final int PROPERTY_parent = 106;
    private static final int PROPERTY_peer = 107;
    private static final int PROPERTY_preferredSize = 108;
    private static final int PROPERTY_preferredSizeSet = 109;
    private static final int PROPERTY_pressedIcon = 110;
    private static final int PROPERTY_propertyChangeListeners = 111;
    private static final int PROPERTY_propertyChangeSupport = 112;
    private static final int PROPERTY_red = 113;
    private static final int PROPERTY_registeredKeyStrokes = 114;
    private static final int PROPERTY_requestFocusEnabled = 115;
    private static final int PROPERTY_rolloverEnabled = 116;
    private static final int PROPERTY_rolloverIcon = 117;
    private static final int PROPERTY_rolloverSelectedIcon = 118;
    private static final int PROPERTY_rootPane = 119;
    private static final int PROPERTY_scrBlue = 120;
    private static final int PROPERTY_scrBrightness = 121;
    private static final int PROPERTY_scrGreen = 122;
    private static final int PROPERTY_scrRed = 123;
    private static final int PROPERTY_selected = 124;
    private static final int PROPERTY_selectedIcon = 125;
    private static final int PROPERTY_selectedObjects = 126;
    private static final int PROPERTY_showing = 127;
    private static final int PROPERTY_size = 128;
    private static final int PROPERTY_subElements = 129;
    private static final int PROPERTY_text = 130;
    private static final int PROPERTY_toolkit = 131;
    private static final int PROPERTY_toolTipText = 132;
    private static final int PROPERTY_topLevelAncestor = 133;
    private static final int PROPERTY_transferHandler = 134;
    private static final int PROPERTY_treeLock = 135;
    private static final int PROPERTY_UI = 136;
    private static final int PROPERTY_UIClassID = 137;
    private static final int PROPERTY_valid = 138;
    private static final int PROPERTY_validateRoot = 139;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 140;
    private static final int PROPERTY_verticalAlignment = 141;
    private static final int PROPERTY_verticalTextPosition = 142;
    private static final int PROPERTY_vetoableChangeListeners = 143;
    private static final int PROPERTY_visible = 144;
    private static final int PROPERTY_visibleRect = 145;
    private static final int PROPERTY_width = 146;
    private static final int PROPERTY_x = 147;
    private static final int PROPERTY_y = 148;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[149];
    
        try {
            properties[PROPERTY_accelerator] = new PropertyDescriptor ( "accelerator", colormixerbean.ColorMixer.class, "getAccelerator", "setAccelerator" ); // NOI18N
            properties[PROPERTY_accelerator].setHidden ( true );
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", colormixerbean.ColorMixer.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_accessibleContext].setHidden ( true );
            properties[PROPERTY_action] = new PropertyDescriptor ( "action", colormixerbean.ColorMixer.class, "getAction", "setAction" ); // NOI18N
            properties[PROPERTY_action].setHidden ( true );
            properties[PROPERTY_actionCommand] = new PropertyDescriptor ( "actionCommand", colormixerbean.ColorMixer.class, "getActionCommand", "setActionCommand" ); // NOI18N
            properties[PROPERTY_actionCommand].setHidden ( true );
            properties[PROPERTY_actionListeners] = new PropertyDescriptor ( "actionListeners", colormixerbean.ColorMixer.class, "getActionListeners", null ); // NOI18N
            properties[PROPERTY_actionListeners].setHidden ( true );
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", colormixerbean.ColorMixer.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_actionMap].setHidden ( true );
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", colormixerbean.ColorMixer.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentX].setHidden ( true );
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", colormixerbean.ColorMixer.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_alignmentY].setHidden ( true );
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", colormixerbean.ColorMixer.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_ancestorListeners].setHidden ( true );
            properties[PROPERTY_armed] = new PropertyDescriptor ( "armed", colormixerbean.ColorMixer.class, "isArmed", "setArmed" ); // NOI18N
            properties[PROPERTY_armed].setHidden ( true );
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", colormixerbean.ColorMixer.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_autoscrolls].setHidden ( true );
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", colormixerbean.ColorMixer.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_background].setHidden ( true );
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", colormixerbean.ColorMixer.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_backgroundSet].setHidden ( true );
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", colormixerbean.ColorMixer.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior].setHidden ( true );
            properties[PROPERTY_blue] = new PropertyDescriptor ( "blue", colormixerbean.ColorMixer.class, "getBlue", "setBlue" ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", colormixerbean.ColorMixer.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_border].setHidden ( true );
            properties[PROPERTY_borderPainted] = new PropertyDescriptor ( "borderPainted", colormixerbean.ColorMixer.class, "isBorderPainted", "setBorderPainted" ); // NOI18N
            properties[PROPERTY_borderPainted].setHidden ( true );
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", colormixerbean.ColorMixer.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_bounds].setHidden ( true );
            properties[PROPERTY_brightness] = new PropertyDescriptor ( "brightness", colormixerbean.ColorMixer.class, "getBrightness", "setBrightness" ); // NOI18N
            properties[PROPERTY_changeListeners] = new PropertyDescriptor ( "changeListeners", colormixerbean.ColorMixer.class, "getChangeListeners", null ); // NOI18N
            properties[PROPERTY_changeListeners].setHidden ( true );
            properties[PROPERTY_color] = new PropertyDescriptor ( "color", colormixerbean.ColorMixer.class, "getColor", "setColor" ); // NOI18N
            properties[PROPERTY_color].setHidden ( true );
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", colormixerbean.ColorMixer.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_colorModel].setHidden ( true );
            properties[PROPERTY_component] = new PropertyDescriptor ( "component", colormixerbean.ColorMixer.class, "getComponent", null ); // NOI18N
            properties[PROPERTY_component].setHidden ( true );
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", colormixerbean.ColorMixer.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentCount].setHidden ( true );
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", colormixerbean.ColorMixer.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentListeners].setHidden ( true );
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", colormixerbean.ColorMixer.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentOrientation].setHidden ( true );
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", colormixerbean.ColorMixer.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_componentPopupMenu].setHidden ( true );
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", colormixerbean.ColorMixer.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_components].setHidden ( true );
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", colormixerbean.ColorMixer.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_containerListeners].setHidden ( true );
            properties[PROPERTY_contentAreaFilled] = new PropertyDescriptor ( "contentAreaFilled", colormixerbean.ColorMixer.class, "isContentAreaFilled", "setContentAreaFilled" ); // NOI18N
            properties[PROPERTY_contentAreaFilled].setHidden ( true );
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", colormixerbean.ColorMixer.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursor].setHidden ( true );
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", colormixerbean.ColorMixer.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_cursorSet].setHidden ( true );
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", colormixerbean.ColorMixer.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions].setHidden ( true );
            properties[PROPERTY_disabledIcon] = new PropertyDescriptor ( "disabledIcon", colormixerbean.ColorMixer.class, "getDisabledIcon", "setDisabledIcon" ); // NOI18N
            properties[PROPERTY_disabledIcon].setHidden ( true );
            properties[PROPERTY_disabledSelectedIcon] = new PropertyDescriptor ( "disabledSelectedIcon", colormixerbean.ColorMixer.class, "getDisabledSelectedIcon", "setDisabledSelectedIcon" ); // NOI18N
            properties[PROPERTY_disabledSelectedIcon].setHidden ( true );
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", colormixerbean.ColorMixer.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_displayable].setHidden ( true );
            properties[PROPERTY_displayedMnemonicIndex] = new PropertyDescriptor ( "displayedMnemonicIndex", colormixerbean.ColorMixer.class, "getDisplayedMnemonicIndex", "setDisplayedMnemonicIndex" ); // NOI18N
            properties[PROPERTY_displayedMnemonicIndex].setHidden ( true );
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", colormixerbean.ColorMixer.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_doubleBuffered].setHidden ( true );
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", colormixerbean.ColorMixer.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_dropTarget].setHidden ( true );
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", colormixerbean.ColorMixer.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_enabled].setHidden ( true );
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", colormixerbean.ColorMixer.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusable].setHidden ( true );
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", colormixerbean.ColorMixer.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRoot].setHidden ( true );
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", colormixerbean.ColorMixer.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor].setHidden ( true );
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", colormixerbean.ColorMixer.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusListeners].setHidden ( true );
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", colormixerbean.ColorMixer.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusOwner].setHidden ( true );
            properties[PROPERTY_focusPainted] = new PropertyDescriptor ( "focusPainted", colormixerbean.ColorMixer.class, "isFocusPainted", "setFocusPainted" ); // NOI18N
            properties[PROPERTY_focusPainted].setHidden ( true );
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", colormixerbean.ColorMixer.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversable].setHidden ( true );
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", colormixerbean.ColorMixer.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeys].setHidden ( true );
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", colormixerbean.ColorMixer.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled].setHidden ( true );
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", colormixerbean.ColorMixer.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy].setHidden ( true );
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", colormixerbean.ColorMixer.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider].setHidden ( true );
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", colormixerbean.ColorMixer.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet].setHidden ( true );
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", colormixerbean.ColorMixer.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_font].setHidden ( true );
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", colormixerbean.ColorMixer.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_fontSet].setHidden ( true );
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", colormixerbean.ColorMixer.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foreground].setHidden ( true );
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", colormixerbean.ColorMixer.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_foregroundSet].setHidden ( true );
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", colormixerbean.ColorMixer.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphics].setHidden ( true );
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", colormixerbean.ColorMixer.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration].setHidden ( true );
            properties[PROPERTY_green] = new PropertyDescriptor ( "green", colormixerbean.ColorMixer.class, "getGreen", "setGreen" ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", colormixerbean.ColorMixer.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_height].setHidden ( true );
            properties[PROPERTY_hideActionText] = new PropertyDescriptor ( "hideActionText", colormixerbean.ColorMixer.class, "getHideActionText", "setHideActionText" ); // NOI18N
            properties[PROPERTY_hideActionText].setHidden ( true );
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", colormixerbean.ColorMixer.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners].setHidden ( true );
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", colormixerbean.ColorMixer.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners].setHidden ( true );
            properties[PROPERTY_horizontalAlignment] = new PropertyDescriptor ( "horizontalAlignment", colormixerbean.ColorMixer.class, "getHorizontalAlignment", "setHorizontalAlignment" ); // NOI18N
            properties[PROPERTY_horizontalAlignment].setHidden ( true );
            properties[PROPERTY_horizontalTextPosition] = new PropertyDescriptor ( "horizontalTextPosition", colormixerbean.ColorMixer.class, "getHorizontalTextPosition", "setHorizontalTextPosition" ); // NOI18N
            properties[PROPERTY_horizontalTextPosition].setHidden ( true );
            properties[PROPERTY_icon] = new PropertyDescriptor ( "icon", colormixerbean.ColorMixer.class, "getIcon", "setIcon" ); // NOI18N
            properties[PROPERTY_icon].setHidden ( true );
            properties[PROPERTY_iconTextGap] = new PropertyDescriptor ( "iconTextGap", colormixerbean.ColorMixer.class, "getIconTextGap", "setIconTextGap" ); // NOI18N
            properties[PROPERTY_iconTextGap].setHidden ( true );
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", colormixerbean.ColorMixer.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_ignoreRepaint].setHidden ( true );
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", colormixerbean.ColorMixer.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu].setHidden ( true );
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", colormixerbean.ColorMixer.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputContext].setHidden ( true );
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", colormixerbean.ColorMixer.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMap].setHidden ( true );
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", colormixerbean.ColorMixer.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners].setHidden ( true );
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", colormixerbean.ColorMixer.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests].setHidden ( true );
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", colormixerbean.ColorMixer.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_inputVerifier].setHidden ( true );
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", colormixerbean.ColorMixer.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_insets].setHidden ( true );
            properties[PROPERTY_itemListeners] = new PropertyDescriptor ( "itemListeners", colormixerbean.ColorMixer.class, "getItemListeners", null ); // NOI18N
            properties[PROPERTY_itemListeners].setHidden ( true );
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", colormixerbean.ColorMixer.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_keyListeners].setHidden ( true );
            properties[PROPERTY_label] = new PropertyDescriptor ( "label", colormixerbean.ColorMixer.class, "getLabel", "setLabel" ); // NOI18N
            properties[PROPERTY_label].setHidden ( true );
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", colormixerbean.ColorMixer.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_layout].setHidden ( true );
            properties[PROPERTY_lblColor] = new PropertyDescriptor ( "lblColor", colormixerbean.ColorMixer.class, "getlblColor", null ); // NOI18N
            properties[PROPERTY_lblColor].setHidden ( true );
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", colormixerbean.ColorMixer.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_lightweight].setHidden ( true );
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", colormixerbean.ColorMixer.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_locale].setHidden ( true );
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", colormixerbean.ColorMixer.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_location].setHidden ( true );
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", colormixerbean.ColorMixer.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_locationOnScreen].setHidden ( true );
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", colormixerbean.ColorMixer.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_managingFocus].setHidden ( true );
            properties[PROPERTY_margin] = new PropertyDescriptor ( "margin", colormixerbean.ColorMixer.class, "getMargin", "setMargin" ); // NOI18N
            properties[PROPERTY_margin].setHidden ( true );
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", colormixerbean.ColorMixer.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSize].setHidden ( true );
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", colormixerbean.ColorMixer.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_maximumSizeSet].setHidden ( true );
            properties[PROPERTY_menuDragMouseListeners] = new PropertyDescriptor ( "menuDragMouseListeners", colormixerbean.ColorMixer.class, "getMenuDragMouseListeners", null ); // NOI18N
            properties[PROPERTY_menuDragMouseListeners].setHidden ( true );
            properties[PROPERTY_menuKeyListeners] = new PropertyDescriptor ( "menuKeyListeners", colormixerbean.ColorMixer.class, "getMenuKeyListeners", null ); // NOI18N
            properties[PROPERTY_menuKeyListeners].setHidden ( true );
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", colormixerbean.ColorMixer.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSize].setHidden ( true );
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", colormixerbean.ColorMixer.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSizeSet].setHidden ( true );
            properties[PROPERTY_mix] = new PropertyDescriptor ( "mix", colormixerbean.ColorMixer.class, "getMix", null ); // NOI18N
            properties[PROPERTY_mix].setHidden ( true );
            properties[PROPERTY_mnemonic] = new PropertyDescriptor ( "mnemonic", colormixerbean.ColorMixer.class, null, "setMnemonic" ); // NOI18N
            properties[PROPERTY_mnemonic].setHidden ( true );
            properties[PROPERTY_model] = new PropertyDescriptor ( "model", colormixerbean.ColorMixer.class, "getModel", "setModel" ); // NOI18N
            properties[PROPERTY_model].setHidden ( true );
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", colormixerbean.ColorMixer.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseListeners].setHidden ( true );
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", colormixerbean.ColorMixer.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners].setHidden ( true );
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", colormixerbean.ColorMixer.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mousePosition].setHidden ( true );
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", colormixerbean.ColorMixer.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners].setHidden ( true );
            properties[PROPERTY_multiClickThreshhold] = new PropertyDescriptor ( "multiClickThreshhold", colormixerbean.ColorMixer.class, "getMultiClickThreshhold", "setMultiClickThreshhold" ); // NOI18N
            properties[PROPERTY_multiClickThreshhold].setHidden ( true );
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", colormixerbean.ColorMixer.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_name].setHidden ( true );
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", colormixerbean.ColorMixer.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent].setHidden ( true );
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", colormixerbean.ColorMixer.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_opaque].setHidden ( true );
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", colormixerbean.ColorMixer.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled].setHidden ( true );
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", colormixerbean.ColorMixer.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingForPrint].setHidden ( true );
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", colormixerbean.ColorMixer.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_paintingTile].setHidden ( true );
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", colormixerbean.ColorMixer.class, "getParent", null ); // NOI18N
            properties[PROPERTY_parent].setHidden ( true );
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", colormixerbean.ColorMixer.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_peer].setHidden ( true );
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", colormixerbean.ColorMixer.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSize].setHidden ( true );
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", colormixerbean.ColorMixer.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_preferredSizeSet].setHidden ( true );
            properties[PROPERTY_pressedIcon] = new PropertyDescriptor ( "pressedIcon", colormixerbean.ColorMixer.class, "getPressedIcon", "setPressedIcon" ); // NOI18N
            properties[PROPERTY_pressedIcon].setHidden ( true );
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", colormixerbean.ColorMixer.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners].setHidden ( true );
            properties[PROPERTY_propertyChangeSupport] = new PropertyDescriptor ( "propertyChangeSupport", colormixerbean.ColorMixer.class, "getPropertyChangeSupport", null ); // NOI18N
            properties[PROPERTY_propertyChangeSupport].setHidden ( true );
            properties[PROPERTY_red] = new PropertyDescriptor ( "red", colormixerbean.ColorMixer.class, "getRed", "setRed" ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", colormixerbean.ColorMixer.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes].setHidden ( true );
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", colormixerbean.ColorMixer.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_requestFocusEnabled].setHidden ( true );
            properties[PROPERTY_rolloverEnabled] = new PropertyDescriptor ( "rolloverEnabled", colormixerbean.ColorMixer.class, "isRolloverEnabled", "setRolloverEnabled" ); // NOI18N
            properties[PROPERTY_rolloverEnabled].setHidden ( true );
            properties[PROPERTY_rolloverIcon] = new PropertyDescriptor ( "rolloverIcon", colormixerbean.ColorMixer.class, "getRolloverIcon", "setRolloverIcon" ); // NOI18N
            properties[PROPERTY_rolloverIcon].setHidden ( true );
            properties[PROPERTY_rolloverSelectedIcon] = new PropertyDescriptor ( "rolloverSelectedIcon", colormixerbean.ColorMixer.class, "getRolloverSelectedIcon", "setRolloverSelectedIcon" ); // NOI18N
            properties[PROPERTY_rolloverSelectedIcon].setHidden ( true );
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", colormixerbean.ColorMixer.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_rootPane].setHidden ( true );
            properties[PROPERTY_scrBlue] = new PropertyDescriptor ( "scrBlue", colormixerbean.ColorMixer.class, "getscrBlue", null ); // NOI18N
            properties[PROPERTY_scrBlue].setHidden ( true );
            properties[PROPERTY_scrBrightness] = new PropertyDescriptor ( "scrBrightness", colormixerbean.ColorMixer.class, "getscrBrightness", null ); // NOI18N
            properties[PROPERTY_scrBrightness].setHidden ( true );
            properties[PROPERTY_scrGreen] = new PropertyDescriptor ( "scrGreen", colormixerbean.ColorMixer.class, "getscrGreen", null ); // NOI18N
            properties[PROPERTY_scrGreen].setHidden ( true );
            properties[PROPERTY_scrRed] = new PropertyDescriptor ( "scrRed", colormixerbean.ColorMixer.class, "getscrRed", null ); // NOI18N
            properties[PROPERTY_scrRed].setHidden ( true );
            properties[PROPERTY_selected] = new PropertyDescriptor ( "selected", colormixerbean.ColorMixer.class, "isSelected", "setSelected" ); // NOI18N
            properties[PROPERTY_selected].setHidden ( true );
            properties[PROPERTY_selectedIcon] = new PropertyDescriptor ( "selectedIcon", colormixerbean.ColorMixer.class, "getSelectedIcon", "setSelectedIcon" ); // NOI18N
            properties[PROPERTY_selectedIcon].setHidden ( true );
            properties[PROPERTY_selectedObjects] = new PropertyDescriptor ( "selectedObjects", colormixerbean.ColorMixer.class, "getSelectedObjects", null ); // NOI18N
            properties[PROPERTY_selectedObjects].setHidden ( true );
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", colormixerbean.ColorMixer.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_showing].setHidden ( true );
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", colormixerbean.ColorMixer.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_size].setHidden ( true );
            properties[PROPERTY_subElements] = new PropertyDescriptor ( "subElements", colormixerbean.ColorMixer.class, "getSubElements", null ); // NOI18N
            properties[PROPERTY_subElements].setHidden ( true );
            properties[PROPERTY_text] = new PropertyDescriptor ( "text", colormixerbean.ColorMixer.class, "getText", "setText" ); // NOI18N
            properties[PROPERTY_text].setHidden ( true );
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", colormixerbean.ColorMixer.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolkit].setHidden ( true );
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", colormixerbean.ColorMixer.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_toolTipText].setHidden ( true );
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", colormixerbean.ColorMixer.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_topLevelAncestor].setHidden ( true );
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", colormixerbean.ColorMixer.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_transferHandler].setHidden ( true );
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", colormixerbean.ColorMixer.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_treeLock].setHidden ( true );
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", colormixerbean.ColorMixer.class, null, "setUI" ); // NOI18N
            properties[PROPERTY_UI].setHidden ( true );
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", colormixerbean.ColorMixer.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_UIClassID].setHidden ( true );
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", colormixerbean.ColorMixer.class, "isValid", null ); // NOI18N
            properties[PROPERTY_valid].setHidden ( true );
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", colormixerbean.ColorMixer.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_validateRoot].setHidden ( true );
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", colormixerbean.ColorMixer.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget].setHidden ( true );
            properties[PROPERTY_verticalAlignment] = new PropertyDescriptor ( "verticalAlignment", colormixerbean.ColorMixer.class, "getVerticalAlignment", "setVerticalAlignment" ); // NOI18N
            properties[PROPERTY_verticalAlignment].setHidden ( true );
            properties[PROPERTY_verticalTextPosition] = new PropertyDescriptor ( "verticalTextPosition", colormixerbean.ColorMixer.class, "getVerticalTextPosition", "setVerticalTextPosition" ); // NOI18N
            properties[PROPERTY_verticalTextPosition].setHidden ( true );
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", colormixerbean.ColorMixer.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners].setHidden ( true );
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", colormixerbean.ColorMixer.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visible].setHidden ( true );
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", colormixerbean.ColorMixer.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_visibleRect].setHidden ( true );
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", colormixerbean.ColorMixer.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_width].setHidden ( true );
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", colormixerbean.ColorMixer.class, "getX", null ); // NOI18N
            properties[PROPERTY_x].setHidden ( true );
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", colormixerbean.ColorMixer.class, "getY", null ); // NOI18N
            properties[PROPERTY_y].setHidden ( true );
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_actionListener = 0;
    private static final int EVENT_ancestorListener = 1;
    private static final int EVENT_changeListener = 2;
    private static final int EVENT_componentListener = 3;
    private static final int EVENT_containerListener = 4;
    private static final int EVENT_focusListener = 5;
    private static final int EVENT_hierarchyBoundsListener = 6;
    private static final int EVENT_hierarchyListener = 7;
    private static final int EVENT_inputMethodListener = 8;
    private static final int EVENT_itemListener = 9;
    private static final int EVENT_keyListener = 10;
    private static final int EVENT_menuDragMouseListener = 11;
    private static final int EVENT_menuKeyListener = 12;
    private static final int EVENT_mouseListener = 13;
    private static final int EVENT_mouseMotionListener = 14;
    private static final int EVENT_mouseWheelListener = 15;
    private static final int EVENT_propertyChangeListener = 16;
    private static final int EVENT_vetoableChangeListener = 17;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[18];
    
        try {
            eventSets[EVENT_actionListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "actionListener", java.awt.event.ActionListener.class, new String[] {"actionPerformed"}, "addActionListener", "removeActionListener" ); // NOI18N
            eventSets[EVENT_actionListener].setHidden ( true );
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_ancestorListener].setHidden ( true );
            eventSets[EVENT_changeListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "changeListener", javax.swing.event.ChangeListener.class, new String[] {"stateChanged"}, "addChangeListener", "removeChangeListener" ); // NOI18N
            eventSets[EVENT_changeListener].setHidden ( true );
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_componentListener].setHidden ( true );
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_containerListener].setHidden ( true );
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_focusListener].setHidden ( true );
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener].setHidden ( true );
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener].setHidden ( true );
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener].setHidden ( true );
            eventSets[EVENT_itemListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "itemListener", java.awt.event.ItemListener.class, new String[] {"itemStateChanged"}, "addItemListener", "removeItemListener" ); // NOI18N
            eventSets[EVENT_itemListener].setHidden ( true );
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_keyListener].setHidden ( true );
            eventSets[EVENT_menuDragMouseListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "menuDragMouseListener", javax.swing.event.MenuDragMouseListener.class, new String[] {"menuDragMouseEntered", "menuDragMouseExited", "menuDragMouseDragged", "menuDragMouseReleased"}, "addMenuDragMouseListener", "removeMenuDragMouseListener" ); // NOI18N
            eventSets[EVENT_menuDragMouseListener].setHidden ( true );
            eventSets[EVENT_menuKeyListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "menuKeyListener", javax.swing.event.MenuKeyListener.class, new String[] {"menuKeyTyped", "menuKeyPressed", "menuKeyReleased"}, "addMenuKeyListener", "removeMenuKeyListener" ); // NOI18N
            eventSets[EVENT_menuKeyListener].setHidden ( true );
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseListener].setHidden ( true );
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener].setHidden ( true );
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener].setHidden ( true );
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener].setHidden ( true );
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( colormixerbean.ColorMixer.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener].setHidden ( true );
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addNotify7 = 7;
    private static final int METHOD_addPropertyChangeListener8 = 8;
    private static final int METHOD_applyComponentOrientation9 = 9;
    private static final int METHOD_areFocusTraversalKeysSet10 = 10;
    private static final int METHOD_bounds11 = 11;
    private static final int METHOD_checkImage12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_computeVisibleRect14 = 14;
    private static final int METHOD_contains15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_countComponents17 = 17;
    private static final int METHOD_createImage18 = 18;
    private static final int METHOD_createImage19 = 19;
    private static final int METHOD_createToolTip20 = 20;
    private static final int METHOD_createVolatileImage21 = 21;
    private static final int METHOD_createVolatileImage22 = 22;
    private static final int METHOD_deliverEvent23 = 23;
    private static final int METHOD_disable24 = 24;
    private static final int METHOD_dispatchEvent25 = 25;
    private static final int METHOD_doClick26 = 26;
    private static final int METHOD_doClick27 = 27;
    private static final int METHOD_doLayout28 = 28;
    private static final int METHOD_enable29 = 29;
    private static final int METHOD_enable30 = 30;
    private static final int METHOD_enableInputMethods31 = 31;
    private static final int METHOD_findComponentAt32 = 32;
    private static final int METHOD_findComponentAt33 = 33;
    private static final int METHOD_firePropertyChange34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_getActionForKeyStroke42 = 42;
    private static final int METHOD_getBaseline43 = 43;
    private static final int METHOD_getBounds44 = 44;
    private static final int METHOD_getClientProperty45 = 45;
    private static final int METHOD_getComponentAt46 = 46;
    private static final int METHOD_getComponentAt47 = 47;
    private static final int METHOD_getComponentZOrder48 = 48;
    private static final int METHOD_getConditionForKeyStroke49 = 49;
    private static final int METHOD_getDefaultLocale50 = 50;
    private static final int METHOD_getFocusTraversalKeys51 = 51;
    private static final int METHOD_getFontMetrics52 = 52;
    private static final int METHOD_getInsets53 = 53;
    private static final int METHOD_getListeners54 = 54;
    private static final int METHOD_getLocation55 = 55;
    private static final int METHOD_getMnemonic56 = 56;
    private static final int METHOD_getMousePosition57 = 57;
    private static final int METHOD_getPopupLocation58 = 58;
    private static final int METHOD_getPropertyChangeListeners59 = 59;
    private static final int METHOD_getSize60 = 60;
    private static final int METHOD_getToolTipLocation61 = 61;
    private static final int METHOD_getToolTipText62 = 62;
    private static final int METHOD_getUI63 = 63;
    private static final int METHOD_gotFocus64 = 64;
    private static final int METHOD_grabFocus65 = 65;
    private static final int METHOD_handleEvent66 = 66;
    private static final int METHOD_hasFocus67 = 67;
    private static final int METHOD_hide68 = 68;
    private static final int METHOD_imageUpdate69 = 69;
    private static final int METHOD_insets70 = 70;
    private static final int METHOD_inside71 = 71;
    private static final int METHOD_invalidate72 = 72;
    private static final int METHOD_isAncestorOf73 = 73;
    private static final int METHOD_isFocusCycleRoot74 = 74;
    private static final int METHOD_isLightweightComponent75 = 75;
    private static final int METHOD_keyDown76 = 76;
    private static final int METHOD_keyUp77 = 77;
    private static final int METHOD_layout78 = 78;
    private static final int METHOD_list79 = 79;
    private static final int METHOD_list80 = 80;
    private static final int METHOD_list81 = 81;
    private static final int METHOD_list82 = 82;
    private static final int METHOD_list83 = 83;
    private static final int METHOD_locate84 = 84;
    private static final int METHOD_location85 = 85;
    private static final int METHOD_lostFocus86 = 86;
    private static final int METHOD_menuSelectionChanged87 = 87;
    private static final int METHOD_minimumSize88 = 88;
    private static final int METHOD_mouseDown89 = 89;
    private static final int METHOD_mouseDrag90 = 90;
    private static final int METHOD_mouseEnter91 = 91;
    private static final int METHOD_mouseExit92 = 92;
    private static final int METHOD_mouseMove93 = 93;
    private static final int METHOD_mouseUp94 = 94;
    private static final int METHOD_move95 = 95;
    private static final int METHOD_nextFocus96 = 96;
    private static final int METHOD_paint97 = 97;
    private static final int METHOD_paintAll98 = 98;
    private static final int METHOD_paintComponents99 = 99;
    private static final int METHOD_paintImmediately100 = 100;
    private static final int METHOD_paintImmediately101 = 101;
    private static final int METHOD_postEvent102 = 102;
    private static final int METHOD_preferredSize103 = 103;
    private static final int METHOD_prepareImage104 = 104;
    private static final int METHOD_prepareImage105 = 105;
    private static final int METHOD_print106 = 106;
    private static final int METHOD_printAll107 = 107;
    private static final int METHOD_printComponents108 = 108;
    private static final int METHOD_processKeyEvent109 = 109;
    private static final int METHOD_processMenuDragMouseEvent110 = 110;
    private static final int METHOD_processMenuKeyEvent111 = 111;
    private static final int METHOD_processMouseEvent112 = 112;
    private static final int METHOD_putClientProperty113 = 113;
    private static final int METHOD_registerKeyboardAction114 = 114;
    private static final int METHOD_registerKeyboardAction115 = 115;
    private static final int METHOD_remove116 = 116;
    private static final int METHOD_remove117 = 117;
    private static final int METHOD_remove118 = 118;
    private static final int METHOD_removeAll119 = 119;
    private static final int METHOD_removeNotify120 = 120;
    private static final int METHOD_removePropertyChangeListener121 = 121;
    private static final int METHOD_repaint122 = 122;
    private static final int METHOD_repaint123 = 123;
    private static final int METHOD_repaint124 = 124;
    private static final int METHOD_repaint125 = 125;
    private static final int METHOD_repaint126 = 126;
    private static final int METHOD_requestDefaultFocus127 = 127;
    private static final int METHOD_requestFocus128 = 128;
    private static final int METHOD_requestFocus129 = 129;
    private static final int METHOD_requestFocusInWindow130 = 130;
    private static final int METHOD_resetKeyboardActions131 = 131;
    private static final int METHOD_reshape132 = 132;
    private static final int METHOD_resize133 = 133;
    private static final int METHOD_resize134 = 134;
    private static final int METHOD_revalidate135 = 135;
    private static final int METHOD_scrollRectToVisible136 = 136;
    private static final int METHOD_setBounds137 = 137;
    private static final int METHOD_setComponentZOrder138 = 138;
    private static final int METHOD_setDefaultLocale139 = 139;
    private static final int METHOD_setMixer140 = 140;
    private static final int METHOD_setMnemonic141 = 141;
    private static final int METHOD_setUI142 = 142;
    private static final int METHOD_show143 = 143;
    private static final int METHOD_show144 = 144;
    private static final int METHOD_size145 = 145;
    private static final int METHOD_toString146 = 146;
    private static final int METHOD_transferFocus147 = 147;
    private static final int METHOD_transferFocusBackward148 = 148;
    private static final int METHOD_transferFocusDownCycle149 = 149;
    private static final int METHOD_transferFocusUpCycle150 = 150;
    private static final int METHOD_unregisterKeyboardAction151 = 151;
    private static final int METHOD_update152 = 152;
    private static final int METHOD_updateUI153 = 153;
    private static final int METHOD_validate154 = 154;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[155];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setHidden ( true );
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setHidden ( true );
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setHidden ( true );
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setHidden ( true );
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setHidden ( true );
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setHidden ( true );
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setHidden ( true );
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addNotify7] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify7].setHidden ( true );
            methods[METHOD_addNotify7].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener8].setHidden ( true );
            methods[METHOD_addPropertyChangeListener8].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation9] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation9].setHidden ( true );
            methods[METHOD_applyComponentOrientation9].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet10] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet10].setHidden ( true );
            methods[METHOD_areFocusTraversalKeysSet10].setDisplayName ( "" );
            methods[METHOD_bounds11] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds11].setHidden ( true );
            methods[METHOD_bounds11].setDisplayName ( "" );
            methods[METHOD_checkImage12] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage12].setHidden ( true );
            methods[METHOD_checkImage12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setHidden ( true );
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect14] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect14].setHidden ( true );
            methods[METHOD_computeVisibleRect14].setDisplayName ( "" );
            methods[METHOD_contains15] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains15].setHidden ( true );
            methods[METHOD_contains15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains16].setHidden ( true );
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_countComponents17] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents17].setHidden ( true );
            methods[METHOD_countComponents17].setDisplayName ( "" );
            methods[METHOD_createImage18] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage18].setHidden ( true );
            methods[METHOD_createImage18].setDisplayName ( "" );
            methods[METHOD_createImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage19].setHidden ( true );
            methods[METHOD_createImage19].setDisplayName ( "" );
            methods[METHOD_createToolTip20] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip20].setHidden ( true );
            methods[METHOD_createToolTip20].setDisplayName ( "" );
            methods[METHOD_createVolatileImage21] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage21].setHidden ( true );
            methods[METHOD_createVolatileImage21].setDisplayName ( "" );
            methods[METHOD_createVolatileImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage22].setHidden ( true );
            methods[METHOD_createVolatileImage22].setDisplayName ( "" );
            methods[METHOD_deliverEvent23] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent23].setHidden ( true );
            methods[METHOD_deliverEvent23].setDisplayName ( "" );
            methods[METHOD_disable24] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable24].setHidden ( true );
            methods[METHOD_disable24].setDisplayName ( "" );
            methods[METHOD_dispatchEvent25] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent25].setHidden ( true );
            methods[METHOD_dispatchEvent25].setDisplayName ( "" );
            methods[METHOD_doClick26] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("doClick", new Class[] {})); // NOI18N
            methods[METHOD_doClick26].setHidden ( true );
            methods[METHOD_doClick26].setDisplayName ( "" );
            methods[METHOD_doClick27] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("doClick", new Class[] {int.class})); // NOI18N
            methods[METHOD_doClick27].setHidden ( true );
            methods[METHOD_doClick27].setDisplayName ( "" );
            methods[METHOD_doLayout28] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout28].setHidden ( true );
            methods[METHOD_doLayout28].setDisplayName ( "" );
            methods[METHOD_enable29] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable29].setHidden ( true );
            methods[METHOD_enable29].setDisplayName ( "" );
            methods[METHOD_enable30] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable30].setHidden ( true );
            methods[METHOD_enable30].setDisplayName ( "" );
            methods[METHOD_enableInputMethods31] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods31].setHidden ( true );
            methods[METHOD_enableInputMethods31].setDisplayName ( "" );
            methods[METHOD_findComponentAt32] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt32].setHidden ( true );
            methods[METHOD_findComponentAt32].setDisplayName ( "" );
            methods[METHOD_findComponentAt33] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt33].setHidden ( true );
            methods[METHOD_findComponentAt33].setDisplayName ( "" );
            methods[METHOD_firePropertyChange34] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange34].setHidden ( true );
            methods[METHOD_firePropertyChange34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setHidden ( true );
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setHidden ( true );
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setHidden ( true );
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setHidden ( true );
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setHidden ( true );
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setHidden ( true );
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setHidden ( true );
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke42].setHidden ( true );
            methods[METHOD_getActionForKeyStroke42].setDisplayName ( "" );
            methods[METHOD_getBaseline43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline43].setHidden ( true );
            methods[METHOD_getBaseline43].setDisplayName ( "" );
            methods[METHOD_getBounds44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds44].setHidden ( true );
            methods[METHOD_getBounds44].setDisplayName ( "" );
            methods[METHOD_getClientProperty45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty45].setHidden ( true );
            methods[METHOD_getClientProperty45].setDisplayName ( "" );
            methods[METHOD_getComponentAt46] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt46].setHidden ( true );
            methods[METHOD_getComponentAt46].setDisplayName ( "" );
            methods[METHOD_getComponentAt47] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt47].setHidden ( true );
            methods[METHOD_getComponentAt47].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder48].setHidden ( true );
            methods[METHOD_getComponentZOrder48].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke49].setHidden ( true );
            methods[METHOD_getConditionForKeyStroke49].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale50].setHidden ( true );
            methods[METHOD_getDefaultLocale50].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys51] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys51].setHidden ( true );
            methods[METHOD_getFocusTraversalKeys51].setDisplayName ( "" );
            methods[METHOD_getFontMetrics52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics52].setHidden ( true );
            methods[METHOD_getFontMetrics52].setDisplayName ( "" );
            methods[METHOD_getInsets53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets53].setHidden ( true );
            methods[METHOD_getInsets53].setDisplayName ( "" );
            methods[METHOD_getListeners54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners54].setHidden ( true );
            methods[METHOD_getListeners54].setDisplayName ( "" );
            methods[METHOD_getLocation55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation55].setHidden ( true );
            methods[METHOD_getLocation55].setDisplayName ( "" );
            methods[METHOD_getMnemonic56] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("getMnemonic", new Class[] {})); // NOI18N
            methods[METHOD_getMnemonic56].setHidden ( true );
            methods[METHOD_getMnemonic56].setDisplayName ( "" );
            methods[METHOD_getMousePosition57] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition57].setHidden ( true );
            methods[METHOD_getMousePosition57].setDisplayName ( "" );
            methods[METHOD_getPopupLocation58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation58].setHidden ( true );
            methods[METHOD_getPopupLocation58].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners59] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners59].setHidden ( true );
            methods[METHOD_getPropertyChangeListeners59].setDisplayName ( "" );
            methods[METHOD_getSize60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize60].setHidden ( true );
            methods[METHOD_getSize60].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation61].setHidden ( true );
            methods[METHOD_getToolTipLocation61].setDisplayName ( "" );
            methods[METHOD_getToolTipText62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText62].setHidden ( true );
            methods[METHOD_getToolTipText62].setDisplayName ( "" );
            methods[METHOD_getUI63] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("getUI", new Class[] {})); // NOI18N
            methods[METHOD_getUI63].setHidden ( true );
            methods[METHOD_getUI63].setDisplayName ( "" );
            methods[METHOD_gotFocus64] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus64].setHidden ( true );
            methods[METHOD_gotFocus64].setDisplayName ( "" );
            methods[METHOD_grabFocus65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus65].setHidden ( true );
            methods[METHOD_grabFocus65].setDisplayName ( "" );
            methods[METHOD_handleEvent66] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent66].setHidden ( true );
            methods[METHOD_handleEvent66].setDisplayName ( "" );
            methods[METHOD_hasFocus67] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus67].setHidden ( true );
            methods[METHOD_hasFocus67].setDisplayName ( "" );
            methods[METHOD_hide68] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide68].setHidden ( true );
            methods[METHOD_hide68].setDisplayName ( "" );
            methods[METHOD_imageUpdate69] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate69].setHidden ( true );
            methods[METHOD_imageUpdate69].setDisplayName ( "" );
            methods[METHOD_insets70] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets70].setHidden ( true );
            methods[METHOD_insets70].setDisplayName ( "" );
            methods[METHOD_inside71] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside71].setHidden ( true );
            methods[METHOD_inside71].setDisplayName ( "" );
            methods[METHOD_invalidate72] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate72].setHidden ( true );
            methods[METHOD_invalidate72].setDisplayName ( "" );
            methods[METHOD_isAncestorOf73] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf73].setHidden ( true );
            methods[METHOD_isAncestorOf73].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot74] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot74].setHidden ( true );
            methods[METHOD_isFocusCycleRoot74].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent75] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent75].setHidden ( true );
            methods[METHOD_isLightweightComponent75].setDisplayName ( "" );
            methods[METHOD_keyDown76] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown76].setHidden ( true );
            methods[METHOD_keyDown76].setDisplayName ( "" );
            methods[METHOD_keyUp77] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp77].setHidden ( true );
            methods[METHOD_keyUp77].setDisplayName ( "" );
            methods[METHOD_layout78] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout78].setHidden ( true );
            methods[METHOD_layout78].setDisplayName ( "" );
            methods[METHOD_list79] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list79].setHidden ( true );
            methods[METHOD_list79].setDisplayName ( "" );
            methods[METHOD_list80] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list80].setHidden ( true );
            methods[METHOD_list80].setDisplayName ( "" );
            methods[METHOD_list81] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list81].setHidden ( true );
            methods[METHOD_list81].setDisplayName ( "" );
            methods[METHOD_list82] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list82].setHidden ( true );
            methods[METHOD_list82].setDisplayName ( "" );
            methods[METHOD_list83] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list83].setHidden ( true );
            methods[METHOD_list83].setDisplayName ( "" );
            methods[METHOD_locate84] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate84].setHidden ( true );
            methods[METHOD_locate84].setDisplayName ( "" );
            methods[METHOD_location85] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location85].setHidden ( true );
            methods[METHOD_location85].setDisplayName ( "" );
            methods[METHOD_lostFocus86] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus86].setHidden ( true );
            methods[METHOD_lostFocus86].setDisplayName ( "" );
            methods[METHOD_menuSelectionChanged87] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("menuSelectionChanged", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_menuSelectionChanged87].setHidden ( true );
            methods[METHOD_menuSelectionChanged87].setDisplayName ( "" );
            methods[METHOD_minimumSize88] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize88].setHidden ( true );
            methods[METHOD_minimumSize88].setDisplayName ( "" );
            methods[METHOD_mouseDown89] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown89].setHidden ( true );
            methods[METHOD_mouseDown89].setDisplayName ( "" );
            methods[METHOD_mouseDrag90] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag90].setHidden ( true );
            methods[METHOD_mouseDrag90].setDisplayName ( "" );
            methods[METHOD_mouseEnter91] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter91].setHidden ( true );
            methods[METHOD_mouseEnter91].setDisplayName ( "" );
            methods[METHOD_mouseExit92] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit92].setHidden ( true );
            methods[METHOD_mouseExit92].setDisplayName ( "" );
            methods[METHOD_mouseMove93] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove93].setHidden ( true );
            methods[METHOD_mouseMove93].setDisplayName ( "" );
            methods[METHOD_mouseUp94] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp94].setHidden ( true );
            methods[METHOD_mouseUp94].setDisplayName ( "" );
            methods[METHOD_move95] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move95].setHidden ( true );
            methods[METHOD_move95].setDisplayName ( "" );
            methods[METHOD_nextFocus96] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus96].setHidden ( true );
            methods[METHOD_nextFocus96].setDisplayName ( "" );
            methods[METHOD_paint97] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint97].setHidden ( true );
            methods[METHOD_paint97].setDisplayName ( "" );
            methods[METHOD_paintAll98] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll98].setHidden ( true );
            methods[METHOD_paintAll98].setDisplayName ( "" );
            methods[METHOD_paintComponents99] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents99].setHidden ( true );
            methods[METHOD_paintComponents99].setDisplayName ( "" );
            methods[METHOD_paintImmediately100] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately100].setHidden ( true );
            methods[METHOD_paintImmediately100].setDisplayName ( "" );
            methods[METHOD_paintImmediately101] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately101].setHidden ( true );
            methods[METHOD_paintImmediately101].setDisplayName ( "" );
            methods[METHOD_postEvent102] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent102].setHidden ( true );
            methods[METHOD_postEvent102].setDisplayName ( "" );
            methods[METHOD_preferredSize103] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize103].setHidden ( true );
            methods[METHOD_preferredSize103].setDisplayName ( "" );
            methods[METHOD_prepareImage104] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage104].setHidden ( true );
            methods[METHOD_prepareImage104].setDisplayName ( "" );
            methods[METHOD_prepareImage105] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage105].setHidden ( true );
            methods[METHOD_prepareImage105].setDisplayName ( "" );
            methods[METHOD_print106] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print106].setHidden ( true );
            methods[METHOD_print106].setDisplayName ( "" );
            methods[METHOD_printAll107] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll107].setHidden ( true );
            methods[METHOD_printAll107].setDisplayName ( "" );
            methods[METHOD_printComponents108] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents108].setHidden ( true );
            methods[METHOD_printComponents108].setDisplayName ( "" );
            methods[METHOD_processKeyEvent109] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processKeyEvent", new Class[] {java.awt.event.KeyEvent.class, javax.swing.MenuElement[].class, javax.swing.MenuSelectionManager.class})); // NOI18N
            methods[METHOD_processKeyEvent109].setHidden ( true );
            methods[METHOD_processKeyEvent109].setDisplayName ( "" );
            methods[METHOD_processMenuDragMouseEvent110] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processMenuDragMouseEvent", new Class[] {javax.swing.event.MenuDragMouseEvent.class})); // NOI18N
            methods[METHOD_processMenuDragMouseEvent110].setHidden ( true );
            methods[METHOD_processMenuDragMouseEvent110].setDisplayName ( "" );
            methods[METHOD_processMenuKeyEvent111] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processMenuKeyEvent", new Class[] {javax.swing.event.MenuKeyEvent.class})); // NOI18N
            methods[METHOD_processMenuKeyEvent111].setHidden ( true );
            methods[METHOD_processMenuKeyEvent111].setDisplayName ( "" );
            methods[METHOD_processMouseEvent112] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processMouseEvent", new Class[] {java.awt.event.MouseEvent.class, javax.swing.MenuElement[].class, javax.swing.MenuSelectionManager.class})); // NOI18N
            methods[METHOD_processMouseEvent112].setHidden ( true );
            methods[METHOD_processMouseEvent112].setDisplayName ( "" );
            methods[METHOD_putClientProperty113] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty113].setHidden ( true );
            methods[METHOD_putClientProperty113].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction114] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction114].setHidden ( true );
            methods[METHOD_registerKeyboardAction114].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction115] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction115].setHidden ( true );
            methods[METHOD_registerKeyboardAction115].setDisplayName ( "" );
            methods[METHOD_remove116] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove116].setHidden ( true );
            methods[METHOD_remove116].setDisplayName ( "" );
            methods[METHOD_remove117] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove117].setHidden ( true );
            methods[METHOD_remove117].setDisplayName ( "" );
            methods[METHOD_remove118] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove118].setHidden ( true );
            methods[METHOD_remove118].setDisplayName ( "" );
            methods[METHOD_removeAll119] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll119].setHidden ( true );
            methods[METHOD_removeAll119].setDisplayName ( "" );
            methods[METHOD_removeNotify120] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify120].setHidden ( true );
            methods[METHOD_removeNotify120].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener121] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener121].setHidden ( true );
            methods[METHOD_removePropertyChangeListener121].setDisplayName ( "" );
            methods[METHOD_repaint122] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint122].setHidden ( true );
            methods[METHOD_repaint122].setDisplayName ( "" );
            methods[METHOD_repaint123] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint123].setHidden ( true );
            methods[METHOD_repaint123].setDisplayName ( "" );
            methods[METHOD_repaint124] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint124].setHidden ( true );
            methods[METHOD_repaint124].setDisplayName ( "" );
            methods[METHOD_repaint125] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint125].setHidden ( true );
            methods[METHOD_repaint125].setDisplayName ( "" );
            methods[METHOD_repaint126] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint126].setHidden ( true );
            methods[METHOD_repaint126].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus127] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus127].setHidden ( true );
            methods[METHOD_requestDefaultFocus127].setDisplayName ( "" );
            methods[METHOD_requestFocus128] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus128].setHidden ( true );
            methods[METHOD_requestFocus128].setDisplayName ( "" );
            methods[METHOD_requestFocus129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus129].setHidden ( true );
            methods[METHOD_requestFocus129].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow130].setHidden ( true );
            methods[METHOD_requestFocusInWindow130].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions131] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions131].setHidden ( true );
            methods[METHOD_resetKeyboardActions131].setDisplayName ( "" );
            methods[METHOD_reshape132] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape132].setHidden ( true );
            methods[METHOD_reshape132].setDisplayName ( "" );
            methods[METHOD_resize133] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize133].setHidden ( true );
            methods[METHOD_resize133].setDisplayName ( "" );
            methods[METHOD_resize134] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize134].setHidden ( true );
            methods[METHOD_resize134].setDisplayName ( "" );
            methods[METHOD_revalidate135] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate135].setHidden ( true );
            methods[METHOD_revalidate135].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible136].setHidden ( true );
            methods[METHOD_scrollRectToVisible136].setDisplayName ( "" );
            methods[METHOD_setBounds137] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds137].setHidden ( true );
            methods[METHOD_setBounds137].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder138] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder138].setHidden ( true );
            methods[METHOD_setComponentZOrder138].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale139].setHidden ( true );
            methods[METHOD_setDefaultLocale139].setDisplayName ( "" );
            methods[METHOD_setMixer140] = new MethodDescriptor(colormixerbean.ColorMixer.class.getMethod("setMixer", new Class[] {java.awt.Color.class, float.class})); // NOI18N
            methods[METHOD_setMixer140].setHidden ( true );
            methods[METHOD_setMixer140].setDisplayName ( "" );
            methods[METHOD_setMnemonic141] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("setMnemonic", new Class[] {int.class})); // NOI18N
            methods[METHOD_setMnemonic141].setHidden ( true );
            methods[METHOD_setMnemonic141].setDisplayName ( "" );
            methods[METHOD_setUI142] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("setUI", new Class[] {javax.swing.plaf.ButtonUI.class})); // NOI18N
            methods[METHOD_setUI142].setHidden ( true );
            methods[METHOD_setUI142].setDisplayName ( "" );
            methods[METHOD_show143] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show143].setHidden ( true );
            methods[METHOD_show143].setDisplayName ( "" );
            methods[METHOD_show144] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show144].setHidden ( true );
            methods[METHOD_show144].setDisplayName ( "" );
            methods[METHOD_size145] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size145].setHidden ( true );
            methods[METHOD_size145].setDisplayName ( "" );
            methods[METHOD_toString146] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString146].setHidden ( true );
            methods[METHOD_toString146].setDisplayName ( "" );
            methods[METHOD_transferFocus147] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus147].setHidden ( true );
            methods[METHOD_transferFocus147].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward148] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward148].setHidden ( true );
            methods[METHOD_transferFocusBackward148].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle149] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle149].setHidden ( true );
            methods[METHOD_transferFocusDownCycle149].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle150] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle150].setHidden ( true );
            methods[METHOD_transferFocusUpCycle150].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction151] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction151].setHidden ( true );
            methods[METHOD_unregisterKeyboardAction151].setDisplayName ( "" );
            methods[METHOD_update152] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update152].setHidden ( true );
            methods[METHOD_update152].setDisplayName ( "" );
            methods[METHOD_updateUI153] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI153].setHidden ( true );
            methods[METHOD_updateUI153].setDisplayName ( "" );
            methods[METHOD_validate154] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate154].setHidden ( true );
            methods[METHOD_validate154].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
