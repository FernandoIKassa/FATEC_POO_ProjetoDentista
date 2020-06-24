package paciente;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Paciente_Boundary extends Application {
	private TableView table = new TableView();
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Materiais");
		primaryStage.show();
		
		BorderPane border = new BorderPane();
		
		VBox vbox = new VBox();
		HBox hbox = new HBox();
		HBox hboxBtn = new HBox();
		
		Label labelMaterial = new Label("Material");
		TextField fieldMaterial = new TextField();
		
		Label labelQuantidade = new Label("Quantidade");
		TextField fieldQuantidade = new TextField();
		ObservableList<String> tipoQuantidade =
				FXCollections.observableArrayList("mg", "unid", "ml", "lt");
		final ComboBox quantiComboBox = new ComboBox(tipoQuantidade);
		
		Label labelTipoMaterial = new Label("Tipo material");
		ObservableList<String> tipoMaterial =
				FXCollections.observableArrayList("remedio", "utensilio", "descartavel", "maquina");
		final ComboBox tipoMaterialComboBox = new ComboBox(tipoMaterial);
		
		TableColumn primeira = new TableColumn("Material");
		TableColumn segunda = new TableColumn("Quantidade");
		TableColumn terceira = new TableColumn("tipoQuantidade");
		TableColumn quarta = new TableColumn("Tipo material");
		
		table.setEditable(true);
		
		table.getColumns().addAll(primeira, segunda, terceira, quarta);
		
		Button btnSalvar = new Button();
		btnSalvar.setText("Salvar");
		Button btnExcluir = new Button();
		btnExcluir.setText("Excluir");
		
		btnSalvar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle (ActionEvent e) {
				btnSalvar.setText("Salvado!");
			}
		});
		
		btnExcluir.setOnAction(new EventHandler<ActionEvent>() {
			public void handle (ActionEvent e) {
				btnExcluir.setText("Salvado!");
			}
		});
		
		
		vbox.getChildren().add(labelMaterial);		
		vbox.getChildren().add(fieldMaterial);
		
		vbox.getChildren().add(labelQuantidade);		
		hbox.getChildren().addAll(fieldQuantidade, quantiComboBox);
		vbox.getChildren().add(hbox);
		
		vbox.getChildren().add(labelTipoMaterial);
		vbox.getChildren().add(tipoMaterialComboBox);
		vbox.getChildren().add(table);
		
		hboxBtn.getChildren().add(btnSalvar);
		hboxBtn.getChildren().add(btnExcluir);
		//vbox.getChildren().add(hboxBtn);
		
		border.setCenter(vbox);
		border.setBottom(hboxBtn);
		
		
		
		
		/*
		 * Button btn = new Button("Salvar"); HBox hbBtn = new HBox(10);
		 * hbBtn.setAlignment(Pos.BOTTOM_RIGHT); hbBtn.getChildren().add(btn);
		 * grid.add(hbBtn, 1, 4);
		 * 
		 * final Text actiontarget = new Text(); grid.add(actiontarget, 1, 6);
		 * 
		 * btn.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent e) {
		 * actiontarget.setFill(Color.FIREBRICK);
		 * actiontarget.setText("Botao login pressionado");
		 * 
		 * } });
		 */
		
		
		Scene scene = new Scene(border, 300, 275);
		primaryStage.setScene(scene);
		
		/*
		 * Text sceneTitle = new Text("Bem vindo!");
		 * sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		 * grid.add(sceneTitle, 0, 0, 2, 1);
		 * 
		 * Label userName = new Label("Usuário:"); grid.add(userName, 0, 1);
		 * 
		 * TextField userTextField = new TextField(); grid.add(userTextField, 1, 1);
		 * 
		 * Label pw = new Label ("Senha:"); grid.add(pw, 0, 2);
		 * 
		 * PasswordField pwBox = new PasswordField(); grid.add(pwBox, 1, 2);
		 */
	}
}
