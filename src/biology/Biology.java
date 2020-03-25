/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package biology;

import java.util.ArrayList;
import java.util.List;
import  java.util.Iterator;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlendMode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
*
* @author busia
*/
public class Biology extends Application {
private Button btn;
private Button foodbtn;
private Button soilbtn;
private Button plantbtn;
private Button animalbtn;
private Button geneticsbtn;
private Boolean show=true;
private Boolean shownotes=true;
private Boolean showexamples=true;
Group root;
GridPane pane;
Pane paneholder;
HBox holderone;
GridPane notescontainer;
Text label;
Pagination pages;
private Boolean expshow=true;
Rectangle candle;
LinearGradient lg;
private Emitter emitter=new Fire();
private List<Particle> particles=new ArrayList();
Particle p;
Iterator<Particle>it;
AnimationTimer at;

private void update(){
    g.setGlobalAlpha(1.0);
    g.setGlobalBlendMode(BlendMode.SRC_OVER);
    g.setFill(Color.BLACK);
    g.fillRect(0, 0, 400,400);
    
    particles.addAll(emitter.emitter(200, 200));
for(it=particles.iterator();it.hasNext();){
p=it.next();
p.update();
if(!p.islive()){
it.remove();
  continue;

}
p.render(g);

}

}
private GraphicsContext  g;
private Canvas  canvas;
 
@Override
public void start(Stage primaryStage) {
btn = new Button("Biological drawing");
btn.setPrefSize(250,50);
foodbtn = new Button("Food Tests");
foodbtn.setPrefSize(250,50);
foodbtn.setOnMouseClicked(e->foodtests(e));
soilbtn = new Button("soil Science");
soilbtn.setOnMouseClicked(e->soilscience(e));
soilbtn.setPrefSize(250,50);
plantbtn = new Button("plant Components");
plantbtn.setOnMouseClicked(e->plantcomponent(e));
plantbtn.setPrefSize(250,50);
animalbtn = new Button("Animal Components");
animalbtn.setPrefSize(250,50);
animalbtn.setOnMouseClicked(e->animalcomponent(e));
geneticsbtn = new Button("Genetics");
geneticsbtn.setOnMouseClicked(e->genetics(e));
geneticsbtn.setPrefSize(250,50);
label=new Text();
btn.setOnMouseMoved(new EventHandler<MouseEvent>(){
@Override
public void handle(MouseEvent event) {
label.setText("this section is about features of biological drawing");
}



});
btn.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
if(show==true){
show=false;
Button Notes=new Button("preview Notes");
Notes.setPrefSize(250,50);
Notes.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
if(shownotes==true){
shownotes=false;
notescontainer=new GridPane();
TextArea mynotes=new TextArea();
mynotes.setFont(Font.font("Arial", FontWeight.BOLD,18));
mynotes.setEditable(false);
mynotes.setText("\nTECHIQUES IN DRAWING AND LABELING BIOLOGY DIAGRAMS");

mynotes.appendText("\nThe aims and objective of this chapter");
mynotes.appendText("\nto understand the techniques needed in biology practical");
mynotes.appendText("\naccuracy and time conscious");
mynotes.appendText("\nthe importance of using sharp tools");
mynotes.appendText("\nhow to handle drawing tools");
mynotes.appendText("\nbackground information.");
mynotes.appendText("\nThe basic necessity is well-labelled diagram in biology practicals.");
mynotes.appendText("\nBefore one starts to draw,one should bear in the mind the rules,techniques and tips for drawing them");
mynotes.appendText("\n1.use sharp Hb pencil,knife,razor blade,scalpel,forceps etc,the use of sharp drawing instrument gives ");
mynotes.appendText("\n a thin outline of clear diagram,while sharp knife,razor blade,scalpel cut through aspecimen once and deep");
mynotes.appendText("\n hence giving asharp clear outline for drawing,meanwhile sharp pencil will produce aclear diagram with a smooth and thin outline");
mynotes.appendText("\n2.SHADDING DIAGRAMS SHOULD BE AVOIDED.");
mynotes.appendText("\nshadding hides the neccessary information that is required by the examiner");
mynotes.appendText("\n 3.DRAW LARGE CLEAR DIAGRAMS WITH REQUIRED DETAILS");
mynotes.appendText("\nlarge diagrams give more labeling space for more required details");
mynotes.appendText("\nDRAW PROPORTION AND INSHAPE DIAGRAMS");
mynotes.appendText("\nAvoid leaving gaps between parts of the drawn specimen");
mynotes.appendText("\nleaving any gap in diagram means a cut ,biological specimens are not cutted");
mynotes.appendText("\n you must draw the right view of the specimen");
mynotes.appendText("\ndraw the required view of the specimen by the examiner");
mynotes.appendText("\n7.never use arrowheads when drawing labeling lines");
mynotes.appendText("\n arrow heads are used in other subjects like chemistry and biology to show current in circuits");
mynotes.appendText("\n 8.lines never touch or cross each other");
mynotes.appendText("\nreal sight is lost where lines cross each other,hence labelling lines should be parallel to each other");
mynotes.appendText("\n labeling lines should touch aparticular part or structure described on the specimen drawn");
mynotes.appendText("\nhanging lines should be avoided in biological drawings");
mynotes.appendText("\n avoid using keys while labeling");
mynotes.appendText("\nyou should  point labelling line to particular part specified not using  keys");
mynotes.appendText("\n use correct terms and spelling");
mynotes.appendText("\nsome scientific terms might have the same sound but different meaning and spelling,forexample");
mynotes.appendText("\nradicle and radical");
mynotes.appendText("\nMinimize or avoid rubbing after you have drawn adiagram");
mynotes.appendText("\ntoo much rubbing makes the diagram dirty");
mynotes.appendText("\nAVoid tracing any biological drawing");
mynotes.appendText("\nthe objective of drawing is train students to draw what they observe not to trace what is");
mynotes.appendText("\nalready drawn");
mynotes.appendText("\navoid using geometrical instruments for drawing practical diagrams");
mynotes.appendText("\n living organisms are not bulit on mathematical architectural pattern,physical appearance may very");
mynotes.appendText("\nwith various factors of the environment.environment factors such as temperature,food and water causes");
mynotes.appendText("\n certain organisims to vary in shape and size");
mynotes.appendText("\nalways state you magnification");
mynotes.appendText("\nthis shows how much the original specimen has been magnified or enlarged");
mynotes.appendText("\nAll biological drawings must be accompanied with an elaborate title/heading");
mynotes.appendText("\nthe heading must include specimen drawn and view from which it's being seen");
mynotes.appendText("\nremember to label in singular if only one structure is pointed at by the labeling line");

mynotes.setPrefSize(800, 400);
Button printnotes=new Button("PrintNotes");
notescontainer.addRow(0, mynotes);
notescontainer.addRow(1,printnotes);
notescontainer.setTranslateX(62);
notescontainer.setTranslateY(206);
//notescontainer.getChildren().addAll(mynotes,printnotes);
root.getChildren().add(notescontainer);
}else if(shownotes==false){
shownotes=true;
root.getChildren().remove(notescontainer);
notescontainer=null;

}
}



});
Button Examples=new Button("Examples");
Examples.setPrefSize(250,50);
Examples.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
if(showexamples==true){
showexamples=false;
root.getChildren().remove(notescontainer);
notescontainer=null;
//Notes.setOnAction(null);
}else if(showexamples==false){
showexamples=true;
//Notes.setOnAction(this);
}
}


});
Button Exercise =new Button("Exercise");
Exercise.setPrefSize(250,50);
Button Consult=new Button("Consult");
Consult.setPrefSize(250,50);
holderone=new HBox();

holderone.setPrefHeight(40);

holderone.setPrefWidth(1200);
holderone.setSpacing(100);
holderone.setStyle("-fx-background-color:lightblue");
holderone.getChildren().addAll(Notes,Examples,Exercise,Consult);
holderone.setTranslateX(62);
holderone.setTranslateY(152);
root.getChildren().add(holderone);
btn.setVisible(true);
foodbtn.setVisible(false);
soilbtn.setVisible(false);
plantbtn.setVisible(false);
animalbtn.setVisible(false);
geneticsbtn.setVisible(false);
}else if(show==false){
show=true;
btn.setVisible(true);
foodbtn.setVisible(true);
soilbtn.setVisible(true);
plantbtn.setVisible(true);
animalbtn.setVisible(true);
geneticsbtn.setVisible(true);
root.getChildren().remove(holderone);
holderone=null;
if(shownotes==false){
shownotes=true;
root.getChildren().remove(notescontainer);
notescontainer=null;

}


}    
}



});

paneholder=new Pane();
paneholder.getChildren().addAll(btn,foodbtn,soilbtn,plantbtn,animalbtn,geneticsbtn);
btn.setTranslateX(600);
btn.setTranslateY(75);
foodbtn.setTranslateX(600);
foodbtn.setTranslateY(159);
soilbtn.setTranslateX(600);
soilbtn.setTranslateY(243);
plantbtn.setTranslateX(600);
plantbtn.setTranslateY(327);
animalbtn.setTranslateX(600);
animalbtn.setTranslateY(411);
geneticsbtn.setTranslateX(600);
geneticsbtn.setTranslateY(495);
root = new Group();
root.getChildren().add(paneholder);
Scene scene = new Scene(root,840,400);
scene.setOnMouseClicked(new EventHandler<MouseEvent>(){
@Override
public void handle(MouseEvent event) {
System.out.print("x:\n"+ event.getSceneX());
System.out.print("y\n:"+event.getSceneY());
}


});
at=new AnimationTimer(){
@Override
public void handle(long now) {
 update();   
}

};

primaryStage.setTitle("Biology virtual app");
primaryStage.setScene(scene);
primaryStage.show();
}

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
launch(args);
}

private void foodtests(MouseEvent e) {
if(show==true){
show=false;

foodbtn.setVisible(true);
btn.setVisible(false);
soilbtn.setVisible(false);
plantbtn.setVisible(false);
animalbtn.setVisible(false);
geneticsbtn.setVisible(false);
foodbtn.setTranslateX(600);
foodbtn.setTranslateY(75);
Button demonstration=new Button("demonstration");
demonstration.setPrefSize(250,50);
Button Experiment=new Button("Experiment");
Experiment.setPrefSize(250,50);
Experiment.setOnMouseClicked(m->onexperiment(m));
Button Exercisefood =new Button("Exercise");
Exercisefood.setPrefSize(250,50);
Button Consultfood=new Button("Consult");
Consultfood.setPrefSize(250,50);
canvas =new Canvas(400,400);
canvas.setTranslateX(585);
canvas.setTranslateY(239);
g=canvas.getGraphicsContext2D();
holderone=new HBox();

holderone.setPrefHeight(40);

holderone.setPrefWidth(1200);
holderone.setSpacing(100);
holderone.setStyle("-fx-background-color:lightblue");
holderone.getChildren().addAll(Experiment,demonstration,Exercisefood,Consultfood);
holderone.setTranslateX(62);
holderone.setTranslateY(152);
root.getChildren().add(holderone);
root.getChildren().add(canvas);
at.start();
}else if(show==false){
show=true;
root.getChildren().remove(holderone);
root.getChildren().remove(pages);
root.getChildren().remove(canvas);
at.stop();
foodbtn.setTranslateX(600);
foodbtn.setTranslateY(159);
foodbtn.setVisible(true);
btn.setVisible(true);
soilbtn.setVisible(true);
plantbtn.setVisible(true);
animalbtn.setVisible(true);
geneticsbtn.setVisible(true);
}

}

private void soilscience(MouseEvent e) {

if(show==true){
show=false;
foodbtn.setVisible(false);
btn.setVisible(false);
soilbtn.setVisible(true);
plantbtn.setVisible(false);
animalbtn.setVisible(false);
geneticsbtn.setVisible(false);
soilbtn.setTranslateX(600);
soilbtn.setTranslateY(75);

}else if(show==false){
show=true;
foodbtn.setVisible(true);
btn.setVisible(true);
soilbtn.setVisible(true);
plantbtn.setVisible(true);
animalbtn.setVisible(true);
geneticsbtn.setVisible(true);
soilbtn.setTranslateX(600);
soilbtn.setTranslateY(243);

}   

}

private void plantcomponent(MouseEvent e) {
if(show==true){
show=false;
foodbtn.setVisible(false);
btn.setVisible(false);
soilbtn.setVisible(false);
plantbtn.setVisible(true);
animalbtn.setVisible(false);
geneticsbtn.setVisible(false);
plantbtn.setTranslateX(600);
plantbtn.setTranslateY(75);

}else if(show==false){
show=true;
foodbtn.setVisible(true);
btn.setVisible(true);
soilbtn.setVisible(true);
plantbtn.setVisible(true);
animalbtn.setVisible(true);
geneticsbtn.setVisible(true);
plantbtn.setTranslateX(600);
plantbtn.setTranslateY(327);

}
}

private void animalcomponent(MouseEvent e) {
if(show==true){
show=false;
foodbtn.setVisible(false);
btn.setVisible(false);
soilbtn.setVisible(false);
plantbtn.setVisible(false);
animalbtn.setVisible(true);
geneticsbtn.setVisible(false);
animalbtn.setTranslateX(600);
animalbtn.setTranslateY(75);

}else if(show==false){
show=true;
foodbtn.setVisible(true);
btn.setVisible(true);
soilbtn.setVisible(true);
plantbtn.setVisible(true);
animalbtn.setVisible(true);
geneticsbtn.setVisible(true);
animalbtn.setTranslateX(600);
animalbtn.setTranslateY(411);

}
}

private void genetics(MouseEvent e) {
if(show==true){
show=false;
foodbtn.setVisible(false);
btn.setVisible(false);
soilbtn.setVisible(false);
plantbtn.setVisible(false);
animalbtn.setVisible(false);
geneticsbtn.setVisible(true);
geneticsbtn.setTranslateX(600);
geneticsbtn.setTranslateY(75);

}else if(show==false){
show=true;
foodbtn.setVisible(true);
btn.setVisible(true);
soilbtn.setVisible(true);
plantbtn.setVisible(true);
animalbtn.setVisible(true);
geneticsbtn.setVisible(true);
geneticsbtn.setTranslateX(600);
geneticsbtn.setTranslateY(495);
}


}

private void onexperiment(MouseEvent m) {
    if(expshow==true){
    expshow=false;
    pages=new Pagination(10);
    pages.setTranslateX(468);
    pages.setTranslateY(636);
    candle=new Rectangle(50, 100, 10, 100);
    lg=new LinearGradient(0,0,1,0,true,CycleMethod.NO_CYCLE,new Stop[]{new Stop(0,Color.BEIGE),new Stop(1,Color.BROWN)});
    candle.setFill(lg);



    root.getChildren().add(pages);
    root.getChildren().add(candle);
    }else if(expshow==false){
    root.getChildren().remove(pages);
    root.getChildren().remove(candle);
    expshow=true;
    }

}




}
