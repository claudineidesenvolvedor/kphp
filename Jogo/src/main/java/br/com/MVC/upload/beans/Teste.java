package br.com.MVC.upload.beans;

public class Teste  implements Comparable<Teste>{

	private int bola1;

	@Override
	public int compareTo(Teste bola) {
		if (this.bola1 < bola.bola1 ) {
			return -1;
		}

		if (this.bola1 > bola.bola1 ) {
			return 1;
		}

		return 0;
	}

	public int getBola1() {
		return bola1;
	}

	public void setBola1(int bola1) {
		this.bola1 = bola1;
	}

}
