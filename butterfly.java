import java.util.*;

public class butterfly{
  public static void main(String[] args) {
    int n=5;

    //UpperHalfhalf

    for (int i= 1; i<=n; i++){
      //FirstHalf
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      //Spaces
      int spaces = 2*(n-i);
      for(int j= 1; j<= spaces; j++){
        System.out.print(" ");
      }
      //SecondPart
      for(int j =1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    //LowerHalf
    for (int i= n; i>=1; i--){
      //FirstHalf
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      //Spaces
      int spaces = 2*(n-i);
      for(int j= 1; j<= spaces; j++){
        System.out.print(" ");
      }
      //SecondPart
      for(int j =1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }

}