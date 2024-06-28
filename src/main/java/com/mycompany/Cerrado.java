package com.mycompany;

import java.util.List;

public class Cerrado implements Estado {
  List<Solicitud> solicitudesPendientes;

  @Override
  public void solicitarCambioDeIntegrantes(Solicitud solicitud) {
    solicitudesPendientes.add(solicitud);
  }

  public void aceptarSolicitud(Solicitud solicitud){
    Grupo grupo = solicitud.getGrupo();
    Estudiante estudiante = solicitud.getEstudiante();
    if(solicitud.getAccion() == "agregar"){
      grupo.agregarMiembro(estudiante);
    }else{
      grupo.removerMiembro(estudiante);
    }
    solicitudesPendientes.remove(solicitud);
  }

  public void rechazarSolicitud(Solicitud solicitud){
    solicitudesPendientes.remove(solicitud);
  }

}
