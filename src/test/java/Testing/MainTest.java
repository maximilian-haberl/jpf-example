package Testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
   //Testing method example
   @Test
   public void test0(){
      int expected = 493;
      int result = Testing.Main.example(-1, -1);
      assertEquals(expected, result, "Ein Test für die Methode example ist fehlgeschlagen.");
   }

   //Testing method example
   @Test
   public void test1(){
      int expected = -5;
      int result = Testing.Main.example(-1, 0);
      assertEquals(expected, result, "Ein Test für die Methode example ist fehlgeschlagen.");
   }

   //Testing method example
   @Test
   public void test2(){
      int expected = -53;
      int result = Testing.Main.example(0, -1);
      assertEquals(expected, result, "Ein Test für die Methode example ist fehlgeschlagen.");
   }

   //Testing method example
   @Test
   public void test3(){
      int expected = 0;
      int result = Testing.Main.example(0, 0);
      assertEquals(expected, result, "Ein Test für die Methode example ist fehlgeschlagen.");
   }

   //Testing method testMethod
   @Test
   public void test4(){
      assertThrows(
            java.io.IOException.class,
            () -> {new Testing.Main().testMethod(-1);},
            "Ein Test für die Methode testMethod ist fehlgeschlagen."
      );
   }

   //Testing method testMethod
   @Test
   public void test5() throws java.io.IOException{
      new Testing.Main().testMethod(0);
   }

   //Testing method array
   @Test
   public void test6(){
      int[] input = {-1, 1, 1, 1, 1};
      int[] expected = {42, 1, 1, 1, 1};
      int[] result = new Testing.Main().array(input, 0);
      assertArrayEquals(expected, result, "Ein Test für die Methode array ist fehlgeschlagen.");
   }

   //Testing method array
   @Test
   public void test7(){
      int[] input = {0, 1, 1, 1, 1};
      int[] expected = {0, 1, 1, 1, 1};
      int[] result = new Testing.Main().array(input, 0);
      assertArrayEquals(expected, result, "Ein Test für die Methode array ist fehlgeschlagen.");
   }

   //Testing method array
   @Test
   public void test8(){
      int[] input = {0, -1, 1, 1, 1};
      int[] expected = {0, 42, 1, 1, 1};
      int[] result = new Testing.Main().array(input, 1);
      assertArrayEquals(expected, result, "Ein Test für die Methode array ist fehlgeschlagen.");
   }

   //Testing method array
   @Test
   public void test9(){
      int[] input = {0, 0, 1, 1, 1};
      int[] expected = {0, 0, 1, 1, 1};
      int[] result = new Testing.Main().array(input, 1);
      assertArrayEquals(expected, result, "Ein Test für die Methode array ist fehlgeschlagen.");
   }

   //Testing method array
   @Test
   public void test10(){
      int[] input = {0, 0, -1, 1, 1};
      int[] expected = {0, 0, 42, 1, 1};
      int[] result = new Testing.Main().array(input, 2);
      assertArrayEquals(expected, result, "Ein Test für die Methode array ist fehlgeschlagen.");
   }

   //Testing method array
   @Test
   public void test11(){
      int[] input = {0, 0, 0, 1, 1};
      int[] expected = {0, 0, 0, 1, 1};
      int[] result = new Testing.Main().array(input, 2);
      assertArrayEquals(expected, result, "Ein Test für die Methode array ist fehlgeschlagen.");
   }

   //Testing method array
   @Test
   public void test12(){
      int[] input = {0, 0, 0, -1, 1};
      int[] expected = {0, 0, 0, 42, 1};
      int[] result = new Testing.Main().array(input, 3);
      assertArrayEquals(expected, result, "Ein Test für die Methode array ist fehlgeschlagen.");
   }

   //Testing method array
   @Test
   public void test13(){
      int[] input = {0, 0, 0, 0, 1};
      int[] expected = {0, 0, 0, 0, 1};
      int[] result = new Testing.Main().array(input, 3);
      assertArrayEquals(expected, result, "Ein Test für die Methode array ist fehlgeschlagen.");
   }

   //Testing method array
   @Test
   public void test14(){
      int[] input = {0, 0, 0, 0, -1};
      int[] expected = {0, 0, 0, 0, 42};
      int[] result = new Testing.Main().array(input, 4);
      assertArrayEquals(expected, result, "Ein Test für die Methode array ist fehlgeschlagen.");
   }

   //Testing method array
   @Test
   public void test15(){
      int[] input = {0, 0, 0, 0, 0};
      int[] expected = {0, 0, 0, 0, 0};
      int[] result = new Testing.Main().array(input, 4);
      assertArrayEquals(expected, result, "Ein Test für die Methode array ist fehlgeschlagen.");
   }

   //Testing method array
   @Test
   public void test16(){
      int[] input = {0, 0, 0, 0, 0};
      assertThrows(
            java.lang.ArrayIndexOutOfBoundsException.class,
            () -> {new Testing.Main().array(input, -1);},
            "Ein Test für die Methode array ist fehlgeschlagen."
      );
   }

   //Testing method array
   @Test
   public void test17(){
      int[] input = {0, 0, 0, 0, 0};
      assertThrows(
            java.lang.ArrayIndexOutOfBoundsException.class,
            () -> {new Testing.Main().array(input, 5);},
            "Ein Test für die Methode array ist fehlgeschlagen."
      );
   }

}