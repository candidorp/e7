package com.example;

import java.util.ArrayList;
/**
 * Clase que modela un carrito de compra. Añade productos y quita productos
 * ,asi como calcular el total almacenado, y el numero de productos
 * */
public class CarrinhoCompra {
    /**
     * numeroProductos es un atributo que representara la cantidad
     * */
    private int numeroProductos;
    private ArrayList<Produto> produtos;

    /**
     *Constructor primario, que no toma parametros, ya que sus atributos
     * tienen una naturaleza dinamica, iran tomando sentido a medida que
     * se haga uso de una instancia de la clase
     * */
    public CarrinhoCompra(){
        this.produtos = new ArrayList<Produto>();
        this.numeroProductos = 0;
    }
    /**
     * @param p "p" es un objeto Producto que se añade a la lista
     * */
    public void engadirProduto(Produto p){
        this.produtos.add(p);
        this.numeroProductos++;
    }
    /**
     * @param p "p" es un objeto Producto que se eliminara de la lista
     * */
    public void eliminarProduto(Produto p){
        this.produtos.remove(p);
        this.numeroProductos--;
    }
    /**
     * @return double Devuelve la suma de todos los precios de los productos almacenados
     * */
    public Double calcularTotal(){
        Double suma = 0.0;
        for(Produto p : this.produtos){
            suma += p.getPrezo();
        }
        return suma;
    }
    /**
     * @return int Devuelve la cantidad de productos almacenados
     * */
    public int getNumeroProdutos(){
        return this.numeroProductos;
    }
}
