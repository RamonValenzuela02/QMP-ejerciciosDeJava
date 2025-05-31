package org.example;

import static org.example.TipoDePrenda.REMERA;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuilderPrendaTest {

  @Test
  void testBuilderRemera() {
    //tendria que ver desp esta instanciacion que me hace ruido
    TipoDePrenda remera = new TipoDePrenda(Categoria.PARTE_SUPERIOR);

    BuilderPrenda builder = new BuilderPrenda(remera);

    builder.especificarMaterial(Material.LINO);
    builder.especificarColorPrimario(new Color(255, 255, 255));
    builder.especificarColorSecundario(null);
    builder.especificarTrama(null);

    Prenda prendaRemera = builder.buildPrenda();
    assertEquals(Categoria.PARTE_SUPERIOR, remera.getCategoria());
    assertEquals(Trama.LISA, prendaRemera.getTrama());
  }

}