package org.example;

import static java.util.Objects.requireNonNull;

public class TipoDePrenda {
  private Categoria categoria;

  public TipoDePrenda (Categoria categoria) {
    this.categoria = requireNonNull(categoria);
  }

  public static final TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
  public static final TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static final TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);

  public Categoria getCategoria() {
    return categoria;
  }
}
