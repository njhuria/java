package logicexample;

import java.lang.reflect.Array;

public class Multidimensionalarray {
	public static void main(String[] args){
		int k =0;
		int[][] arrays = new int[4][5];
		for(int i=0; i<4; i++){
			for(int j=0;j<5;j++){
				arrays[i][j]=k;
				k++;
				System.out.println(arrays[i][j]+" ");
				//System.out.println();
			}
		}
		 for(int i=0; i<4; i++){
			for(int j=0;j<5;j++){
				System.out.println(arrays[i][j]+" ");
				System.out.println();
			}
		}
	}

}
