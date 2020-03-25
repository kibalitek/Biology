/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package biology;

import java.util.ArrayList;
import javafx.scene.paint.Color;
import java.util.List;
import javafx.geometry.Point2D;
import javafx.scene.effect.BlendMode;

/**
*
* @author busia
*/
public class Fire extends Emitter{

@Override
public List<Particle> emitter(double x, double y) {
    List<Particle> particles=new ArrayList();
   int np=30;
   for(int i=0;i<np;i++){
   Particle p=new Particle(x,y,new Point2D((Math.random()-0.5)*0.4,Math.random()*-8),Color.rgb(230, 40, 45),BlendMode.ADD,10,2);
   particles.add(p);
   }
  return particles; 
}

}
