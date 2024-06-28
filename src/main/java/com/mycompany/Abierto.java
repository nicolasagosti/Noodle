package com.mycompany;

public class Abierto implements Estado{
  @Override
  public void solicitarCambioDeIntegrantes(Solicitud solicitud) {
    Grupo grupo = solicitud.getGrupo();
    Estudiante integrante = solicitud.getEstudiante();
    if (solicitud.getAccion() == "Agregar"){
      grupo.agregarMiembro(integrante);
    }else{
      grupo.removerMiembro(integrante);
    }
  }
}
