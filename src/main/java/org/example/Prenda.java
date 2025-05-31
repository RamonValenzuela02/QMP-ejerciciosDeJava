package org.example;

import static java.util.Objects.requireNonNull;

public class Prenda {
  private TipoDePrenda tipoDePrenda;
  private Trama trama;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material material;
  private Formalidad forma;
  private int[] limitesTemperaturas = new int[2];

  //CODE SMELL LONG PARAMETER LIST
  public Prenda(TipoDePrenda tipoDePrenda,
                Color colorPrimario,
                Color colorSecundario,
                Trama trama,
                Material material,
                Formalidad forma,
                int[] limitesTemperaturas) {
    this.tipoDePrenda = requireNonNull(tipoDePrenda);
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.material = material;
    this.forma = forma;
    this.limitesTemperaturas = limitesTemperaturas;
  }

  public boolean esDeTipo(Categoria categoria) {
    return tipoDePrenda.getCategoria() == categoria;
  }
  public boolean esDeTemperatura(int temperatura) {
    return limitesTemperaturas[0] >= temperatura || limitesTemperaturas[1] <= temperatura;
  }

  public Trama getTrama() {
    return trama;
  }
}
