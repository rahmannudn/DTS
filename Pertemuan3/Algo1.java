/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo1;
import java.util.Scanner;
/**
 *
 * @author asu8
 */
public class Algo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
	int a, x, y;
		System.out.print("Masukan angka : " );
		a = input.nextInt();

	x = 1;
	y = x * x;

	while( y != a){
	x = x + 1;
	y = x * x;
	}
	 System.out.println("Akar : "+ x);
	}
    }
