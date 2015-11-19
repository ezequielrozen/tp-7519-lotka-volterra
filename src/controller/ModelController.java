package controller;

import model.SimpleLotkaVolterra;
import view.MainWindow;

import java.util.TimerTask;

public class ModelController extends TimerTask {

  private SimpleLotkaVolterra model;
  private MainWindow window;

  public ModelController(SimpleLotkaVolterra model, MainWindow window) {
    this.model = model;
    this.window = window;
    this.window.setPreyCount(this.getPreyCount());
    this.window.setPredatorCount(this.getPredatorCount());
  }

  @Override
  public void run() {
    this.model.update();
    this.window.update(this.getPreyCount(), this.getPredatorCount());
  }

  SimpleLotkaVolterra getModel() {
    return this.model;
  }

  public int getPreyCount() {
    return (int) Math.floor(this.model.getPreysCount());
  }

  public int getPredatorCount() {
    return (int) Math.floor(this.model.getPredatorsCount());
  }
}
