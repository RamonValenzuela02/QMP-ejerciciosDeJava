package org.example;

public class AtuendoConAccesorio extends Atuendo {
  private Prenda accesorio;

  public AtuendoConAccesorio(Prenda prendaInf, Prenda prendaSup, Prenda calzado, Prenda accesorio) {
    super(prendaInf,prendaSup,calzado);
    this.accesorio = accesorio;
  }
}
