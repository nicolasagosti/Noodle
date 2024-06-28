package com.mycompany;

import java.util.List;

public interface GirHubSdk {
  public void crearRepositoriosConAccesos(String nombre, List<String> username);
  public void darAcceso(String nombreRepo, String Username);
  public void quitarAcceso(String nombreRepo, String Username);
}
