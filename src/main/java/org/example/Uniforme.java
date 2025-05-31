package org.example;

import java.util.Arrays;
import java.util.List;

public class Uniforme {
  private Prenda calzado;
  private Prenda parteDeAbajo;
  private Prenda parteDeArriba;

  public Uniforme(Prenda calzado, Prenda parteDeAbajo, Prenda parteDeArriba) {
    //requireNonNull
    this.calzado = calzado;
    this.parteDeAbajo = parteDeAbajo;
    this.parteDeArriba = parteDeArriba;
  }

}
