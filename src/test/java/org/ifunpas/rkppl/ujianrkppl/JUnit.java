/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.ujianrkppl;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertSame;
import junit.framework.TestCase;

/**
 *
 * @author 604-13
 */
public class JUnit extends TestCase {
    Mahasiswa mhs = new Mahasiswa();
    
    
    public JUnit(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
    
    public void mulai(){
        System.out.println("mulai testing");
    }
    
    
    public test1(){
        assertEquals(4, mhs.setIPK(4));
        assertFalse("harusnya salah", mhs.setAktivasi(false));
    }
    
    public test2(){
        assertNull(setName(null));
        assertNotNull("harusnya tidak null", mhs.setNama("puput"));
    }
    
    public test3(){
        assertSame("harusnya sama", 10, mhs.setNrp("113040155"));
        assertNotSame("harusnya tidak sama", "puputs", mhs.setNama("puputs"));
        
    }
}
