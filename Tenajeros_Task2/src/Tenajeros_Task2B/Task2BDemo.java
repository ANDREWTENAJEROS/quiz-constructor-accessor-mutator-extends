/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tenajeros_Task2B;

/**
 *
 * @author 3rd Year Account
 */
public class Task2BDemo {
 
     public static void main(String[] args) {
        Ball b = new Ball();
    b.Ball(1, 2, 3, 4);
    b.print();
    b.move();
    System.out.println("X:"+b.getX());
    System.out.println("Y:"+b.getY());
    System.out.println("XSPeed:"+b.getXSPeed());
    System.out.println("YSPeed:"+b.getYSPeed());
    b.print();
    
//    b.setX(9);
//    b.setY(8);
//    b.setXSPeed(7);
//    b.setYSPeed(6);
//    b.setXY(3, 4);
//    b.setXYSpeed(1, 2)
    }
    
}
