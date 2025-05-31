package org.example;

import static java.util.stream.Collectors.toList;

import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Guardarropas {
  private Set<Prenda> prendasSuperiores;
  private Set<Prenda> prendasInferiores;
  private Set<Prenda> prendasCalzado;
  private Set<Prenda> prendasAccesorios;
  private static final Random random = new Random();

  public void agregarPrenda(Prenda prenda) {
    if(prenda.esDeTipo(Categoria.PARTE_SUPERIOR)){
      prendasSuperiores.add(prenda);
    }
    else if(prenda.esDeTipo(Categoria.PARTE_INFERIOR)){
      prendasInferiores.add(prenda);
    }
    else if(prenda.esDeTipo(Categoria.CALZADO)) {
      prendasCalzado.add(prenda);
    }
    else if(prenda.esDeTipo(Categoria.ACCESORIOS)){
      prendasAccesorios.add(prenda);
    }
  }

  private static Prenda atRandom(Set<Prenda> prendas) {
    if (prendas == null || prendas.isEmpty()) {
      throw new IllegalArgumentException("La lista no puede ser nula ni vacía");
    }
    List<Prenda> lista = new ArrayList<>(prendas);
    return lista.get(random.nextInt(prendas.size()));
  }

  public Atuendo generarSugerenciaPara(int temperatura) {
    Prenda prendaInf = randomDePrendasCumplidorasConTemperatura(prendasInferiores, temperatura);
    Prenda prendaSup = randomDePrendasCumplidorasConTemperatura(prendasSuperiores, temperatura);
    Prenda prenCalzado = randomDePrendasCumplidorasConTemperatura(prendasCalzado, temperatura);

    return new Atuendo (prendaInf, prendaSup, prenCalzado);
  }

  private Prenda randomDePrendasCumplidorasConTemperatura(Set<Prenda> prendas, int temperatura) {
      Set<Prenda> prendasPosibles = prendasCumplidorasConTemperatura(prendas, temperatura);

      return atRandom(prendasPosibles);
  }

  private Set<Prenda> prendasCumplidorasConTemperatura(Set<Prenda> prendas, int temperatura) {
    return prendas.stream().
        filter(pren -> pren.esDeTemperatura(temperatura)).
        collect(Collectors.toSet());
  }

  public AtuendoConAccesorio generarSugerenciaConAceesorioPara(int temperatura) {
    Prenda prendaInf = randomDePrendasCumplidorasConTemperatura(prendasInferiores, temperatura);
    Prenda prendaSup = randomDePrendasCumplidorasConTemperatura(prendasSuperiores, temperatura);
    Prenda prenCalzado = randomDePrendasCumplidorasConTemperatura(prendasCalzado, temperatura);
    Prenda prenAccesorio = randomDePrendasCumplidorasConTemperatura(prendasAccesorios, temperatura);

    return new AtuendoConAccesorio (prendaInf, prendaSup, prenCalzado, prenAccesorio);
  }


  public List<Atuendo> generarSugerenciasPara(int temperatura) {

      return Sets.cartesianProduct(
          prendasCumplidorasConTemperatura(prendasSuperiores, temperatura),
          prendasCumplidorasConTemperatura(prendasInferiores, temperatura),
          prendasCumplidorasConTemperatura(prendasCalzado, temperatura))
          .stream()
          .map((list) -> new Atuendo(list.get(0), list.get(1), list.get(2)))
          .collect(toList());

  }

 }


