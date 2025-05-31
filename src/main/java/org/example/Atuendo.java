package org.example;

import static java.util.Objects.requireNonNull;

import java.util.Arrays;
import java.util.List;

public class Atuendo {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda prendaCalzado;

  public Atuendo(Prenda prendaInferior, Prenda prendaSuperior, Prenda prendaCalzado) {
    this.prendaInferior = prendaInferior;
    this.prendaSuperior = prendaSuperior;
    this.prendaCalzado = prendaCalzado;
  }
}
