package view;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class MainWindow extends JFrame {

  JPanel counterPanel = new JPanel();
  JLabel prayLabel = new JLabel();
  JLabel predatorLabel = new JLabel();

  public MainWindow() {
    this.setTitle("Pray-Predator Model");
    this.setLayout(new BorderLayout());
    this.counterPanel.setLayout(new GridLayout(2,1));
    this.prayLabel.setForeground(Color.GREEN);
    this.predatorLabel.setForeground(Color.RED);
    this.counterPanel.add(this.prayLabel);
    this.counterPanel.add(this.predatorLabel);
    this.counterPanel.setBackground(Color.WHITE);
    this.counterPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
    this.add(counterPanel, BorderLayout.SOUTH);
    counterPanel.setPreferredSize(new Dimension(this.getWidth(), 70));
    this.setBounds(0,0,800,600);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().setBackground(Color.BLACK);
    this.setVisible(true);
  }

  public void update(int preyCount, int predatorCount) {
    this.prayLabel.setText("Presas: "+preyCount);
    this.predatorLabel.setText("Depredadores: "+predatorCount);
  }

  public void setPreyCount(int count) {
    this.prayLabel.setText("Presas: "+count);
  }

  public void setPredatorCount(int count) {
    this.predatorLabel.setText("Depredadores: "+count);
  }
}
