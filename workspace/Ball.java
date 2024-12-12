import java.awt.*;

public class Ball {
	//your code here!
	
	//Instance variables
	private int xPos;
	private int yPos;
	private int radius;
	private int xVel;
	private int yVel;
	
	//Constructor:
	public Ball(int xPos, int yPos, int radius)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.radius = radius;
	}
	
	//Methods:

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

public void reverseX()
{
	xVel*=-1;
}

public void reverseY()
{
	yVel*=-1;
}

public int getSize()
{
	return radius;
}

public void draw(Graphics g)
	{
		//this needs to be changed just copy pasted
		g.setColor(Color.white);
		g.fillOval(xPos, yPos, radius, radius);
	}

	public void move()
	{
		xPos+=xVel;
		yPos+=yVel;
	}

}
