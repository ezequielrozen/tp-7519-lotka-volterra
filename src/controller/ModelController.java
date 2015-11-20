package controller;

import model.LotkaVolterra;
import view.MainWindow;

import java.util.TimerTask;

public class ModelController extends TimerTask {

  private LotkaVolterra model;
  private MainWindow window;

  public ModelController(LotkaVolterra model, MainWindow window) {
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

  LotkaVolterra getModel() {
    return this.model;
  }

  public int getPreyCount() {
    return (int) Math.floor(this.model.getPreysCount());
  }

  public int getPredatorCount() {
    return (int) Math.floor(this.model.getPredatorsCount());
  }
}
