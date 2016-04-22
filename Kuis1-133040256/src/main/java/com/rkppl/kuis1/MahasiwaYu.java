/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rkppl.kuis1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author SB604-09
 */
public class MahasiwaTest {
    
    private Mahasiswa m;
    
    @Before
    public void start() {
        m = new Mahasiswa();
        System.out.println("Before -- ");
    }
    
    @Test
    public void testNrp() {
        Assert.assertNull("Boleh Kosong", m.getNrp());
    }
    
    @Test
    public void testNama() {
        Assert.assertNotNull("Tidak Boleh Kosong", m.getNama());
    }
    
    @Test
    public void testFloat() {
        
        m.setNama("Aku");
        Mahasiswa s = new Mahasiswa();
        s.setNama("Gia");
        Assert.assertNotSame("Berbeda Objek", m.getNama(), s.getNama());
    }
    
    @After
    public void end() {
        System.out.println("End Test");
    }
}
