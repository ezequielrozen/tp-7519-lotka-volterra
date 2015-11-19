package model;

import view.MainWindow;

import controller.ModelController;
import java.util.Timer;

public class Main {

  public static void main(String[] args) {
    MainWindow window = new MainWindow();
    ModelController controller = new ModelController(new SimpleLotkaVolterra(1, 1, 0.8, 0.2, 0.5, 0.8),window);
    Timer t = new Timer();
    t.schedule(controller,0,1000);
  }
}
