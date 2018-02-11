package br.com.MVC.upload.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import br.com.MVC.upload.service.ServiceJogo;
import br.com.MVC.upload.util.Jogos;
 
 
@ManagedBean
public class SelectOneView {
     
    private String option;   
    private Jogos Jogos; 
    private List<Jogos> listaJogos;
     
    @ManagedProperty("#{serviceJogo}")
    private ServiceJogo service;
     
    @PostConstruct
    public void init() {
        listaJogos = service.getJogos();
    }
 
    public String getOption() {
        return option;
    }
 
    public void setOption(String option) {
        this.option = option;
    }
 
    public Jogos getJogos() {
        return Jogos;
    }
 
    public void setJogos(Jogos Jogos) {
        this.Jogos = Jogos;
    }
 
    public List<Jogos> getlistaJogos() {
        return listaJogos;
    }
 
    public void setService(ServiceJogo service) {
        this.service = service;
    }
}
