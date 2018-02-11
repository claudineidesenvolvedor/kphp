package br.com.MVC.upload.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.MVC.upload.util.Jogos;

@ManagedBean(name="serviceJogo", eager = true)
@ApplicationScoped
public class ServiceJogo {
     
    private List<Jogos> jogos;
     
    @PostConstruct
    public void init() {
        jogos = new ArrayList<Jogos>();
        jogos.add(new Jogos(0, "Mega Sena", "mega sena"));
        jogos.add(new Jogos(1, "Loto Fácil", "loto fácil"));
        jogos.add(new Jogos(2, "Quina", "quina"));
        jogos.add(new Jogos(3, "Loto Mania", "loto mania"));
        jogos.add(new Jogos(4, "Black-Tie", "black-tie"));
        jogos.add(new Jogos(5, "Blitzer", "blitzer"));
        jogos.add(new Jogos(6, "Bluesky", "bluesky"));
        jogos.add(new Jogos(7, "Bootstrap", "bootstrap"));
    }
    public List<Jogos> getJogos() {
        return jogos;
    } 

}
