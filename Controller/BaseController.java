package Controller;

import java.util.ArrayList;

public abstract class BaseController<D> {
    private ArrayList<D> dados;

    public BaseController(){
        this.dados = new ArrayList<D>();
    }

    //CREATE
    public void adicionar(D obj){
        if (!existe(obj)) {
            this.dados.add(obj);    
        }
    }

    //READ
    public ArrayList<D> listar(){
        return this.dados;
    }

    //UPDATE
    public void atualizar(D obj){
        if(existe(obj)){
            this.dados.remove(obj);
            this.dados.add(obj);
        }
    }

    //DELETE
    public void excluir(D obj){
        this.dados.remove(obj);
    }

    public boolean existe(D obj){
        return this.dados.contains(obj);
    }
}
