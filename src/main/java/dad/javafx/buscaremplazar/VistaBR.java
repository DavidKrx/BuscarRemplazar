package dad.javafx.buscaremplazar;

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
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaBR extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) {
		VBox rootf = new VBox();
		Label labelBuscar = new Label("Buscar:");
		labelBuscar.setPrefWidth(Double.MAX_VALUE);
		labelBuscar.setMinWidth(20);
		labelBuscar.setMaxWidth(100);

		TextField txtBuscar = new TextField();

		Label labelReempl = new Label("Reemplazar con:");
		labelReempl.setPrefWidth(Double.MAX_VALUE);
		labelReempl.setMinWidth(20);
		labelReempl.setMaxWidth(100);
		TextField txtReempl = new TextField();

		CheckBox checkBox1 = new CheckBox("Mayúsculas y minúsculas");
		CheckBox checkBox2 = new CheckBox("Buscar hacia atrás");
		CheckBox checkBox3 = new CheckBox("Expresión regular");
		CheckBox checkBox4 = new CheckBox("Resaltar resultados");

		Button Button1 = new Button("Buscar");
		Button1.setMaxWidth(Double.MAX_VALUE);
		Button Button2 = new Button("Reemplazar");
		Button2.setMaxWidth(Double.MAX_VALUE);
		Button Button3 = new Button("Reemplazar todo");
		Button3.setMaxWidth(Double.MAX_VALUE);
		Button Button4 = new Button("Cerrar");
		Button4.setMaxWidth(Double.MAX_VALUE);
		Button Button5 = new Button("Ayuda");
		Button5.setMaxWidth(Double.MAX_VALUE);

		HBox b = new HBox();
		b.setPrefWidth(rootf.getPrefWidth());
		// b.setPadding(new Insets(5));
		b.getChildren().addAll(labelBuscar, txtBuscar);

		HBox r = new HBox();
		// r.setSpacing(5);
		// r.setPadding(new Insets(5));
		r.getChildren().addAll(labelReempl, txtReempl);

		HBox.setHgrow(txtBuscar, Priority.ALWAYS);
		HBox.setHgrow(txtReempl, Priority.ALWAYS);

		VBox butt = new VBox();
		butt.setPadding(new Insets(5));
		butt.setSpacing(5);
		butt.getChildren().addAll(Button1, Button2, Button3, Button4, Button5);

		VBox chek = new VBox();
		chek.getChildren().addAll(checkBox1, checkBox3);
		VBox check = new VBox();
		check.getChildren().addAll(checkBox2, checkBox4);

		HBox gds = new HBox();
		gds.getChildren().addAll(chek, check);
		gds.setAlignment(Pos.BASELINE_RIGHT);
		gds.setSpacing(5);

		rootf.setPadding(new Insets(5));
		rootf.setSpacing(5);
		rootf.setAlignment(Pos.TOP_CENTER);
		rootf.getChildren().addAll(b, r, gds);

		BorderPane pane = new BorderPane();
		pane.setCenter(rootf);
		pane.setRight(butt);

		Scene escena = new Scene(pane, 500, 200);

		stage.setScene(escena);
		stage.setTitle("Buscar y remplazar");
		stage.show();
		stage.setMinWidth(200);

	}
}