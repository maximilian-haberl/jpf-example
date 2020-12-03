/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.io.IOException;

/**
 *
 * @author mxl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        new Main().testMethod(0);
        example(0, 0);
        int[] val = {0,0,0,0,0};
        new Main().array(val, 0);
    }

    public void testMethod(int a) throws IOException {
        if (a < 0) {
            throw new IOException();
        }
    }

    public static int example(int a, int b) {
        if (a < 0) {
            if (b < 0) {
                return a * -500 + 7 * b;
            } else {
                return 5 * a - 16 * b;
            }
        } else {
            if (b < 0) {
                return (a + b) * 53;
            } else {
                return 128 * b - a;
            }
        }
    }

    public int[] array(int[] input, int val) {
        if (input[val] < 0) {
            input[val] = 42;
        }
        return input;
    }

}
