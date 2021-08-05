import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {
  public static void main(String args[]) {
      Integer[] array = {20, 10 , 7 , 4 , 30, 80};      
      List<Integer> list = Arrays.asList(array);
      Collections.sort(list);
      for(Integer i : list) {
        System.out.println(i);
      }
   
  }
} 