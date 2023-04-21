package ar.edu.utn.frba.dds.model;

import ar.edu.utn.frba.dds.exceptions.PrendaIncompletaException;

import java.util.Objects;

public class Prenda {
  private TipoPrenda tipo;
  private TelaPrenda tela;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipo, TelaPrenda tela, Color colorPrimario) {
    if(Objects.isNull(tipo)){
      throw new PrendaIncompletaException("El campo \"tipo\" es requerido para Prenda");
    }
    if(Objects.isNull(tela)){
      throw new PrendaIncompletaException("El campo \"tela\" es requerido para Prenda");
    }
    if(Objects.isNull(colorPrimario)){
      throw new PrendaIncompletaException("El campo \"colorPrimario\" es requerido para Prenda");
    }

    this.tipo = tipo;
    this.tela = tela;
    this.colorPrimario = colorPrimario;
  }

  public Prenda(TipoPrenda tipo, TelaPrenda tela, Color colorPrimario, Color colorSecundario) {
    this(tipo, tela, colorPrimario);
    this.colorSecundario = colorSecundario;
  }
}
