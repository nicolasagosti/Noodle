package com.mycompany;

import java.util.List;

public class Grupo {
  List<Estudiante> miembros;
  Estado estado;
  GirHubSdk  gitHub;
  MailSender mailSender;

  public int tamanio(){
    return miembros.size();
  }

  public void cerrar(){
    estado = new Cerrado();
    gitHub = new GitHub();
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
    String texto = "el miembro " + miembro + "fue removido";
    String subject = "Miembro removido";
    miembros.forEach(integrante -> enviarMail(integrante,subject,texto);
  }
  public void agregarMiembro(Estudiante miembro){
    miembros.add(miembro);
    String texto = "el miembro " + miembro + "fue agregado";
    String subject = "Miembro agregado";
    miembros.forEach(integrante -> enviarMail(integrante,subject,texto);
  }
  public void enviarMail(Estudiante estudiante, String subject, String texto){
    String direccionDeEmail = estudiante.getEmail();
    mailSender.send(direccionDeEmail,subject,texto);
  }

}
