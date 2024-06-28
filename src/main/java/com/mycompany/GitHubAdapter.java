package com.mycompany;

import java.util.List;
import java.util.stream.Collectors;

public class GitHubAdapter {
  GirHubSdk gitHubSdk;

  public void crearRepositoriosConAccesos(String nombre, List<Estudiante> estudiantes){
    List<String> usernames = estudiantes.stream()
        .map(estudiante -> estudiante.getUserName())
        .collect(Collectors.toList());
    gitHubSdk.crearRepositoriosConAccesos(nombre,usernames);
  }

  public void darAcceso(String nombreRepo, Estudiante estudiante){
    String username = estudiante.getUserName();
    gitHubSdk.darAcceso(nombreRepo,username);
  }

  public void quitarAcceso(String nombreRepo, Estudiante estudiante){
    String username = estudiante.getUserName();
    gitHubSdk.quitarAcceso(nombreRepo,username);
  }

}
