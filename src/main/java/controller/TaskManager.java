package controller;

import app.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class TaskManager {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
