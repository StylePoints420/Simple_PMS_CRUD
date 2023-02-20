/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewer;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Panel_UI extends JPanel {
     protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color first_color = new Color(95,209,249);
            Color second_color = new Color(85,88,218);
            
            GradientPaint gp = new GradientPaint(150, 150, first_color, width, height, second_color, true);
            
            g2d.setPaint(gp);
           
            g2d.fillRect(0, 0, width, height);
            
        }
}

 class Login_Gradient_UI2 extends JPanel {
     protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
           
            Color third_color = new Color(5,84,94);
            Color fourth_color = new Color(187,187,187);
            
            GradientPaint gp1 = new GradientPaint(150, 150, third_color, width, height, fourth_color, true);
            g2d.setPaint(gp1);
            g2d.fillRect(0, 0, width, height);
            
        }
}

class Register_Gradient_UI extends JPanel {
        
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
           
            Color third_color = new Color(255,20,147);
            Color fourth_color = new Color(255,0,255);
            
            GradientPaint gp1 = new GradientPaint(150, 150, third_color, width, height, fourth_color, true);
            g2d.setPaint(gp1);
            g2d.fillRect(0, 0, width, height);
            
        }
        
    }

   class MainForm_Gradient_UI extends JPanel {
        
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color first_color = new Color(135, 206, 250);
            Color second_color = new Color(153, 50, 204);
            
            GradientPaint gp = new GradientPaint(150, 150, first_color, width, height, second_color, true);
            
            g2d.setPaint(gp);
           
            g2d.fillRect(0, 0, width, height);
            
        }
        
    }



