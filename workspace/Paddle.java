//Author: Roi Porat-Shliom
//Date: 12/12/2024
//Brief Description: Class paddle creates the paddle object in the Brick Break game and allows its horizonal motion and speed
import java.awt.*;

public class Paddle {

	//Instance variables;
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int xVel;
	
//Constructor:
//Precondition: none
//Postcondition: instance variables are assigned the values of the inputted parameters
	public Paddle(int xPos, int yPos, int width, int height)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
	}
	

//Getters and setters:
	public int getX()
	{
		return xPos;
	}

	public void setX(int xPos)
	{
		this.xPos = xPos;
	}

	public int getY()
	{
		return yPos;
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	public int getVelocity()
	{
		return xVel;
	}

	public void setVelocity(int xVel)
	{
		this.xVel = xVel;
	}

//Methods:

//Precondition: g cannot be null
//Postcondition: paints the object g white in a rectangular shape
	public void draw(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(xPos, yPos, width, height);
	}
	
//Precondition: addVel cannot be null
//Postcondition: xVel changes in accordance to addVel. If addVel is greater than 4 or less than -4, xVel is assigned 4 or -4, respectively	
	public void addVelocity(int addVel)
	{
		xVel+=addVel;
		if(xVel > 4){
			xVel = 4;
		}
		if(xVel < -4){
			xVel = -4;
		}
	}

//Precondition: none
//Postcondition: xVel is added to xPos which moves the paddle object left/right depending on xVel's value 
	public void move()
	{
			xPos+=xVel;		
	}

}
