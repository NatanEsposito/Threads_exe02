package controller;

public class ThreadMatriz extends Thread {
private int [] lin;
private int num;


///public 
public ThreadMatriz(int[]lin,int num) {
	this.lin = lin;
	this.num = num;
}
@Override
public void run() {
	int soma;
	soma=0;
	for(int i:lin) {
		soma =soma +i;
	}
	System.out.println("a soma e: " + soma);
}
}
