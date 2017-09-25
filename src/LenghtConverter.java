import javax.swing.JOptionPane;
import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class LenghtConverter extends Application
{
    public void start(Stage primaryStage)
    {
        JOptionPane pane = new JOptionPane();

            //JOptionPane Input
        JOptionPane.showInputDialog("Enter your height in centimeter");

            //FX Input
        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setTitle("Length Converter");
        textInputDialog.setHeaderText("Centimeter to feet and inches converter");
        textInputDialog.setContentText("Enter your height in centimeter");
        textInputDialog.setX(585);
        textInputDialog.setY(0);

        Optional<String> result = textInputDialog.showAndWait();

        double heightincm = Double.parseDouble(result.get());
        double heightininches = heightincm*0.39;
        int heightinfeet = (int) (heightininches/12);
        int remainderheightininches = (int) (heightininches%12);


        Alert alert = new Alert(Alert.AlertType.INFORMATION);

            //FX output
        alert.setTitle("Length Converter");
        alert.setHeaderText("Converter from cm to foot and inch");
        alert.setContentText("The height is equal to "  + heightinfeet + " feet" + " and "  + remainderheightininches + " inches" );
        alert.setX(585);
        alert.setY(650);
        alert.showAndWait();

        pane.setLocation(1170,600);

        pane.showMessageDialog(null,"Your Height is " + heightinfeet + " feet," + "\n"
                                            + " and " + remainderheightininches + " inches.");

    }
}
