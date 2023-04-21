package ar.edu.utn.frba.dds.model;

import ar.edu.utn.frba.dds.exceptions.ComponenteDeColorInvalido;
import ar.edu.utn.frba.dds.exceptions.PrendaIncompletaException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueMePongoTest {
  private CategoriaPrenda calzado;
  private TipoPrenda zapato;
  private Color blanco;
  private Color negro;

  @BeforeEach
  void init() {
    calzado = new CategoriaPrenda("calzado");
    zapato = new TipoPrenda(calzado);
    negro = new Color(0,0,0);
    blanco = new Color(255,255,255);
  }

  @Test
  void ObtenerCategoriaDeTipoPrenda() {
    assertEquals(calzado, zapato.getCategoria());
  }

  @Test
  void ObtenerNombreDeCategoria() {
    assertEquals("calzado", calzado.getNombre());
  }

  @Test
  void CrearColorConValorNegativo() {
    assertThrows(ComponenteDeColorInvalido.class, () -> new Color(-1,2,2));
  }

  @Test
  void CrearColorConValorSuperiorA255() {
    assertThrows(ComponenteDeColorInvalido.class, () -> new Color(2,300,2));
  }

  @Test
  void CrearPrendaSinTipo() {
    assertThrows(PrendaIncompletaException.class, () -> new Prenda(null,TelaPrenda.TELA_EJEMPLO, blanco));
  }

  @Test
  void CrearPrendaSinTela() {
    assertThrows(PrendaIncompletaException.class, () -> new Prenda(zapato,null, blanco));
  }

  @Test
  void CrearPrendaSinColorPrimario() {
    assertThrows(PrendaIncompletaException.class, () -> new Prenda(zapato,TelaPrenda.TELA_TRES, null));
  }

  @Test
  void CrearPrendaConColorSecundarioSinValorRequerido() {
    assertThrows(PrendaIncompletaException.class, () -> new Prenda(null, TelaPrenda.TELA_TRES, blanco));
  }

  @Test
  void CrearPrendaConColorSecundario() {
    new Prenda(zapato,TelaPrenda.TELA_TRES, blanco, negro);
  }

}