package org.example;

public class SastreSanJuan extends Sastre {

  @Override
  Prenda generarCalzado() {
    TipoDePrenda zapatos = new TipoDePrenda(Categoria.CALZADO);

    BuilderPrenda builder = new BuilderPrenda(zapatos);
    builder.especificarColorPrimario(new Color(2,2,2));
    builder.especificarMaterial(Material.CUERO);
    builder.especificarTrama(Trama.CUADRADA);

    return builder.buildPrenda();
  }

  @Override
  Prenda generarParteDeAbajo() {
    TipoDePrenda pantalon = new TipoDePrenda(Categoria.PARTE_INFERIOR);

    BuilderPrenda builder = new BuilderPrenda(pantalon);
    builder.especificarColorPrimario(new Color(2,2,2));
    builder.especificarMaterial(Material.CUERO);
    builder.especificarTrama(Trama.RAYADA);

    return builder.buildPrenda();
  }

  @Override
  Prenda generarParteDeArriba() {
    TipoDePrenda chomba = new TipoDePrenda(Categoria.PARTE_SUPERIOR);

    BuilderPrenda builder = new BuilderPrenda(chomba);
    builder.especificarColorPrimario(new Color(3,3,3));
    builder.especificarMaterial(Material.LINO);
    builder.especificarTrama(null);
    return builder.buildPrenda();
  }

}
