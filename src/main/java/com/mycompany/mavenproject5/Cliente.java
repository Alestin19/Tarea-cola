/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import javax.swing.JOptionPane;

/**
 *
 * @author alestin
 */
public final class Cliente {
    int Max = 20, Frente = 0, Final = 0;
    int cola[] = new int[Max];
    String Dato;
    
            
    public static void main(String[] args) {
    }
    
    public Cliente(){
        int op = 0;
        while(op!=4){
            op = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Opciones disponibles para Clientes:
                                                               1 AGREGAR DATO
                                                               2 ELIMINAR DATO
                                                               3 MOSTRAR DATOS
                                                               4 TERMINAR"""));
            switch(op){
                case 1 ->  {push();}
                case 2 ->  {pop();}
                case 3 ->  {imprimirCola();}
                case 4 ->  {
                    JOptionPane.showMessageDialog(null,"Fin del programa, ten un buen día");
                }
                default -> {
                    JOptionPane.showMessageDialog(null,"No existe esa opción");
                }                    
            }
        }
    }
    
    public void push(){
        System.out.print("Frente PUSH: "+Frente);
        if(Final < Max){
            Dato = JOptionPane.showInputDialog("Código");
            cola[Final]=Integer.parseInt(Dato);
            Final++;
        }else{
            JOptionPane.showMessageDialog(null, "La cola está llena");
        }
    }
    
    public void pop(){
        System.out.print("Frente: "+Frente);
       
         if (Frente < Final) {
            JOptionPane.showMessageDialog(null, "Dato Eliminado: " + cola[Frente]);
            cola[Frente] = 0;
            Frente++;
        } else {
            JOptionPane.showMessageDialog(null, "La cola está vacía o el primer dato ya fue eliminado.");
        }
    }
    
    public void imprimirCola(){
        String Cadena = "";
        int i = 1;
        for(int datoCola: cola){
            Cadena += "Posición " + i + ": " + datoCola + "\n"; 
            i++;
        }
        JOptionPane.showMessageDialog(null, Cadena);
    }
}

