package jp.trans_it.hanoi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jp.trans_it.hanoi.view.MainFrame;

/**
 * メインクラス
 */
public class HanoiApplication extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(MainFrame.class.getResource("MainFrame.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("ハノイの塔");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
