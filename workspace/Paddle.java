import java.awt.*;

public class Paddle {

	//Instance variables;
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int xVel;
	
	//Constructor:
	public Paddle(int xPos, int yPos, int width, int height)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
	}
	
	//Methods:

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

	public void draw(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(xPos, yPos, width, height);
	}
	
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

	public void move()
	{
			xPos+=xVel;		
	}

}
