module com.automationteststore.githubintellijdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.automationteststore.githubintellijdemo to javafx.fxml;
    exports com.automationteststore.githubintellijdemo;
}