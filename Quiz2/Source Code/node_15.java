/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;

/**
 *
 * @author EgaRam
 */
public class node_15 {
    pembeli_15 pembeli;
    pesanan_15 pesanan;
    node_15 prev, next;
    
    node_15(node_15 prev, pembeli_15 pembeli, pesanan_15 pesanan, node_15 next){
        this.prev=prev;
        this.pembeli=pembeli;
        this.pesanan=pesanan;
        this.next=next;
    }
}
