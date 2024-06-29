/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sudes
 */
import java.awt.Dimension;
import java.awt.Toolkit;

public class ScreenResolution {
    public static void main(String[] args) {
        // Get the default toolkit
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Get the screen size as a Dimension object
        Dimension screenSize = toolkit.getScreenSize();

        // Extract the width and height from the Dimension object
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Print the screen resolution
        System.out.println("Screen resolution: " + screenWidth + "x" + screenHeight);
    }
}

