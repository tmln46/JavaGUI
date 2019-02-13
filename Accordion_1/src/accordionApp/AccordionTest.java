/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accordionApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Developer
 */
public class AccordionTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        
        RadioButton rbSmall = new RadioButton("Small");
        RadioButton rbMedium = new RadioButton("Medium");
        RadioButton rbLarge = new RadioButton("Larger");

        ToggleGroup sizeGroup = new ToggleGroup();
        sizeGroup.getToggles().addAll(rbSmall,rbMedium,rbLarge);
        rbSmall.setSelected(true);
        
        VBox size = new VBox(10);
        size.setPadding(new Insets(10));
        size.getChildren().addAll(rbSmall,rbMedium,rbLarge);
        
        TitledPane sizeTPane = new TitledPane("Size",size);
        
        RadioButton rbThin = new RadioButton("Thin Crust");
        RadioButton rbThick = new RadioButton("Small");

        ToggleGroup styleGroup = new ToggleGroup();
        styleGroup.getToggles().addAll(rbThin,rbThick);
        rbThin.setSelected(true);
        
        VBox styleBox = new VBox(10);
        styleBox.setPadding(new Insets(10));
        styleBox.getChildren().addAll(rbThin,rbThick);
        
        TitledPane stylePane= new TitledPane("Style", styleBox);
        
        CheckBox cbPepperoni = new CheckBox("Pepperoni");
        CheckBox cbSausage = new CheckBox("Sausage");
        CheckBox cbOlives = new CheckBox("Olives");
        CheckBox cbMushrooms = new CheckBox("Mushrooms");
        CheckBox cbAnchovies = new CheckBox("Anchovies");
 
        VBox toppingBox = new VBox(10);
        toppingBox.setPadding(new Insets(10));
        toppingBox.getChildren().addAll
        (cbPepperoni,cbSausage,cbOlives, cbMushrooms, cbAnchovies );
        
        TitledPane stoopingPane = new TitledPane("Topping", toppingBox);
       
        Accordion acc = new Accordion();
        acc.getPanes().addAll(sizeTPane,stylePane,stoopingPane);
        
        ColorPicker cp = new ColorPicker();
        Hyperlink hl = new Hyperlink("Something Inportant");
        hl.setPadding(new Insets(10));
        VBox colorBox = new VBox(10, cp,hl);
        colorBox.setPadding(new Insets(10));
        

         
        HBox root = new HBox(10,acc, colorBox);
        root.setPadding(new Insets(10,10,10,10));
        Scene scene = new Scene(root,400,200);
        
       
        primaryStage.setTitle("Accordion");
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
