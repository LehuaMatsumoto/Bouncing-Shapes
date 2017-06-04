/*    Lehua Matsumoto | mmat346
 *    ===============================================================================
 *    MovingRectangle.java : A subclass of MovingShape.
 *    A shape has a top-left corner (x,y).
 *    A shape defines various properties, including selected, fill colour, border color,
 *    width and height.
 *    ===============================================================================
 */

import java.awt.*;

public class MovingRectangle extends MovingShape{
    /** constructor to create a shape with default values
      */
    public MovingRectangle() {
    	// call to MovingShape default constructor
    	super();
    }

    /** constructor to create a rectangle
     * @param x         the x-coordinate of the new shape
     * @param y        the y-coordinate of the new shape
     * @param mw         the margin width of the animation panel
     * @param mh        the margin height of the animation panel
     * @param c        the colour of the new shape
     * @param typeOfPath         the path of the new shape
     */
    public MovingRectangle(int x, int y, int mw, int mh, int width, int height, Color c, Color fc, int pathType) {
    	// call to MovingShape constructor with parameters
    	super(x, y, mw, mh, width, height, c, fc, pathType);
    }

    /** contains method implemented from MovingShape
     * Returns whether the point p is inside the shape or not.
     * @param p    the mouse point
     */
	public boolean contains(Point p) {
		return ((p.getX() >= super.getX()) 
				&& (p.getX() <= (super.getX() + width))
				&& (p.getY() >= super.getY()) 
				&& (p.getY() <= (super.getY() + height)));
	}

	/** draw method implemented from MovingShape
     * draw the shape
     * @param g     the Graphics control
     */
	public void draw(Graphics g) {
		g.setColor(super.borderColor);
		g.drawRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
		g.setColor(super.fillColor);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}

    /** area method implemented from MovingShape
     * Returns the area of all shapes in the program
     * @return      the area value - width * height
     */
    public int area() {
        return this.getWidth() * this.getHeight();
    }
}