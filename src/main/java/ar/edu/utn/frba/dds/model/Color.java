package ar.edu.utn.frba.dds.model;

import ar.edu.utn.frba.dds.exceptions.ComponenteDeColorInvalido;

public class Color {
  private int red;
  private int green;
  private int blue;

  public Color(int red, int green, int blue) {
    if(!isValidComponent(red) || !isValidComponent(green) || !isValidComponent(blue)){
      throw new ComponenteDeColorInvalido();
    }
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  private boolean isValidComponent(int colorComponent) {
    return colorComponent >= 0 && colorComponent <= 255;
  }
}
