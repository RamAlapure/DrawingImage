/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingimage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ram
 */
public class DrawingImage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Image");
        
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.FLORALWHITE);
        
        // First Line 
        Line line1 = new Line(200, 20, 300,20);
        line1.setStroke(Color.BLACK);
        /*line1.setStartX(200);
        line1.setStartY(20);
        line1.setEndX(300);
        line1.setEndY(20);*/        
        root.getChildren().add(line1);
        
        // Second Line
        Line line2 =new Line(200, 20, 180, 100);
        line2.setStroke(Color.BLACK);//set color of the line
        root.getChildren().add(line2);
        
        // Third Line
        Line line3 =new Line(300, 20, 320, 100);
        line3.setStroke(Color.BLACK);//set color of the line
        root.getChildren().add(line3);
        
        // Quad-Curve
        QuadCurve quad = new QuadCurve(180, 100, 245, 50, 320, 100);
        quad.setStroke(Color.BLACK);
        /*quad.setStartX(180);
        quad.setStartY(100);
        quad.setControlX(245);
        quad.setControlY(50);
        quad.setEndX(320);
        quad.setEndY(100);*/
        quad.setFill(Color.WHITE);
        root.getChildren().add(quad);
        
        //Ellipse face
        Ellipse face = new Ellipse(250, 115, 55, 45);
        face.setStroke(Color.BLACK);
        /*face.setCenterX(250);
        face.setCenterY(115);
        face.setRadiusX(55);
        face.setRadiusY(45);*/
        face.setFill(Color.YELLOW);
        root.getChildren().add(face);
        
        //Eye
        Ellipse eye1 = new Ellipse(230, 105, 8, 4);
        eye1.setStroke(Color.BLACK);
        eye1.setFill(Color.FLORALWHITE);
        root.getChildren().add(eye1);
        
        Ellipse eye2 = new Ellipse(270, 105, 8, 4);
        eye2.setStroke(Color.BLACK);
        eye2.setFill(Color.FLORALWHITE);
        root.getChildren().add(eye2);
        
        // A smile
        QuadCurve smily = new QuadCurve(230, 140, 250, 150, 270, 140);
        smily.setStroke(Color.BLACK);
        smily.setFill(Color.FLORALWHITE);
        root.getChildren().add(smily);
        
        //Hands
        Rectangle hand1 = new Rectangle(20, 150);
        hand1.setStroke(Color.BLACK);
        hand1.setFill(Color.FLORALWHITE);
        hand1.setRotate(40);
        hand1.setX(100);
        hand1.setY(220);
        /*hand1.setWidth(20);
        hand1.setHeight(150);*/
        hand1.setArcWidth(20);
        hand1.setArcHeight(30);
        root.getChildren().add(hand1); 
        
        Rectangle hand2 = new Rectangle(20, 150);
        hand2.setStroke(Color.BLACK);
        hand2.setFill(Color.FLORALWHITE);
        hand2.setRotate(320);
        hand2.setX(380);
        hand2.setY(220);
        hand2.setArcWidth(20);
        hand2.setArcHeight(30);
        root.getChildren().add(hand2); 
        
        //Legs
        Rectangle leg1 = new Rectangle(20,150);
        leg1.setStroke(Color.BLACK);
        leg1.setFill(Color.FLORALWHITE);
        leg1.setX(200);
        leg1.setY(380);
        /*leg1.setWidth(20);
        leg1.setHeight(150);*/
        leg1.setArcWidth(20);
        leg1.setArcHeight(30);
        root.getChildren().add(leg1);
        
        Rectangle leg2 = new Rectangle(20, 150);
        leg2.setStroke(Color.BLACK);
        leg2.setFill(Color.FLORALWHITE);
        leg2.setX(280);
        leg2.setY(380);
        leg2.setArcWidth(20);
        leg2.setArcHeight(30);
        root.getChildren().add(leg2);
        
        //Body
        Ellipse Body = new Ellipse(250, 282, 120, 120);
        Body.setStroke(Color.BLACK);
        
        LinearGradient color = new LinearGradient(
                250, // start X
                282, // start Y
                120, // end X
                120, // end Y
                false, // proportional
                CycleMethod.REFLECT, // cycleMethod
                new Stop(0, Color.rgb(120, 55, 80, .97)),
                new Stop(1, Color.rgb(90, 150, 60, .97))
        );
        
        Body.setFill(color);
        // A body filled with a linear gradient with a reflective cycle.
        root.getChildren().add(Body);
        
        //Tie
        Rectangle tie = new Rectangle();
        tie.setStroke(Color.BLACK);
        tie.setFill(Color.RED);
        tie.setX(240);
        tie.setY(163);
        tie.setWidth(20);
        tie.setHeight(235);
        tie.setArcWidth(20);
        tie.setArcHeight(30);
        root.getChildren().add(tie);
        
        //Text
        Text text = new Text(380, 50, "Hi friends, \nThis is \ndesigned by \nRam");
        Font font = new Font("Serif", 20);
        text.setFont(font);
        text.setFill(Color.RED);
        
        // Shadow
        DropShadow shadow = new DropShadow();
        shadow.setOffsetX(10);
        shadow.setOffsetY(10);
        shadow.setColor(Color.rgb(50, 50, 50, 0.6));
        text.setEffect(shadow);
        
        //Reflection
        Text text1 = new Text(380, 180, "Created on 12/11/2015");
        text1.setFont(font);
        text1.setFill(Color.MAROON);
        Reflection reflect = new Reflection();
        reflect.setFraction(8);
        reflect.setTopOffset(5);
        text1.setEffect(reflect);
        root.getChildren().addAll(text, text1);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
