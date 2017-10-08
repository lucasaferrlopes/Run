/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import Controllers.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author lucas
 */
public class MainFormJFrame extends javax.swing.JFrame implements Runnable {
    
    private boolean space, action, r;
    private boolean botoes[] = new boolean[6];
    
    /**
     * Creates new form MainFormJFrame
     */
    public MainFormJFrame() {
        initComponents();
        this.space = false;
        this.action = false;
        this.r = false;
        createBufferStrategy(2);
        Thread t = new Thread(this);
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_SPACE)
        this.space = false;
        if (evt.getKeyCode() == KeyEvent.VK_C)
        this.action = false;
        if (evt.getKeyCode() == KeyEvent.VK_R)
        this.r = false;
    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_SPACE)
        this.space = true;
        if (evt.getKeyCode() == KeyEvent.VK_C)
        this.action = true;
        if (evt.getKeyCode() == KeyEvent.VK_R)
        this.r = true;
    }//GEN-LAST:event_formKeyPressed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        if(evt.getXOnScreen()> 420 && evt.getXOnScreen() < 565 && evt.getYOnScreen() > 50 && evt.getYOnScreen() < 301)
            botoes[0] = true;
        else
            botoes[0] = false;
        if(evt.getXOnScreen()> 615 && evt.getXOnScreen() < 738 && evt.getYOnScreen() > 50 && evt.getYOnScreen() < 218)
            botoes[1] = true;
        else
            botoes[1] = false;
        if(evt.getXOnScreen()> 650 && evt.getXOnScreen() < 802 && evt.getYOnScreen() > 280 && evt.getYOnScreen() < 480)
            botoes[3] = true;
        else
            botoes[3] = false;
    }//GEN-LAST:event_formMouseMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(evt.getXOnScreen()> 380 && evt.getXOnScreen() < 525 && evt.getYOnScreen() > 50 && evt.getYOnScreen() < 301)
            r = true;
        if(evt.getXOnScreen()> 615 && evt.getXOnScreen() < 738 && evt.getYOnScreen() > 50 && evt.getYOnScreen() < 218)
            botoes[2] = true;
        if(evt.getXOnScreen()> 650 && evt.getXOnScreen() < 802 && evt.getYOnScreen() > 280 && evt.getYOnScreen() < 480)
            botoes[2] = false;
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(MainFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFormJFrame().setVisible(true);
            }
        });
    }

    @Override
    public void run() {
        long songTime = 0;
        BufferStrategy buffer = getBufferStrategy();
        Graphics bg;
        Game.j = this;
        Game g = new Game();
        while (true) {
            long currentTime = System.currentTimeMillis();
            if(currentTime > songTime + 113000)
            {
                songTime = currentTime;
                music();
            }
            bg = buffer.getDrawGraphics();
            bg.setFont(new Font("Dialog", Font.BOLD, 18));
            g.upDate(bg, botoes);
            g.setPlayersActions(space, action, r);
            r = false;
            bg.dispose();
            buffer.show();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }
    public static void music() {  
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;

        ContinuousAudioDataStream loop = null;

        try
        {
            InputStream test = new FileInputStream("src\\Songs\\pixel-adenture.wav");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);

        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
