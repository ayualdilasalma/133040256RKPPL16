/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.rkppl.kuis1.Mahasiswa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.JUnit4;

/**
 *
 * @author SB604-09
 */
@RunWith(JUnit4.class)
public class MahasiswaTest {
    
    public MahasiswaTest() {
    }
    
    private Mahasiswa m;
    
    @Before
    public void start() {
        m = new Mahasiswa();
        m.setNama("hii");
        m.setNrp("");
        System.out.println("Before");
    }
    
    @Test
    public void testNrp() {
        assertNull("Boleh Kosong", m.getNrp());
    }
    
    @Test
    public void testNama() {
        assertNotNull("Tidak Boleh Kosong", m.getNama());
    }
    
    @Test
    public void test() {
        m.setNama("Aku");
        Mahasiswa s = new Mahasiswa();
        s.setNama("Gia");
        assertNotSame("Berbeda Objek", m.getNama(), s.getNama());
    }
    
    @After
    public void end() {
        System.out.println("After");
    }
    
    
}
