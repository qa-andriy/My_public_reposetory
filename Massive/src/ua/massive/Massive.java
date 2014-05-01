package ua.massive;

public class Massive {

	public static void main(String[] args) {
		  int n = 2; // 2 rydky masyvu
		  int m = 10; 
		 
		  System.out.println("Random massive:");
		  int [][] res = randomMas(n, m);

		  System.out.println();
		  System.out.println();
		  
		  System.out.println("Massive after changing:");
		  changing(res, n, m);
		 }
		 
		 // RandomMas
		 public static int[][] randomMas(int n, int m) {
		     int [][] mas = new int [n][m];
		 for(int i = 0; i < n; i++)  {
		  // for (int i: mas)
		  for(int j = 0; j < m; j++) {
		   mas[i][j] = (int) (Math.random() * (m + 10));
		                    System.out.print(mas[i][j] + " " ); 
		  }
		  System.out.println();
		  }
		 return mas;
		    } 
		 
		 // Changing
		  public static int[][] changing(int[][] mas, int n, int m) {
		   for(int i = 0; i < n; i++) {
		   for(int j = 0; j < m; j++) {
		          if(mas[i][j] == 10) {
		          mas[i][j] = 0;
		          }
		               System.out.print(mas[i][j] + " " ); 
		          }
		   System.out.println();
		  } 
		   return mas;
		     }
		}
