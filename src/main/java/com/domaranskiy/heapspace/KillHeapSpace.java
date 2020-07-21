package com.domaranskiy.heapspace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KillHeapSpace {
    public static void getKillHeapSpace() throws IOException {
        System.out.println("Ready");
        new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("Start");

        long[] garbageData = new long[1000000000];
        for (long i : garbageData) {
            i = 0;
            System.out.println(i);
        }
    }
}
