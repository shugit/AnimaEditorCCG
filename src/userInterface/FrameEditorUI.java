/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JToggleButton;

/**
 *
 * @author zhoushuwen
 */
public class FrameEditorUI extends javax.swing.JFrame {

    /**
     * Creates new form FrameEditorInterface
     */
    public FrameEditorUI() {
	detailImage = (new ImageIcon("颜色选择UI.png")).getImage(); //TODO 默认加载了烟花.png，需要根据选择更改
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailPanel = new javax.swing.JPanel();
        detailSlider = new javax.swing.JSlider();
        frameSlider = new javax.swing.JSlider();
        frameLabel = new javax.swing.JLabel();
        copyDetectorButton = new javax.swing.JButton();
        pasteDetectorButton = new javax.swing.JButton();
        horizontalFlipButton = new javax.swing.JButton();
        verticalFlipButton = new javax.swing.JButton();
        rotationButton = new javax.swing.JButton();
        deleteComponentButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        detailScrollPane = new javax.swing.JScrollPane();
        detailCanvas = new java.awt.Canvas(){
            public void paint(Graphics g) {
                //System.out.println("drawing");
                drawAll(g);
            }
        };
        mouseLocationLabel = new javax.swing.JLabel();
        thumbPanel = new javax.swing.JPanel();
        thumbSlider = new javax.swing.JSlider();
        thumbScrollPane = new javax.swing.JScrollPane();
        thumbCanvas = new java.awt.Canvas();
        configurePanel = new javax.swing.JPanel();
        frameScrollPane = new javax.swing.JScrollPane();
        frameList = new javax.swing.JList();
        gridToggleButton = new javax.swing.JToggleButton();
        detectorToggleButton = new javax.swing.JToggleButton();
        backgroundToggleButton = new javax.swing.JToggleButton();
        collisionLeftText = new javax.swing.JTextField();
        collisionTopText = new javax.swing.JTextField();
        collisionRightText = new javax.swing.JTextField();
        collisionBottomText = new javax.swing.JTextField();
        attackLeftText = new javax.swing.JTextField();
        attackTopText = new javax.swing.JTextField();
        attackRightText = new javax.swing.JTextField();
        attackBottomText = new javax.swing.JTextField();
        collisionLeftLabel = new javax.swing.JLabel();
        collisionTopLabel = new javax.swing.JLabel();
        collisionRightLabel = new javax.swing.JLabel();
        collisionBottomLabel = new javax.swing.JLabel();
        attackLeftLabel = new javax.swing.JLabel();
        attackTopLabel = new javax.swing.JLabel();
        attackRightLabel = new javax.swing.JLabel();
        attackBottomLabel = new javax.swing.JLabel();
        frameUpButton = new javax.swing.JButton();
        frameDownButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("帧编辑");

        detailPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        detailSlider.setToolTipText("缩放");

        frameSlider.setToolTipText("帧数");
        frameSlider.setValue(0);
        frameSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                frameSliderStateChanged(evt);
            }
        });

        frameLabel.setText("第" + frameSlider.getValue() + "帧");

        copyDetectorButton.setText("复制检测框");

        pasteDetectorButton.setText("粘贴检测框");

        horizontalFlipButton.setText("水平翻转");

        verticalFlipButton.setText("垂直翻转");

        rotationButton.setText("90度旋转");

        deleteComponentButton.setText("删除组件");

        submitButton.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        submitButton.setText("确定");

        cancelButton.setText("取消");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        detailCanvas.setPreferredSize(new java.awt.Dimension(400, 400));
        detailCanvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                detailCanvasMouseMoved(evt);
            }
        });
        detailScrollPane.setViewportView(detailCanvas);

        mouseLocationLabel.setText("<HTML>X:<P>Y:<HTML>");

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailScrollPane)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailPanelLayout.createSequentialGroup()
                                .addComponent(detailSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(frameSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(frameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailPanelLayout.createSequentialGroup()
                                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pasteDetectorButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(copyDetectorButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(verticalFlipButton)
                                    .addComponent(horizontalFlipButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteComponentButton)
                                    .addComponent(rotationButton))
                                .addGap(10, 10, 10)
                                .addComponent(mouseLocationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );

        detailPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, submitButton});

        detailPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteComponentButton, rotationButton});

        detailPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {horizontalFlipButton, verticalFlipButton});

        detailPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {copyDetectorButton, pasteDetectorButton});

        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPanelLayout.createSequentialGroup()
                .addComponent(detailScrollPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frameSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(detailPanelLayout.createSequentialGroup()
                            .addComponent(copyDetectorButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pasteDetectorButton))
                        .addComponent(mouseLocationLabel))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(rotationButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteComponentButton))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addComponent(horizontalFlipButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verticalFlipButton)))
                .addContainerGap())
        );

        detailPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelButton, copyDetectorButton, deleteComponentButton, horizontalFlipButton, pasteDetectorButton, rotationButton, submitButton, verticalFlipButton});

        detailPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {detailSlider, frameSlider});

        thumbPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        thumbSlider.setToolTipText("缩放");

        thumbCanvas.setBackground(new java.awt.Color(255, 204, 204));
        thumbScrollPane.setViewportView(thumbCanvas);

        javax.swing.GroupLayout thumbPanelLayout = new javax.swing.GroupLayout(thumbPanel);
        thumbPanel.setLayout(thumbPanelLayout);
        thumbPanelLayout.setHorizontalGroup(
            thumbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thumbPanelLayout.createSequentialGroup()
                .addGroup(thumbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thumbPanelLayout.createSequentialGroup()
                        .addComponent(thumbSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(thumbScrollPane))
                .addContainerGap())
        );
        thumbPanelLayout.setVerticalGroup(
            thumbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thumbPanelLayout.createSequentialGroup()
                .addComponent(thumbScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thumbSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        configurePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        frameList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        frameScrollPane.setViewportView(frameList);

        gridToggleButton.setSelected(true);
        gridToggleButton.setText("显示网格");
        gridToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridToggleButtonActionPerformed(evt);
            }
        });

        //String DetectorString = detectorToggleButton.isSelected()?"显示检测框":"取消侦测框";
        //System.out.println(detectorToggleButton.isSelected()?"显示检测框":"取消侦测框");
        detectorToggleButton.setText("显示检测框");
        detectorToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detectorToggleButtonActionPerformed(evt);
            }
        });

        backgroundToggleButton.setText("显示背景色");
        backgroundToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundToggleButtonActionPerformed(evt);
            }
        });

        collisionLeftText.setText("0");

        collisionTopText.setText("0");

        collisionRightText.setText("0");

        collisionBottomText.setText("0");

        attackLeftText.setText("0");

        attackTopText.setText("0");

        attackRightText.setText("0");

        attackBottomText.setText("0");

        collisionLeftLabel.setText("碰撞框 左");

        collisionTopLabel.setText("碰撞框 上");

        collisionRightLabel.setText("碰撞框 右");

        collisionBottomLabel.setText("碰撞框 下");

        attackLeftLabel.setText("攻击框 左");

        attackTopLabel.setText("攻击框 上");

        attackRightLabel.setText("攻击框 右");

        attackBottomLabel.setText("攻击框 下");

        frameUpButton.setText("上移");

        frameDownButton.setText("下移");

        javax.swing.GroupLayout configurePanelLayout = new javax.swing.GroupLayout(configurePanel);
        configurePanel.setLayout(configurePanelLayout);
        configurePanelLayout.setHorizontalGroup(
            configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configurePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frameScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frameUpButton)
                    .addComponent(frameDownButton))
                .addGap(22, 22, 22)
                .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(configurePanelLayout.createSequentialGroup()
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(collisionLeftLabel)
                            .addComponent(collisionTopLabel)
                            .addComponent(collisionRightLabel)
                            .addComponent(collisionBottomLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(collisionBottomText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collisionRightText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collisionTopText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collisionLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(attackLeftLabel)
                            .addComponent(attackTopLabel)
                            .addComponent(attackRightLabel)
                            .addComponent(attackBottomLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(attackTopText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackRightText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackBottomText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(configurePanelLayout.createSequentialGroup()
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(gridToggleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(detectorToggleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backgroundToggleButton)))
                .addGap(20, 20, 20))
        );

        configurePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {attackBottomText, attackLeftText, attackRightText, attackTopText, collisionBottomText, collisionLeftText, collisionRightText, collisionTopText});

        configurePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {attackBottomLabel, attackLeftLabel, attackRightLabel, attackTopLabel, collisionBottomLabel, collisionLeftLabel, collisionRightLabel, collisionTopLabel});

        configurePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {frameDownButton, frameUpButton});

        configurePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backgroundToggleButton, detectorToggleButton, gridToggleButton});

        configurePanelLayout.setVerticalGroup(
            configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configurePanelLayout.createSequentialGroup()
                .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(configurePanelLayout.createSequentialGroup()
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attackLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackLeftLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attackTopText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackTopLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attackRightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackRightLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attackBottomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackBottomLabel)))
                    .addGroup(configurePanelLayout.createSequentialGroup()
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(collisionLeftText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collisionLeftLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(collisionTopText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collisionTopLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(collisionRightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collisionRightLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(collisionBottomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collisionBottomLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(gridToggleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(configurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detectorToggleButton)
                    .addComponent(backgroundToggleButton)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configurePanelLayout.createSequentialGroup()
                .addComponent(frameScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameUpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameDownButton))
        );

        configurePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {attackBottomText, attackLeftText, attackRightText, attackTopText, collisionBottomText, collisionLeftText, collisionRightText, collisionTopText});

        configurePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {attackBottomLabel, attackLeftLabel, attackRightLabel, attackTopLabel, collisionBottomLabel, collisionLeftLabel, collisionRightLabel, collisionTopLabel});

        configurePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {frameDownButton, frameUpButton});

        configurePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backgroundToggleButton, detectorToggleButton, gridToggleButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(configurePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thumbPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thumbPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(configurePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 显示侦测框的toggleButton，默认是不选择
     * @param evt 
     */
    private void detectorToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detectorToggleButtonActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
            //draw detector
        } else {
            //cancel draw detector
        }
    }//GEN-LAST:event_detectorToggleButtonActionPerformed
 /**
     * 显示背景色的toggleButton，默认是不选择
     * @param evt 
     */
    private void backgroundToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundToggleButtonActionPerformed
        if (((JToggleButton) evt.getSource()).isSelected()) {
            detailCanvas.setBackground(Color.red);        // TODO add your handling code here:
        } else {
            detailCanvas.setBackground(null);
        }
    }//GEN-LAST:event_backgroundToggleButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void frameSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_frameSliderStateChanged
        // TODO add your handling code here:
        System.out.println("刻度: " + ((JSlider) evt.getSource()).getValue());
        frameLabel.setText("第" + frameSlider.getValue() + "帧");
        frameLabel.repaint();
    }//GEN-LAST:event_frameSliderStateChanged
 /**
     * 显示网格的toggleButton，默认是选择
     * @param evt 
     */
    private void gridToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridToggleButtonActionPerformed
        detailCanvas.repaint();
    }//GEN-LAST:event_gridToggleButtonActionPerformed

    private void detailCanvasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailCanvasMouseMoved
        // TODO add your handling code here:
        mouseLocationLabel.setText("<HTML>X:"+this.getMousePosition().getX()+"<P>Y:"+this.getMousePosition().getY()+"<HTML>");
    }//GEN-LAST:event_detailCanvasMouseMoved
    
    /**
     * 这里是由detailCanvas调用的绘图函数，每次刷新都会执行一遍
     * @param g 
     */
    public void drawAll(Graphics g) {
        //System.out.println("drawing @ drawAll");
        
        g.drawRect(50, 30, 70, 80);        
        //g.drawImage(detailImage, 0, 0, detailCanvas);
        g.drawImage(detailImage, 0, 0, detailCanvas.getWidth(), detailCanvas.getHeight(), detailCanvas);
        drawGrid(g);
    }
    
    /**
     * 画出网格线，横着然后竖着，目前25px
     * @param g 
     */
    private void drawGrid(Graphics g){
        g.setColor(new Color(255,255,255));
        //System.out.println("drawing @ drawGrid");
        if(gridToggleButton.isSelected()){
            for(int i = 0; i< detailCanvas.getHeight(); i+=25){
                g.drawLine(0, i,detailCanvas.getWidth() , i);            
            }
            for(int j = 0; j< detailCanvas.getWidth(); j+=25){
                g.drawLine(j, 0,j , detailCanvas.getHeight());            
            }
        }else {
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEditorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attackBottomLabel;
    private javax.swing.JTextField attackBottomText;
    private javax.swing.JLabel attackLeftLabel;
    private javax.swing.JTextField attackLeftText;
    private javax.swing.JLabel attackRightLabel;
    private javax.swing.JTextField attackRightText;
    private javax.swing.JLabel attackTopLabel;
    private javax.swing.JTextField attackTopText;
    private javax.swing.JToggleButton backgroundToggleButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel collisionBottomLabel;
    private javax.swing.JTextField collisionBottomText;
    private javax.swing.JLabel collisionLeftLabel;
    private javax.swing.JTextField collisionLeftText;
    private javax.swing.JLabel collisionRightLabel;
    private javax.swing.JTextField collisionRightText;
    private javax.swing.JLabel collisionTopLabel;
    private javax.swing.JTextField collisionTopText;
    private javax.swing.JPanel configurePanel;
    private javax.swing.JButton copyDetectorButton;
    private javax.swing.JButton deleteComponentButton;
    private java.awt.Canvas detailCanvas;
    /**
    * 用来显示detailCanvas上的图
    */
    private Image detailImage;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JScrollPane detailScrollPane;
    /**
    * 缩放用的
    */
    private javax.swing.JSlider detailSlider;
    private javax.swing.JToggleButton detectorToggleButton;
    private javax.swing.JButton frameDownButton;
    private javax.swing.JLabel frameLabel;
    private javax.swing.JList frameList;
    private javax.swing.JScrollPane frameScrollPane;
    private javax.swing.JSlider frameSlider;
    private javax.swing.JButton frameUpButton;
    private javax.swing.JToggleButton gridToggleButton;
    private javax.swing.JButton horizontalFlipButton;
    /**
    * 需更改：这里只显示了相对于整个屏幕的鼠标位置，而不是在canvas上的位置
    */
    private javax.swing.JLabel mouseLocationLabel;
    private javax.swing.JButton pasteDetectorButton;
    private javax.swing.JButton rotationButton;
    private javax.swing.JButton submitButton;
    private java.awt.Canvas thumbCanvas;
    private javax.swing.JPanel thumbPanel;
    private javax.swing.JScrollPane thumbScrollPane;
    /**
    * 缩放用的
    */
    private javax.swing.JSlider thumbSlider;
    private javax.swing.JButton verticalFlipButton;
    // End of variables declaration//GEN-END:variables
}
