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
public class Principal {
    public static void main(String[] args){
        Ticket t1=new Ticket( "2021/07/20", "56001119");
        Ticket t2=new Ticket( "2021/07/16", "43661771");
        Ticket t3=new Ticket( "2021/07/19", "24558119");
        Ticket t4=new Ticket( "2021/07/18", "23039819");
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

    }
}
