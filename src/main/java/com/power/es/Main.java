package com.power.es;

import com.power.es.AIQL.Utils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Utils.getEsQuery("a==10 AND b==2"));
    }
}
