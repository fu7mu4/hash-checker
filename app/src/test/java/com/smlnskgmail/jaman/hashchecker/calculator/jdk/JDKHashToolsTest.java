package com.smlnskgmail.jaman.hashchecker.calculator.jdk;

import com.smlnskgmail.jaman.hashchecker.logic.hashcalculator.jdk.JDKHashTools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JDKHashToolsTest {

    @Test
    public void stringFromBytesArray() {
        // Text: Test (one word)
        byte[] input = new byte[]{
                12,
                -68,
                102,
                17,
                -11,
                84,
                11,
                -48,
                -128,
                -102,
                56,
                -115,
                -55,
                90,
                97,
                91
        };

        assertEquals(
                "0cbc6611f5540bd0809a388dc95a615b",
                JDKHashTools.getStringFromByteArray(input)
        );
    }

    @Test
    public void stringFromLong() {
        // Text: Test (one word)
        assertEquals(
                "784dd132",
                JDKHashTools.getStringFromLong(2018365746)
        );
    }

}