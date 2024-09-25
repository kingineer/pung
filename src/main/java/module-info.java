module com.kingineer.github {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    requires org.junit.jupiter.api;
    requires org.junit.jupiter.engine;

    opens com.kingineer.github to javafx.fxml;

    exports com.kingineer.github;

    opens com.kingineer.github.controller to javafx.fxml;

    exports com.kingineer.github.controller;
}
