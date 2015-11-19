package model;

public class SimpleLotkaVolterra {
  private double preysCount;
  private double predatorsCount;

  private double preysGrowth;
  private double predationSpeed;
  private double predatorsGrowth;
  private double predatorsDeath;

  public SimpleLotkaVolterra(int preysCount, int predatorsCount, double preysGrowth,
                             double predationSpeed, double predatorsGrowth, double predatorsDeath) {
    this.preysCount = preysCount;
    this.predatorsCount = predatorsCount;

    this.preysGrowth = preysGrowth;
    this.predationSpeed = predationSpeed;
    this.predatorsGrowth = predatorsGrowth;
    this.predatorsDeath = predatorsDeath;
  }

  public void update() {
    double h = 0.1;
    System.out.println("Update");
    // Euler's ODE method
    preysCount = preysCount + h * preysCount * (preysGrowth - predationSpeed * predatorsCount);
    predatorsCount = predatorsCount + h * predatorsCount * (predatorsGrowth * preysCount - predatorsDeath);
    System.out.println("Preys: "+preysCount+"--"+"Predators: "+predatorsCount);
  }

  public double getPreysCount() {
    return preysCount;
  }

  public double getPredatorsCount() {
    return predatorsCount;
  }
}