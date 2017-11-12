package Source;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class Viewfx extends Application {

	public Model model;
	public Controler controler;
	public String nom;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m = new Model();
		Controler c = new Controler(m);
		launch(args);
		
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

        primaryStage.setTitle("Distribition Tarot Thibault MANSIER -Meriem AKKOUCHE");
        StackPane sp = new StackPane();
        Image img = new Image("Source/Tarotfond.jpg");
        ImageView imgView = new ImageView(img);
        sp.getChildren().add(imgView);
        Scene scene = new Scene(sp);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
		
		
	}

}
