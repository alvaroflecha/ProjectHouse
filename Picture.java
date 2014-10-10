/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Circle suelo;


    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(100);
  
        sun.makeVisible();
        sun.slowMoveVertical(-45);
        sun.slowMoveVertical(-30);
        sun.slowMoveVertical(-25);
        sun.slowMoveVertical(-10);
        sun.slowMoveVertical(10);
        sun.slowMoveVertical(20);
        sun.slowMoveVertical(30);
        sun.slowMoveVertical(40);
        sun.slowMoveVertical(0);
        sun.slowMoveVertical(10);
        sun.slowMoveVertical(20);
        sun.slowMoveVertical(30);
        sun.slowMoveVertical(40);
        
        sun.changeSize(80);
        
        
        
        sun2 = new Circle();
        sun2.changeColor("green");
        sun2.moveHorizontal(50);
        sun2.moveVertical(-20);
        sun2.changeSize(80);
        sun2.makeVisible();
        
        suelo = new Circle();
        suelo.changeColor("green");
        suelo.moveHorizontal(-520);
        suelo.moveVertical(150);
        suelo.changeSize(1100);
        suelo.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            sun2.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            sun.changeColor("green");
        }
    }
}
