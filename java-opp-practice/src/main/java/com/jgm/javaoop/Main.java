package com.jgm.javaoop;

import com.jgm.javaoop.logic.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}