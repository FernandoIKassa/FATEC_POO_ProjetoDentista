package consulta;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pesquisar_Consulta_Boundary extends Application {
	private TableView table = new TableView();

	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Consulta");
		primaryStage.show();

		BorderPane border = new BorderPane();

		VBox vboxTelaInteira = new VBox();
		border.setPadding(new Insets(10, 50, 50, 50));
		HBox hboxBtn = new HBox();
		hboxBtn.setAlignment(Pos.BOTTOM_RIGHT);

		Label labelPaciente = new Label("Pesquisar nome do Paciente");
		TextField fieldPaciente = new TextField();

		//--------------------------------------------------------------------------------------------
		Label labelCalendario = new Label("Data da consulta");
		DatePicker calendario = new DatePicker();


		Label labelHorario = new Label("Horario");
		ObservableList<Integer> hora = FXCollections.observableArrayList();
		ObservableList<Integer> minuto = FXCollections.observableArrayList();
		hora = getHora();
		minuto = getMinuto();
		final ComboBox horaComboBox = new ComboBox(hora);
		final ComboBox minutoComboBox = new ComboBox(minuto);

		//--------------------------------------------------------------------------------------------
		Label labelTipoOperacao = new Label("Tipo operação");
		ObservableList<String> tipoTipoOperacao =
				FXCollections.observableArrayList("consulta", "cirurgia", "retorno", "check-up");
		final ComboBox quantiComboBox = new ComboBox(tipoTipoOperacao);

		//--------------------------------------------------------------------------------------------
		Label labelDentista = new Label("Dentista");
		ObservableList<String> dentista =
				FXCollections.observableArrayList("Alessandra", "Cátia", "Lúcio", "Naomi");
		final ComboBox dentistaComboBox = new ComboBox(dentista);

		//--------------------------------------------------------------------------------------------
		TableColumn primeira = new TableColumn("Paciente");
		TableColumn segunda = new TableColumn("Data e hora");
		TableColumn terceira = new TableColumn("Dentista");
		TableColumn quarta = new TableColumn("Tipo Operação");

		table.setEditable(true);

		table.getColumns().addAll(primeira, segunda, terceira, quarta);

		//--------------------------------------------------------------------------------------------
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

		//--------------------------------------------------------------------------------------------


		vboxTelaInteira.getChildren().addAll(labelPaciente, fieldPaciente,
				labelCalendario, calendario,
				labelHorario, horaComboBox, minutoComboBox,
				labelTipoOperacao, quantiComboBox,
				labelDentista, dentistaComboBox,
				table);


		hboxBtn.getChildren().add(btnSalvar);
		hboxBtn.getChildren().add(btnExcluir);
		//vbox.getChildren().add(hboxBtn);

		border.setCenter(vboxTelaInteira);
		border.setBottom(hboxBtn);

		Scene scene = new Scene(border, 300, 275);
		primaryStage.setScene(scene);

	}

	private ObservableList<Integer> getMinuto() {
		ObservableList<Integer> minuto = FXCollections.observableArrayList();
		minuto.addAll(0, 15, 30, 45);
		return minuto;

	}

	public ObservableList<Integer> getHora() {
		ObservableList<Integer> hora = FXCollections.observableArrayList();
		hora.addAll(8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
		return hora;
	}
}
