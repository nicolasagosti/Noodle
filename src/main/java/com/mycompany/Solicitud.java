package com.mycompany;

public class Solicitud {
  Estudiante estudiante;
  String accion;
  Grupo grupo;

  public String getAccion(){
    return accion;
  }

  public Estudiante getEstudiante() {
    return estudiante;
  }

  public Grupo getGrupo() {
    return grupo;
  }

  public Solicitud(String accion, Estudiante estudiante, Grupo grupo) {
    this.accion = accion;
    this.estudiante = estudiante;
    this.grupo = grupo;
  }
}
