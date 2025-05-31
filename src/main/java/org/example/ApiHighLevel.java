package org.example;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class ApiHighLevel {
  private AccuWeatherApi lowLevelApi = new AccuWeatherApi();

  //depues mockearia el lowLevelApi en los test,
  // para que su comportamiento no interfiera en el comportamiento de nuestras interfaces de nuestro Dominio
  public int getTemperatureF(String ciudad, LocalDate fecha) {
    List<Map<String, Object>> respuesta = lowLevelApi.getWeather(ciudad);

    Map<String, Object> datos = respuesta.get(0);
    Map<String, Object> temp = (Map<String, Object>) datos.get("Temperature");
    return (int) temp.get("Value");
  }
}
