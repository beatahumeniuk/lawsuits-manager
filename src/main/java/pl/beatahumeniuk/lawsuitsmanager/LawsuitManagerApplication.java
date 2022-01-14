package pl.beatahumeniuk.lawsuitsmanager;

import javafx.application.Application;
import pl.beatahumeniuk.lawsuitsmanager.application.LawsuitManagerFxApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LawsuitManagerApplication {

    public static void main(String[] args) {
        Application.launch(LawsuitManagerFxApplication.class, args);
    }

}
