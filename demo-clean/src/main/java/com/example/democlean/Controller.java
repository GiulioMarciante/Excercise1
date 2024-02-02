package com.example.democlean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class Controller {
  private List<Studente> studenti = new ArrayList<>();

  public Controller(){
      studenti.add(new Studente("Mario",1));
      studenti.add(new Studente("Luigi",2));
  }

  @GetMapping("/studenti")
    public List<Studente> getStudenti(){
      return studenti;
  }
  @GetMapping("/studenti/{id}")
    public Studente getStudentiById(@PathVariable int id){
      for(Studente studente : studenti){
          if(studente.getId()==id){
              return studente;
          }
      }
      return null;
  }
}
