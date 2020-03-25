
package biology;

import javafx.geometry.Point2D;
import javafx.scene.effect.BlendMode;
import javafx.scene.paint.Paint;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Particle {
private double x;
private double y;
private Point2D velocity;
private Paint color;
private BlendMode blendmode;
private double radius;
private double life=1;
private double decay;

    
public Particle(double x,double y,Point2D velocity,Paint color,BlendMode blendmode,double radius,double expiretime){
this.x=x;
this.y=y;
this.velocity=velocity;
this.color=color;
this.blendmode=blendmode;
this.radius=radius;
this.decay=0.16/expiretime;

}
public Boolean islive(){
return life>0;
}
public void update(){
x+=velocity.getX();
y+=velocity.getY();
life-=decay;

}
public void render(GraphicsContext g){
g.setGlobalAlpha(life);
g.setGlobalBlendMode(blendmode);
g.setFill(color);
g.fillOval(x, y,radius, radius);

}



}
