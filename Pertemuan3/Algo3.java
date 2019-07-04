/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo3;

import java.util.Scanner;

/**
 *
 * @author asu8
 */
public class Algo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int r;
	double phi, luas, keliling;	
		System.out.print("Masukan jari-jari : " );
		r = input.nextInt();
	
		phi = 3.14;
		keliling = 2 * phi *r;
		luas = phi * r *r;
		
			System.out.println("Keliling Lingkaran adalah " + keliling);
		
			System.out.println("Luas lingkaran adalah l "+ luas);   
    }
    
}
