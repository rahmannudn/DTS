/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo2;

import java.util.Scanner;
/**
 *
 * @author asu8
 */
public class Algo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
	int a, x, y;
		System.out.print("Masukan angka : " );
		a = input.nextInt();

		a = a % 2;

		if( a == 0 ){
			System.out.println("Angka yang di input adalah bilangan genap : " + a);
		}
	 else{
	 	System.out.println("Angka yang di input adalah bilangan ganjil "+ a);
		}
	}
    }
