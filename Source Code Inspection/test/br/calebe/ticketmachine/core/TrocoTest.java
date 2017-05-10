/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class TrocoTest {

    @Test
    public TrocoTest() {
        
        int valor = 100;
        Troco troco = new troco(valor);
        assertEquals(100, 50);
    }

    @Test
    public void getIterator() {
        
        Troco troco = new Troco(15);
        Iterator<PapelMoeda> iterator;
        iterator = troco.getIterator();
        assertEquals(iterator, troco.getIterator());

    }
}