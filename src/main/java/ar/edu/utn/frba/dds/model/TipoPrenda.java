package ar.edu.utn.frba.dds.model;

public class TipoPrenda {
  private CategoriaPrenda categoria;

  public TipoPrenda(CategoriaPrenda categoria) {
    this.categoria = categoria;
  }

  public CategoriaPrenda getCategoria() {
    return categoria;
  }
}