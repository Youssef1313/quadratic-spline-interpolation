package VisualizerGUI;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class VisualizerGUIController {

    @FXML
    private AnchorPane parentPane;

    @FXML
    private Pane drawPane;

    @FXML
    private AnchorPane infoPane;

    @FXML
    private ScrollPane pointsScrollPane;

    @FXML
    private ScrollPane equationsScrollPane;

    @FXML
    private AnchorPane controlPane;

    @FXML
    private CheckBox enableCheckBox;

    @FXML
    private Label sliderLabel;

    @FXML
    private ScrollBar speedSlider;

    @FXML
    private Button drawNextB;

    @FXML
    private Button clearPointsB;

    @FXML
    private Button drawAllB;

    @FXML
    private Button clearCurvesB;

    public AnchorPane getParentPane() {
        return parentPane;
    }

    public Pane getDrawPane() {
        return drawPane;
    }

    public AnchorPane getInfoPane() {
        return infoPane;
    }

    public ScrollPane getPointsScrollPane() {
        return pointsScrollPane;
    }

    public ScrollPane getEquationsScrollPane() {
        return equationsScrollPane;
    }

    public AnchorPane getControlPane() {
        return controlPane;
    }

    public CheckBox getEnableCheckBox() {
        return enableCheckBox;
    }

    public Label getSliderLabel() {
        return sliderLabel;
    }

    public ScrollBar getSpeedSlider() {
        return speedSlider;
    }

    public Button getDrawNextB() {
        return drawNextB;
    }

    public Button getClearPointsB() {
        return clearPointsB;
    }

    public Button getDrawAllB() {
        return drawAllB;
    }

    public Button getClearCurvesB() {
        return clearCurvesB;
    }

}
