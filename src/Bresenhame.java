import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Bresenhame extends Point{
	static void DrawCircle(Color c , Graphics g,int x1,int y1,float r) {
		Graphics2D g2d =(Graphics2D) g;
		int x,y,d;
		d=1-(int)r;
		x=0;
		y=(int)r;
		g2d.setColor(c);
		while(x<=y){
			g2d.fillOval(x+x1,y+y1,3,3);
			g2d.fillOval(x+x1,-y+y1,3,3);
			g2d.fillOval(-x+x1,y+y1,3,3);
			g2d.fillOval(-x+x1,-y+y1,3,3);
			g2d.fillOval(y+x1,x+y1,3,3);
			g2d.fillOval(y+x1,-x+y1,3,3);
			g2d.fillOval(-y+x1,x+y1,3,3);
			g2d.fillOval(-y+x1,-x+y1,3,3);
			if(d>0){
				x+=1;
		        y-=1;
				d+=4*(x-y)+10;
			}
			else{
				x+=1;
				d+=4*x+6;
			}
		}
	}

	static void drawLine(Color c,Graphics g, int x1, int y1, int width, int height) {
		Graphics2D g2d =(Graphics2D) g;
    	g2d.setColor(c);
        int x2 = x1 + width;
        int y2 = y1 + height;
        int deltax = Math.abs(x2 - x1);
        int deltay = Math.abs(y2 - y1);
        int error = 0;
        int y = y1;
        for( int x=x1; x<x2; x++) {
            g2d.fillOval(x, y,3,3);
            error = error + deltay;
            	if( 2*error >= deltax ) {
            		y++;
            		error -= deltax;
            }
        }
    }
}