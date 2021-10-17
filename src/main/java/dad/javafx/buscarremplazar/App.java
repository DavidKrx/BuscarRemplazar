package dad.javafx.buscarremplazar;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label buscarLabel=new Label();
		buscarLabel.setText("Buscar:");
		buscarLabel.setPadding(new Insets(5));
		buscarLabel.setAlignment(Pos.BASELINE_LEFT);
		
		Label remplazarLabel=new Label();
		remplazarLabel.setText("Remplazar con:");
		remplazarLabel.setPadding(new Insets(5));
		
		VBox Labelbox=new VBox();
		Labelbox.getChildren().addAll(buscarLabel, remplazarLabel);
		Labelbox.setAlignment(Pos.TOP_LEFT);
		Labelbox.setPadding(new Insets(5));
		Labelbox.setSpacing(5);
		
		TextField buscarTxf=new TextField();
		buscarTxf.setAlignment(Pos.TOP_CENTER);
		TextField remplazarTxf=new TextField();
		remplazarTxf.setAlignment(Pos.TOP_CENTER);
		
		CheckBox MayusMinChBox=new CheckBox();
		MayusMinChBox.setText("Mayúsculas y minúsculas");
		CheckBox BuscarAtrasChBox=new CheckBox();
		BuscarAtrasChBox.setText("Buscar hacia atrás");
		
		VBox checkHBox1=new VBox();
		checkHBox1.getChildren().addAll(MayusMinChBox, BuscarAtrasChBox);
		checkHBox1.setSpacing(5);
		checkHBox1.setPadding(new Insets(5));
		
		CheckBox ExpReguChBox=new CheckBox();
		ExpReguChBox.setText("Expresión regular");
		CheckBox ResaltarResulChBox=new CheckBox();
		ResaltarResulChBox.setText("Resaltar resultados");
		
		VBox checkHBox2=new VBox();
		checkHBox2.getChildren().addAll(ExpReguChBox, ResaltarResulChBox);
		checkHBox2.setSpacing(5);
		checkHBox2.setPadding(new Insets(5));
		
		HBox cajaChb=new HBox();
		cajaChb.getChildren().addAll(checkHBox1,checkHBox2);
	
		VBox TextFieldBox=new VBox();
		TextFieldBox.getChildren().addAll(buscarTxf,remplazarTxf,cajaChb);
		TextFieldBox.setAlignment(Pos.TOP_CENTER);
		TextFieldBox.setPadding(new Insets(5));
		TextFieldBox.setSpacing(5);
		TextFieldBox.isFillWidth();
		
		Button buscarButton=new Button();
		buscarButton.setText("Buscar");
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		
		
		Button remplazarButton=new Button("Remplazar");
		remplazarButton.setMaxWidth(Double.MAX_VALUE);
	
		
		Button remplazarTodoButton=new Button("Remplazar todo");
		remplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
		
		Button cerrarButton=new Button("Cerrar");
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		
		Button ayudaButton=new Button("Ayuda");
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
	
		
		VBox ButtonBox=new VBox();
		ButtonBox.getChildren().addAll(buscarButton, remplazarButton, remplazarTodoButton,cerrarButton, ayudaButton);
		ButtonBox.setPadding(new Insets(5));
		ButtonBox.setAlignment(Pos.TOP_CENTER);
		ButtonBox.setMaxWidth(150);
		ButtonBox.setSpacing(5);
		ButtonBox.isFillWidth();
		
		BorderPane root=new BorderPane();
		root.setLeft(Labelbox);
		root.setCenter(TextFieldBox);
		root.setRight(ButtonBox);
		
		Scene scene=new Scene(root, 600,400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Buscar y Remplazar");
		primaryStage.show();
	}

	public static void main(String[] args) {
	launch(args);
	}

	
}
