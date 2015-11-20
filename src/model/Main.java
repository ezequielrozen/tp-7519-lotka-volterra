package model;

import view.MainWindow;

import controller.ModelController;
import view.WarningDialog;
import java.util.Timer;

public class Main {

  public static void main(String[] args) {
    if (args.length > 6) {
      new WarningDialog();
    } else {
      MainWindow window = new MainWindow();
      ModelController controller = new ModelController(new LotkaVolterra(1, 1, 1, 0.2, 0.5, 2),window);
      Timer t = new Timer();
      t.schedule(controller,0,1000);
    }
  }
}
