/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo4;
import java.util.Scanner;
/**
 *
 * @author asu8
 */
public class Algo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int x, y;
		System.out.print("Masukan angka1 : " );
		x = input.nextInt();

             	System.out.print("Masukan angka2 : " );
		y = input.nextInt();
        if(x > y){
            System.out.println(x + " Lebih besar daripada :" +y);
        }
        else{
            System.out.println(y + " Lebih besar daripada :" +x);
        }
    }
    
}
