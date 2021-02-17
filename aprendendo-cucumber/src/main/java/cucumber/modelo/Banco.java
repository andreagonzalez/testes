package cucumber.modelo;

import java.util.List;

//Esta classe representa uma entidade do mundo real “Banco”. Este tem como responsabilidade 
//fornecer métodos úteis que serão utilizados posteriormente nos testes de aceitação, 
//em particular para atender os requisitos do item 2 da visão geral.

public class Banco {

    private String nome;
    private List<Conta> listaDeContas;
    public Banco(String nome, List<Conta> listaDeContas) {
           this.nome = nome;
           this.listaDeContas= listaDeContas;
    }
    public String getNome() {
          return nome;
    }
    public void setNome(String nome) {
          this.nome = nome;
    }
    public List<Conta> getListaDeContas() {
          return listaDeContas;
    }
    public void setListaDeContas(List<Conta> listaDeContas) {
          this.listaDeContas = listaDeContas;
    }

}
