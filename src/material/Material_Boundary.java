package material;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Material_Boundary extends Application  {

	Label labelMaterial = new Label("Material");
	Label labelTipoMaterial = new Label("Tipo material");
	Label labelQuantidade = new Label("Quantidade");

	TextField fieldMaterial = new TextField();
	TextField fieldQuantidade = new TextField();

	Button btnSalvar = new Button();
	Button btnExcluir = new Button();
	Button btnPesquisar = new Button();

	final ComboBox tipoMaterialComboBox = new ComboBox();
	final ComboBox quantiComboBox = new ComboBox();

	private TableView table = new TableView();

	Material_Control materialControle = new Material_Control();

	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Materiais");
		primaryStage.show();

		BorderPane border = new BorderPane();
		border.setPadding(new Insets(10, 50, 50, 50));


		VBox vbox = new VBox();
		HBox hbox = new HBox();
		HBox hboxBtn = new HBox();

		hboxBtn.setAlignment(Pos.BOTTOM_RIGHT);




		ObservableList<String> tipoQuantidade =
				FXCollections.observableArrayList("mg", "unid", "ml", "lt");


		ObservableList<String> tipoMaterial =
				FXCollections.observableArrayList("remedio", "utensilio", "descartavel", "maquina");

		tipoMaterialComboBox.setItems(tipoMaterial);
		quantiComboBox.setItems(tipoQuantidade);
		//-----------------------------------------------------------------------------------------------------------------
		TableColumn<Material_Entity, String> primeira = new TableColumn("Material");
		primeira.setCellValueFactory(new PropertyValueFactory<Material_Entity, String>("nomeMaterial"));

		TableColumn<Material_Entity, Integer> segunda = new TableColumn("Quantidade");
		segunda.setCellValueFactory(new PropertyValueFactory<Material_Entity, Integer>("quantidade"));

		TableColumn<Material_Entity, String> terceira = new TableColumn("tipoQuantidade");
		terceira.setCellValueFactory(new PropertyValueFactory<Material_Entity, String>("tipoQuantidade"));


		TableColumn<Material_Entity, String> quarta = new TableColumn("Tipo material");
		quarta.setCellValueFactory(new PropertyValueFactory<Material_Entity, String>("tipo"));


		table.getColumns().addAll(primeira, segunda, terceira, quarta);

		materialControle.retornaMaterial();
		table.setItems(materialControle.lista);

		table.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Material_Entity>() {
					@Override
			public void changed(ObservableValue<? extends Material_Entity>
			observable, Material_Entity oldValue, Material_Entity newValue) {
						entidadeParaBoundary(newValue);
					}
				});

		//-----------------------------------------------------------------------------------------------------------------
		btnSalvar.setText("Salvar");
		btnExcluir.setText("Excluir");
		btnPesquisar.setText("Pesquisar");

		btnSalvar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle (ActionEvent e) {
				materialControle.adicionarMaterial(boundaryParaEntidade());
			}
		});

		btnExcluir.setOnAction(new EventHandler<ActionEvent>() {
			public void handle (ActionEvent e) {
				btnExcluir.setText("Excluído!");
			}
		});

		btnPesquisar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle (ActionEvent e) {
				btnPesquisar.setText("Pesquisado!");
			}
		});


		vbox.getChildren().add(labelMaterial);		
		vbox.getChildren().add(fieldMaterial);

		vbox.getChildren().add(labelTipoMaterial);
		vbox.getChildren().add(tipoMaterialComboBox);


		vbox.getChildren().add(labelQuantidade);		
		hbox.getChildren().addAll(fieldQuantidade, quantiComboBox);
		vbox.getChildren().add(hbox);

		vbox.getChildren().add(table);


		hboxBtn.getChildren().add(btnPesquisar);
		hboxBtn.getChildren().add(btnSalvar);
		hboxBtn.getChildren().add(btnExcluir);
		//vbox.getChildren().add(hboxBtn);

		border.setCenter(vbox);
		border.setBottom(hboxBtn);

		Scene scene = new Scene(border, 300, 275);
		primaryStage.setScene(scene);
	}

	private void entidadeParaBoundary(Material_Entity mat) {
		if (mat != null) {
			fieldMaterial.setText(String.valueOf(mat.getNomeMaterial()));
			fieldQuantidade.setText(String.valueOf(mat.getQuantidade()));
			tipoMaterialComboBox.setPromptText(mat.getTipo());
			quantiComboBox.setPromptText(mat.getTipoQuantidade());
		}

	}

	private Material_Entity boundaryParaEntidade() {
		Material_Entity mat = new Material_Entity();
		try {
			mat.setNomeMaterial(fieldMaterial.getText());
			mat.setQuantidade(Integer.parseInt(fieldQuantidade.getText()));
			mat.setTipo(tipoMaterialComboBox.getValue().toString());
			mat.setTipoQuantidade(quantiComboBox.getValue().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mat;
	}



}
