// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.*;
import java.util.Scanner;

public class ClassificandoMatrizes {
  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);
    int x;
    int N = input.nextInt();
    int[] nums = new int[N];
    for (x = 0; x < N; x++) {
      nums[x] = input.nextInt();
    }
    // TODO: mova todos os inteiros pares para o inicio do array, seguido por todos
    // os números ímpares
    
    int aux = 0;
    for (int i = 0; i < N; i++) {
      for (int j = (i + 1); j < N; j++) {

        // Se o elemento atual for ímpar
        // então troque por par
        if (nums[i] >= 0 && nums[j] >= 0 &&
            nums[i] % 2 != 0 &&
            nums[j] % 2 == 0) {

          // Realizar troca
          int tmp = nums[i];
          nums[i] = nums[j];
          nums[j] = tmp;

        }
      }
    }

    for (x = 0; x < N; x++) {
      System.out.println(nums[x]);
    }

  }
}
