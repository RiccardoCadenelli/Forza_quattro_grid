module com.example.forza_quattro_grid {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.forza_quattro_grid to javafx.fxml;
    exports com.example.forza_quattro_grid;
}