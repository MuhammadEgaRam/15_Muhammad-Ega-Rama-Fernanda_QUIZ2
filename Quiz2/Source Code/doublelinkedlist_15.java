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
public class doublelinkedlist_15 {
    node_15 head, tail;
    int size;

    public doublelinkedlist_15(){
        head = null;
        tail = null;
        size = 0;    
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(pembeli_15 pem, pesanan_15 pes) {
        if (isEmpty()) {
            head = new node_15(null, pem, pes, head);
        } else {
            node_15 newNode = new node_15(null, pem, pes, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void print(){
        if (!isEmpty()) {
            node_15 tmp = head;
            while(tmp != null){
                
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Antrian masih Kosong !");
        }
    }
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus node!");
        } else if (size == 1){
            head = null;
            System.out.println(head.pembeli.namaPembeli+" Telah Memesan Menu");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
