import java.awt.*;
import java.applet.*;

class AmericanFlag {

	public int height, width;
	public double scale;

	public Rectangle union;
	public Rectangle[] stripes; 

	public AmericanFlag(int width, int height, double scale) {
		this.scale = scale;
		this.stripes = new Rectangle[13];
		this.union = new Rectangle[width, height (scale*99, scale*66) Color.blue];
		for (int i=0; i< 13; i++) {
			if (i % 2 == 0) {
				stripes[i] = new Rectangle();
			}else{
				stripes[i] = new Rectangle();
			}
		}
	}

	public void draw(Graphics g) {
		for (int i=0; i< 13; i++) {
			stripes[i].draw(g);
		}
	}

}