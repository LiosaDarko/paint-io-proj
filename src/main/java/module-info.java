module com.example.paintioproj {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.paintioproj to javafx.fxml;
    exports com.example.paintioproj;
}