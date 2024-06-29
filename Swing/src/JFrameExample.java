/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sudes
 */
package Example; 
import java.awt.GraphicsConfiguration; 
import javax.swing.JFrame; 
public class JFrameExample { 
static GraphicsConfiguration gc; 
public static void main(String[] args){ 
JFrame frame= new JFrame(gc);     
frame.setTitle("Welecome to Advance Java Programming"); 
frame.setSize(600, 400); 
frame.setVisible(true); 
frame.setResizable(false);
frame.setLocation(320,180);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
} 
}