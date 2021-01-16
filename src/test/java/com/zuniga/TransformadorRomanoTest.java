/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zuniga;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigozuniga
 */
public class TransformadorRomanoTest {

    public TransformadorRomanoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void pruebasTDD() {
        assertEquals("", TransformadorRomano.calcular(0));
        assertEquals("I", TransformadorRomano.calcular(1));
        assertEquals("II", TransformadorRomano.calcular(2));
        assertEquals("III", TransformadorRomano.calcular(3));
        assertEquals("IV", TransformadorRomano.calcular(4));
        assertEquals("V", TransformadorRomano.calcular(5));
        assertEquals("VI", TransformadorRomano.calcular(6));
        assertEquals("VII", TransformadorRomano.calcular(7));
        assertEquals("VIII", TransformadorRomano.calcular(8));
        assertEquals("IX", TransformadorRomano.calcular(9));
        assertEquals("X", TransformadorRomano.calcular(10));
        assertEquals("XI", TransformadorRomano.calcular(11));
        assertEquals("XII", TransformadorRomano.calcular(12));
        assertEquals("XIII", TransformadorRomano.calcular(13));
        assertEquals("XIV", TransformadorRomano.calcular(14));
        assertEquals("XV", TransformadorRomano.calcular(15));
        assertEquals("XVI", TransformadorRomano.calcular(16));
        assertEquals("XVII", TransformadorRomano.calcular(17));
        assertEquals("XVIII", TransformadorRomano.calcular(18));
        assertEquals("XIX", TransformadorRomano.calcular(19));

        assertEquals("XX", TransformadorRomano.calcular(20));// --> XX
        assertEquals("XXI", TransformadorRomano.calcular(21));// --> XXI
        assertEquals("XXIII", TransformadorRomano.calcular(23));// --> XXIII
        assertEquals("XXIV", TransformadorRomano.calcular(24));// --> XXIV
        assertEquals("XXV", TransformadorRomano.calcular(25));// --> XXV
        assertEquals("XXVI", TransformadorRomano.calcular(26));// --> XXVI
        assertEquals("XXXIV", TransformadorRomano.calcular(34));// --> XXXIV
        assertEquals("XXXIX", TransformadorRomano.calcular(39));// --> XXXIX
        assertEquals("XL", TransformadorRomano.calcular(40));// --> XL
        assertEquals("XLVIII", TransformadorRomano.calcular(48));// --> XLVIII
        assertEquals("XLIX", TransformadorRomano.calcular(49));// --> XLIX
        assertEquals("L", TransformadorRomano.calcular(50));// --> L
        assertEquals("LI", TransformadorRomano.calcular(51));// --> LI
        assertEquals("LVIII", TransformadorRomano.calcular(58));// --> LVIII
        assertEquals("LIX", TransformadorRomano.calcular(59));// --> LIX
        assertEquals("LX", TransformadorRomano.calcular(60));// --> LX
        assertEquals("LXIII", TransformadorRomano.calcular(63));// --> LXIII
        assertEquals("LXVIII", TransformadorRomano.calcular(68));// --> LXVIII
        assertEquals("LXXXIX", TransformadorRomano.calcular(89));// --> LXXXIX
        assertEquals("XC", TransformadorRomano.calcular(90));// --> XC
        assertEquals("XCI", TransformadorRomano.calcular(91));// --> XCI
        assertEquals("XCV", TransformadorRomano.calcular(95));// --> XCV
        assertEquals("C", TransformadorRomano.calcular(100));// --> C
        assertEquals("CIII", TransformadorRomano.calcular(103));// --> CIII
        assertEquals("CXVII", TransformadorRomano.calcular(117));// --> CXVII
        assertEquals("CLXX", TransformadorRomano.calcular(170));// --> CLXX
        assertEquals("CCL", TransformadorRomano.calcular(250));// --> CCL
        assertEquals("CCCXCIX", TransformadorRomano.calcular(399));// --> CCCXCIX
        assertEquals("CD", TransformadorRomano.calcular(400));// --> CD
        
        assertEquals("CDX", TransformadorRomano.calcular(410));// --> CDX
        assertEquals("CDL", TransformadorRomano.calcular(450));// --> CDL
        assertEquals("CDLXXX", TransformadorRomano.calcular(480));// --> CDLXXX
        assertEquals("CDXCIX", TransformadorRomano.calcular(499));// --> CDXCIX
        assertEquals("D", TransformadorRomano.calcular(500));// --> D
        assertEquals("DX", TransformadorRomano.calcular(510));// --> DX
        assertEquals("DLXXX", TransformadorRomano.calcular(580));// --> DLXXX
        assertEquals("DXCIX", TransformadorRomano.calcular(599));// --> DXCIX
        assertEquals("DC", TransformadorRomano.calcular(600));// --> DC
        assertEquals("DCX", TransformadorRomano.calcular(610));// --> DCX
        assertEquals("DCL", TransformadorRomano.calcular(650));// --> DCL
        assertEquals("DCXCV", TransformadorRomano.calcular(695));// --> DCXCV
        assertEquals("DCC", TransformadorRomano.calcular(700));// --> DCC
        assertEquals("DCCC", TransformadorRomano.calcular(800));// --> DCCC
        assertEquals("DCCCXL", TransformadorRomano.calcular(840));// --> DCCCXL
        assertEquals("CM", TransformadorRomano.calcular(900));// --> CM
        assertEquals("CML", TransformadorRomano.calcular(950));// --> CML
        assertEquals("CMXCIX", TransformadorRomano.calcular(999));// --> CMXCIX
        assertEquals("M", TransformadorRomano.calcular(1000));// --> M

    }
}
