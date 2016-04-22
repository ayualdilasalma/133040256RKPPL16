/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rkppl.kuis1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author SB604-09
 */
public class MahasiwaTest {
    
    private Mahasiswa m;
    
    @BeforeClass
    public void start() {
        System.out.println("Before -- ");
    }
    
    @Test
    public void testNrp() {
        Assert.assertNull("Boleh Kosong", m.getNrp());
    }
    
    @Test
    public void testNama() {
        Assert.assertNotNull("Tidak Boleh Kosong", m.setNama(""));
    }
}
