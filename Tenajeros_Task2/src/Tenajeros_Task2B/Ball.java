/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tenajeros_Task2B;

/**
 *
 * @author 3rd Year Account
 */
public class Ball {
    double x = 0.0;
    double y = 0.0;
    double xSpeed = 0.0;
    double ySpeed = 0.0;
    
    void Ball(double x, double y, double xSpeed, double yspeed){
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
    }
    double getX(){
        return this.x;
    }
    private void setX(double x){
        this.x = x;
    }
    double getY(){
        return this.y;
    }
    private void setY(double y){
        this.y = y;
    }
    double getXSPeed(){
        return this.xSpeed;
    }
    private void setXSPeed(double xSpeed){
        this.xSpeed = xSpeed;
    }
    double getYSPeed(){
        return this.ySpeed;
    }
    private void setYSPeed(double ySpeed){
        this.ySpeed = ySpeed;
    }
    private void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    private void setXYSpeed(double xSpeed, double ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    void move(){
        this.x+=this.xSpeed;
        this.y+=this.ySpeed;
    }
    void print(){
        System.out.println("Ball @ ("+x+","+y+") with speed ("+xSpeed+","+ySpeed+")");
    }
    
    
}
