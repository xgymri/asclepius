package cn.yiiguxing.asclepius.form;

import javax.swing.*;
import java.awt.*;

public class SurfaceFrame extends JDialog {
    protected JPanel contentPane;
    protected JButton buttonOK;
    protected JButton buttonCancel;
    protected JFormattedTextField contourValue;
    protected JCheckBox enableSmoothingCheckBox;
    protected JComboBox<Integer> noiComboBox;
    protected JLabel noiLabel;
    protected JPanel colorPanel;

    protected SurfaceFrame(Frame owner) {
        super(owner, "Create Surface", true);
    }
}
