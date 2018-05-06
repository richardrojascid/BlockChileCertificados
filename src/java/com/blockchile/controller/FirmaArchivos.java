/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blockchile.controller;

import javax.xml.bind.DatatypeConverter;
import java.io.File;

public class FirmaArchivos {

    public static void main(String[] args) throws Exception {

        File file = new File("/tmp/test.pdf");

        System.out.println("MD5    : " + toHex(Hash.MD5.checksum(file)));
        System.out.println("SHA1   : " + toHex(Hash.SHA1.checksum(file)));
        System.out.println("SHA256!: " + toHex(Hash.SHA256.checksum(file)));
        System.out.println("SHA512 : " + toHex(Hash.SHA512.checksum(file)));
    }

    private static String toHex(byte[] bytes) {
        return DatatypeConverter.printHexBinary(bytes);
    }

}