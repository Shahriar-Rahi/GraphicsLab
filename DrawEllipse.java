import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class MyDrawEllipse extends Frame {

  public void paint(Graphics g) {
     Graphics2D ga = (Graphics2D)g;
     ga.setPaint(Color.red);
     ga.drawArc(50,50,300,150, 0, 360);
     ga.setPaint(Color.blue);
     ga.drawArc(75,75,250,100, 0, 360);
  }
              
  public static void main(String args[]) 
  {
      MyDrawEllipse frame = new MyDrawEllipse();       
      frame.addWindowListener(
      new WindowAdapter()
      {
         public void windowClosing(WindowEvent we)
         {
            System.exit(0);
         }
      }
      );
           
      frame.setSize(400, 400);
      frame.setVisible(true);
   }
}
