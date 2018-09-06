/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author CRex64
 */
public class ThrowThrows1 {
    static void error() throws ClassNotFoundException{
        System.out.println("ClassNotFoundException");
        throw new ClassNotFoundException("Handling");
    }
    
}
