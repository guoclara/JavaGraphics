package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);


		//add more code here
      window.setColor(Color.green);
      window.fillOval(350, 120, 25, 25);
      window.fillOval(430, 120, 25, 25);
      
      window.setColor(Color.black);
      window.fillOval(395, 150, 10, 10);
      
      window.setColor(Color.red);
      window.fillRect(360, 170,85, 5);
				
   }

   public void upperBody( Graphics window )
   {

       window.setColor(Color.blue);
       window.fillRect(300,210,200,100);
       window.setColor(Color.yellow);
       window.drawRect(300, 210, 200, 100);
       
       window.setColor(Color.black);
       window.drawLine(500, 210, 600, 160);
       window.drawLine(300, 210, 200, 160);
       
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.gray);
       window.fillRect(300, 330, 200, 100);
       window.setColor(Color.yellow);
       window.drawRect(300,330,200,100);
       
       window.setColor(Color.black);
       window.drawLine(500, 430, 600, 530);
       window.drawLine(300, 430, 200, 530);
		//add more code here

   }
}