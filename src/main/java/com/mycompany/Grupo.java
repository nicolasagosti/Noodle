package com.mycompany;

import java.util.List;

public class Grupo {
  List<Estudiante> miembros;
  Estado estado;

  public int tamanio(){
    return miembros.size();
  }

  public void cerrar(){
    estado = new Cerrado();
  }

  public Grupo(List<Estudiante> miembros) {
    this.miembros = miembros;
  }

  public void solicitarCambioDeIntegrantes(Estudiante miembro,String accion){
    Solicitud solicitud = new Solicitud(accion,miembro,this);
    estado.solicitarCambioDeIntegrantes(solicitud);
  }

  public void removerMiembro(Estudiante miembro){
    miembros.remove(miembro);
  }
  public void agregarMiembro(Estudiante miembro){
    miembros.add(miembro);
  }

}
