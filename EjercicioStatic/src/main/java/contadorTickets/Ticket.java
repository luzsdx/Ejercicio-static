/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorTickets;
/**
 *
 * @author luzsd
 */
public class Ticket {
    private static int contador=10;
    private int numero;
    private String fechaCompra;
    private String DNIPersona;

    public Ticket( String fechaCompra, String DNIPersona) {
        contador++;
        this.numero=contador;
        this.fechaCompra = fechaCompra;
        this.DNIPersona = DNIPersona;
    }

    
    
    @Override
    public String toString(){
        return "Ticket{"+"numero="+numero
                +", fechaCompra="+fechaCompra
                +",DNIPersona="+DNIPersona+'}';
    }
}
