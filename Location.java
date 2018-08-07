/**********************************************

Workshop # 1

Course:<JAC444> - Semester Summer

Last Name:<Zleik>

First Name:<Raeda>

ID:<113091151>

Section:<SCD>

This assignment represents my own work in accordance with Seneca Academic Policy.

Signature R.Z

Date:<07-06-2018>

**********************************************/
import javax.swing.*;
import java.util.Scanner;
public class Location {
    private static int rowPos;
    private static int colPos;
    private static double maxVal;
    
    public Location() {
    	this.rowPos = 0;
    	this.colPos = 0;
    	this.maxVal = 0.0;
    }
    public static Location locateLargest(double[][] a) {
    	Location l = new Location();
        for(int row=0;row<a.length;row++){
        for(int col=0;col<a[row].length;col++){
            
             if(a[row][col]>=maxVal) {
                   l.maxVal=a[row][col];
                   l.rowPos = row;
                    l.colPos = col;
             }
        }

        }
    	
    	return l;
    }

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows and columns for the array: ");
		Scanner input = new Scanner(System.in);
		int nOfrow = input.nextInt();
		int nOfcol = input.nextInt();
		
		input.nextLine();
        double [][] arr=new double[nOfrow][nOfcol];
        System.out.println("Enter the array: ");
        for(int row=0;row<nOfrow;row++){
        for(int col=0;col<nOfcol;col++){
             arr[row][col]= input.nextDouble();

            }

        }
        Location loc = locateLargest(arr);
        System.out.println("the location to the largest element is " +loc.maxVal+ "at (" +(loc.rowPos +1)+ "," +(loc.colPos+1)+")");

        System.exit(0);
	    }

	

}
