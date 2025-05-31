package org.example;

public abstract class Sastre {
  private Prenda calzado;
  private Prenda parteDeAbajo;
  private Prenda parteDeArriba;

  public Uniforme fabricarUniforme() {
    calzado = generarCalzado();;
    parteDeAbajo = generarParteDeAbajo();
    parteDeArriba = generarParteDeArriba();
    return new Uniforme(calzado, parteDeAbajo, parteDeArriba);
  }
  abstract Prenda generarCalzado();
  abstract Prenda generarParteDeAbajo();
  abstract Prenda generarParteDeArriba();
}
