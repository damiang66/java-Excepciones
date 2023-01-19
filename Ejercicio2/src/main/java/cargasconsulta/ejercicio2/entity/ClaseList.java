package cargasconsulta.ejercicio2.entity;

import java.util.ArrayList;
import java.util.List;


public class ClaseList {

   private List<String>algo;

    public ClaseList() {
    this.algo= new ArrayList();
    }

    public List<String> getAlgo() {
        return algo;
    }

    public void setAlgo(List<String> algo) {
        this.algo = algo;
    }
    

  

    @Override
    public String toString() {
        return "ClaseList{" + "algo=" + algo + '}';
    }

   
    

}
