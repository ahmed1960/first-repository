import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import traing1.Node;
import traing1.Stack;

public class Calculator extends Application {

	String equation;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {

		// TODO Auto-generated method stub
		BorderPane bPane = new BorderPane();
		bPane.setStyle("-fx-background-color: linear-gradient(#4169E1  , #4169E1);");
		TextArea text = new TextArea();
		text.setMaxSize(300, 60);
		Button num1 = new Button("1");
		num1.setStyle(
				" -fx-background-color: linear-gradient(#000080  , #000080);-fx-background-radius: 30;-fx-text-fill: white;-fx-font-weight: bold;");
		num1.setMinSize(90, 60);
		Button num2 = new Button("2");
		num2.setMinSize(90, 60);
		num2.setStyle(
				" -fx-background-color: linear-gradient(#000080  , #000080);-fx-background-radius: 30;-fx-text-fill: white;-fx-font-weight: bold;");
		Button num3 = new Button("3");
		num3.setMinSize(90, 60);
		num3.setStyle(
				" -fx-background-color: linear-gradient(#000080  , #000080);-fx-background-radius: 30;-fx-text-fill: white;-fx-font-weight: bold;");
		Button num4 = new Button("4");
		num4.setMinSize(90, 60);
		num4.setStyle(
				" -fx-background-color: linear-gradient(#000080  , #000080);-fx-background-radius: 30;-fx-text-fill: white;-fx-font-weight: bold;");
		Button num5 = new Button("5");
		num5.setMinSize(90, 60);
		num5.setStyle(
				" -fx-background-color: linear-gradient(#000080  , #000080);-fx-background-radius: 30;-fx-text-fill: white;-fx-font-weight: bold;");
		Button num6 = new Button("6");
		num6.setMinSize(90, 60);
		num6.setStyle(
				" -fx-background-color: linear-gradient(#000080  , #000080);-fx-background-radius: 30;-fx-text-fill: white;-fx-font-weight: bold;");
		Button num7 = new Button("7");
		num7.setMinSize(90, 60);
		num7.setStyle(
				" -fx-background-color: linear-gradient(#000080  , #000080);-fx-background-radius: 30;-fx-text-fill: white;-fx-font-weight: bold;");
		Button num8 = new Button("8");
		num8.setMinSize(90, 60);
		num8.setStyle(
				" -fx-background-color: linear-gradient(#000080  , #000080);-fx-background-radius: 30;-fx-text-fill: white;-fx-font-weight: bold;");
		Button num9 = new Button("9");
		num9.setMinSize(90, 60);
		num9.setStyle(
				" -fx-background-color: linear-gradient(#000080  , #000080);-fx-background-radius: 30;-fx-text-fill: white;-fx-font-weight: bold;");
		Button num0 = new Button("0");
		num0.setMinSize(90, 60);
		num0.setStyle(
				" -fx-background-color: linear-gradient(#000080  , #000080);-fx-background-radius: 30;-fx-text-fill: white;-fx-font-weight: bold;");
		Button div = new Button("/");
		div.setMinSize(90, 60);
		div.setStyle(
				" -fx-background-color: linear-gradient(#1E90FF  , #1E90FF);-fx-background-radius: 30;-fx-text-fill: black;-fx-font-weight: bold;");

		Button by = new Button("*");
		by.setStyle(
				" -fx-background-color: linear-gradient(#1E90FF  , #1E90FF);-fx-background-radius: 30;-fx-text-fill: black;-fx-font-weight: bold;");

		by.setMinSize(90, 60);
		Button sub = new Button("-");
		sub.setMinSize(90, 60);
		sub.setStyle(
				" -fx-background-color: linear-gradient(#1E90FF  , #1E90FF);-fx-background-radius: 30;-fx-text-fill: black;-fx-font-weight: bold;");

		// Button negative=new Button("(-)");
		Button plus = new Button("+");
		plus.setMinSize(90, 60);
		plus.setStyle(
				" -fx-background-color: linear-gradient(#1E90FF  , #1E90FF);-fx-background-radius: 30;-fx-text-fill: black;-fx-font-weight: bold;");

		Button equal = new Button("=");
		equal.setMinSize(90, 60);
		equal.setStyle(
				" -fx-background-color: linear-gradient(#1E90FF  , #1E90FF);-fx-background-radius: 30;-fx-text-fill: black;-fx-font-weight: bold;");

		HBox firstHBox = new HBox(10);
		HBox secondBox = new HBox(10);
		HBox thirdHBox = new HBox(10);
		HBox fourthHBox = new HBox(10);
		HBox fifthHBox = new HBox(10);

		firstHBox.getChildren().addAll(by, div, plus);
		secondBox.getChildren().addAll(num7, num8, num9);
		thirdHBox.getChildren().addAll(num4, num5, num6);
		fourthHBox.getChildren().addAll(num1, num2, num3);
		fifthHBox.getChildren().addAll(sub, num0, equal);
		VBox genericVBox = new VBox(10);
		genericVBox.getChildren().addAll(firstHBox, secondBox, thirdHBox, fourthHBox, fifthHBox);
		bPane.setCenter(genericVBox);
		bPane.setTop(text);
		bPane.setPadding(new Insets(10, 10, 10, 10));// bp.setPadding(new
														// Insets(10, 20, 10,
														// 20));
		num1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("1");
			}
		});
		num2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("2");
			}
		});
		num3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("3");
			}
		});
		num4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("4");
			}
		});
		num5.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("5");
			}
		});
		num6.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("6");
			}
		});
		num7.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("7");
			}
		});
		num8.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("8");
			}
		});
		num9.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("9");
			}
		});
		num0.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("0");
			}
		});
		by.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("*");
			}
		});
		div.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("/");
			}
		});
		plus.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("+");
			}
		});
		sub.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				text.appendText("-");
			}
		});
		equal.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				String equation = text.getText();
				text.clear();
				text.appendText(opreation(equation));

			}

		});

		Scene scene = new Scene(bPane, 310, 430);
		stage.setTitle("yNOW");
		stage.setScene(scene);
		stage.show();
	}

	private String opreation(String equation) {

		// TODO Auto-generated method stub
		/*
		 * int firstnum; int secondnum; int indexOf; String subEquation; Stack
		 * stack=new Stack(); String []number=equation.split("/ + * -"); String
		 * digit=number[0]; for(int i=1;i<number.length;i++){
		 * digit="#"+number[i]; }
		 * 
		 * for(int i=0;i<equation.length();i++){ if(equation.charAt(i)=='+'){
		 * if(stack.isEmpty()){ stack.push("+"); } else
		 * if(stack.getTop().equals("*")){ stack.pop();
		 * indexOf=equation.lastIndexOf("#");
		 * subEquation=equation.substring(indexOf-1);
		 * firstnum=Integer.parseInt(equation.substring(0, 1));
		 * secondnum=Integer.parseInt(equation.substring(2));
		 * 
		 * } }
		 * 
		 * }
		 */
		int result = 0;
		int firstNum = 0;
		int secondNum = 0;
		char opreater = 0;

		for (int i = 0; i < equation.length(); i++) {
			if (!Character.isDigit(equation.charAt(i))) {
				opreater = equation.charAt(i);
			}
		}
		firstNum = Integer.parseInt(equation.substring(0, equation.indexOf(opreater)));
		secondNum = Integer.parseInt(equation.substring(equation.indexOf(opreater) + 1));
		if (opreater == '+') {// get svn
			result = firstNum + secondNum;
			return result + "";
		} else if (opreater == '-') {
			result = firstNum - secondNum;
			return result + "";
		} else if (opreater == '*') {
			return firstNum * secondNum + "";
		} else if (opreater == '/') {
			if (secondNum != 0) {
				return firstNum / secondNum + "";
			} else {
				return "The process is not allowed";
			}
		} else {
			return equation;
		}

	}
}