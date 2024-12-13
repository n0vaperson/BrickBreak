//Author: Roi Porat-Shliom
//Date: 12/12/2024
//Brief Description: Class Ball creates the ball object in the Brick Break game and allows its horizonal motion, vertical motion, and speed.

import java.awt.*;

public class Ball {
	//Instance variables
	private int xPos;
	private int yPos;
	private int radius;
	private int xVel;
	private int yVel;
	
//Constructor:
//Precondition: none
//Postcondition: instance variables are assigned the values of the inputted parameters
	public Ball(int xPos, int yPos, int radius)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.radius = radius;
	}
	

//Getters and setters:
public int getXpos()
{
	return xPos;
}

public int getYpos()
{
	return yPos;
}

public void setX(int newX)
{
	xPos=newX;
}

public void setY(int newY)
{
	yPos=newY;
}

public void setXVelocity(int newXVel)
{
	xVel=newXVel;
}

public void setYVelocity(int newYVel)
{
	yVel=newYVel;
}

public int getSize()
{
	return radius;
}

//Methods:

//Precondition: xVel is not 0
//Postcondition: xVel is multiplied by -1 which causes it to travel in the opposite horizontal direction it was just traveling in
public void reverseX()
{
	xVel*=-1;
}

//Precondition: yVel is not 0
//Postcondition: yVel is multiplied by -1 which causes it to travel in the opposite vertical direction it was just traveling in
public void reverseY()
{
	yVel*=-1;
}

//Precondition: g cannot be null
//Postcondition: paints the object g white in an oval shape
public void draw(Graphics g)
	{
		g.setColor(Color.white);
		g.fillOval(xPos, yPos, radius, radius);
	}

//Precondition: none
//Postcondition: xVel and yVel are added to xPos and yPos, respectively, which moves the ball object left/right/up/down depending on their respective values
	public void move()
	{
		xPos+=xVel;
		yPos+=yVel;
	}

}
