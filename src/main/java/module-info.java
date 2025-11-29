module demo {
    requires javafx.controls;
    requires javafx.fxml;

    opens plus.myj.solver.demo to javafx.fxml;
    exports plus.myj.solver.demo;
}