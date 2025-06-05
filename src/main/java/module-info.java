module com.example.bomberman_sae {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bomberman_sae to javafx.fxml;
    exports com.example.bomberman_sae;
}