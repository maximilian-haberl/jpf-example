import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCases{
   //Testing method doSomething
   @Test
   public void test0(){
      int expected = 5;
      int result = new IntTest().doSomething(1);
      assertEquals(expected, result);
   }

   //Testing method example
   @Test
   public void test1(){
      int expected = 493;
      int result = IntTest.example(-1, -1);
      assertEquals(expected, result);
   }

   //Testing method example
   @Test
   public void test2(){
      int expected = -5;
      int result = IntTest.example(-1, 0);
      assertEquals(expected, result);
   }

   //Testing method example
   @Test
   public void test3(){
      int expected = -53;
      int result = IntTest.example(0, -1);
      assertEquals(expected, result);
   }

   //Testing method example
   @Test
   public void test4(){
      int expected = 0;
      int result = IntTest.example(0, 0);
      assertEquals(expected, result);
   }

   //Testing method testBoolean
   @Test
   public void test5(){
      boolean expected = true;
      boolean result = IntTest.testBoolean(17);
      assertEquals(expected, result);
   }

   //Testing method testBoolean
   @Test
   public void test6(){
      boolean expected = false;
      boolean result = IntTest.testBoolean(0);
      assertEquals(expected, result);
   }

}