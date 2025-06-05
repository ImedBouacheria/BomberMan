module com.example.bomberman_sae {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.bomberman_sae to javafx.fxml;
}