//Selassie Golloh

import java.util.Scanner;
public class Calc{
  public static void main(String[] parameters){
    if (parameters[0].equals("add")){
      double one = Double.parseDouble(parameters[1]);
      double two = Double.parseDouble(parameters[2]);
      System.out.println(one + two);
    }
  }
}