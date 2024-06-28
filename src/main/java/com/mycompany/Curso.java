package com.mycompany;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  Docente docente;
  int tamanioIdeal;
  List<Grupo> grupos = new ArrayList<>();

  public void agregarGrupo(Grupo grupo){
    if(grupo.tamanio() == tamanioIdeal){
      grupo.cerrar();
      grupos.add(grupo);
    }
    else{
      grupos.add(grupo);
    }
  }

}
