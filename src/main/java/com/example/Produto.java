package com.example;
/**
 * Esta clase modelara un Producto,
 * con un nombre, precio y sus clases correspondientes
 * */
public class Produto {
    /**
     * Nombre del producto
     * */
    private String nome;
    /**
     * Precio del producto
     * */
    private Double prezo;
    /**
     * Constructor que toma 2 parametros : nombre y precio y genera un producto
     * @param nome Nombre a asignar
     * @param prezo Precio a asignar
     * */
    public Produto(String nome, Double prezo) {
        if (nome == null) {
            throw new IllegalArgumentException("El nombre no puede ser null");
        }
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (prezo < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        this.nome = nome;
        this.prezo = prezo;
    }
    /**
     * Metodo que devuelve el nombre del producto
     * @return string
     * */
    String getNome(){
        return this.nome;
    }
    /**
     * Metodo que devuelve el precio del Produto
     * @return double
     * */
    Double getPrezo(){
        return this.prezo;
    }
    /**
     * Metodo que asigna una precio a un Produto
     * @param prezo precio a asignar
     * */
    void setPrezo(Double prezo){
        if(prezo < 0){
            throw new IllegalArgumentException("No se permite asignar precios negativos");
        }
        this.prezo = prezo;
    }
    /**
     * Metodo que asigna un nombre a un Produto
     * @param nome nombre a asignar
     * */
    void setNome(String nome){
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Inserte un valor");
        }
        this.nome = nome;
    }
}
