package view;
import controller.ThreadMatriz;
public class main {
public static void main (String[]args) {
int li, co;
	int [][]matriz=new int [3][5];
for(li = 0; li<3;li++) {
	for(co=0;co<5; co++) {
		matriz[li][co]=(int)(Math.random()*100)+1;
	}
	
	Thread ThreadMatriz = new ThreadMatriz(matriz[li],li);
	ThreadMatriz.start();

}
	
}
}
