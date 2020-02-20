package dad.javafx.calendario;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;


import dad.javafx.componentes.MonthCalendar2;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class Controller implements Initializable{

    @FXML
    private GridPane root;
	@FXML
	    private Label yearLabel;

	    @FXML
	    private Button previousYearButton;

	    @FXML
	    private Button nextYearButton;

	    @FXML
	    private MonthCalendar2 c1;

	    @FXML
	    private MonthCalendar2 c2;

	    @FXML
	    private MonthCalendar2 c3;

	    @FXML
	    private MonthCalendar2 c4;

	    @FXML
	    private MonthCalendar2 c5;

	    @FXML
	    private MonthCalendar2 c6;

	    @FXML
	    private MonthCalendar2 c7;

	    @FXML
	    private MonthCalendar2 c8;

	    @FXML
	    private MonthCalendar2 c9;

	    @FXML
	    private MonthCalendar2 c10;

	    @FXML
	    private MonthCalendar2 c11;

	    @FXML
	    private MonthCalendar2 c12;

	    //model
	    private IntegerProperty yearProperty = new SimpleIntegerProperty();
	
	 public Controller() {
		 	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalendarioView.fxml"));
			loader.setController(this);
					//loader.setRoot(this); //establecer la rootView
			try {
				loader.load();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	    @Override
	public void initialize(URL location, ResourceBundle resources) {
		yearProperty.set(LocalDate.now().getYear());
		yearLabel.textProperty().bindBidirectional(yearProperty, new NumberStringConverter());
		c1.setMonthProperty(1);
		c1.yearPropertyProperty().bind(yearProperty);
		c2.setMonthProperty(2);
		c2.yearPropertyProperty().bind(yearProperty);
		c3.setMonthProperty(3);
		c3.yearPropertyProperty().bind(yearProperty);
		c4.setMonthProperty(4);
		c4.yearPropertyProperty().bind(yearProperty);
		c5.setMonthProperty(5);
		c5.yearPropertyProperty().bind(yearProperty);
		c6.setMonthProperty(6);
		c6.yearPropertyProperty().bind(yearProperty);
		c7.setMonthProperty(7);
		c7.yearPropertyProperty().bind(yearProperty);
		c8.setMonthProperty(8);
		c8.yearPropertyProperty().bind(yearProperty);
		c9.setMonthProperty(9);
		c9.yearPropertyProperty().bind(yearProperty);
		c10.setMonthProperty(10);
		c10.yearPropertyProperty().bind(yearProperty);
		c11.setMonthProperty(11);
		c11.yearPropertyProperty().bind(yearProperty);
		c12.setMonthProperty(12);
		c12.yearPropertyProperty().bind(yearProperty);
		
	}
	    @FXML
	    void nextYear(ActionEvent event) {
	    	yearProperty.set(yearProperty.get()+1);
	    }

	    @FXML
	    void previousYear(ActionEvent event) {
	    	yearProperty.set(yearProperty.get()-1);
	    }
		public final IntegerProperty yearPropertyProperty() {
			return this.yearProperty;
		}
		
		public final int getYearProperty() {
			return this.yearPropertyProperty().get();
		}
		
		public final void setYearProperty(final int yearProperty) {
			this.yearPropertyProperty().set(yearProperty);
		}
		
	
	public GridPane getRoot() {
		return root;
	}
}
