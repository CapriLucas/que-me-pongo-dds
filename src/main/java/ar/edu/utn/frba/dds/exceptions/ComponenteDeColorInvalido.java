package ar.edu.utn.frba.dds.exceptions;

public class ComponenteDeColorInvalido extends RuntimeException {
  public ComponenteDeColorInvalido()  {
    super("Los componentes del color deben estar entre 0 y 255");
  }
}