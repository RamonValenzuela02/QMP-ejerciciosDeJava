package org.example;

import static java.util.Objects.requireNonNull;

public class BuilderPrenda {
  private final TipoDePrenda tipoDePrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;
  private Formalidad forma;
  private final int[] rangoTemperaturas = new int[2];

  public BuilderPrenda(TipoDePrenda tipoDePrenda) {
    requireNonNull(tipoDePrenda);
    this.tipoDePrenda = tipoDePrenda;
  }

  public void especificarMaterial(Material material) {
    requireNonNull(material);
    this.material = material;
  }
  public void especificarColorPrimario(Color colorPrimario) {
    requireNonNull(colorPrimario);
    this.colorPrimario = colorPrimario;
  }
  public void especificarColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
  public void especificarTrama(Trama trama) {
    if (trama == null) {
      this.trama = Trama.LISA;
    }
  }
  public void especificarFormalidad(Formalidad forma) {
    this.forma = forma;
  }

  public void especificarTemperaturasLimites(int tempIni, int tempFin) {
    this.rangoTemperaturas[0] = tempIni;
    this.rangoTemperaturas[1] = tempFin;
  }

  public Prenda buildPrenda() {
    return new Prenda(tipoDePrenda, colorPrimario, colorSecundario, trama, material, forma, rangoTemperaturas);
  }
}
