package br.com.MVC.upload.beans;

import java.util.Date;

public class MegaSema implements Comparable<MegaSema> {

	private int numeroSorteio;

	private Date DataSorteio;

	private int bola1;
	private int bola2;
	private int bola3;
	private int bola4;
	private int bola5;
	private int bola6;

	public int getNumeroSorteio() {
		return numeroSorteio;
	}

	public void setNumeroSorteio(int numeroSorteio) {
		this.numeroSorteio = numeroSorteio;
	}

	public Date getDataSorteio() {
		return DataSorteio;
	}

	public void setDataSorteio(Date date) {
		DataSorteio = date;
	}

	public int getBola1() {
		return bola1;
	}

	public void setBola1(int bola1) {
		this.bola1 = bola1;
	}

	public int getBola2() {
		return bola2;
	}

	public void setBola2(int bola2) {
		this.bola2 = bola2;
	}

	public int getBola3() {
		return bola3;
	}

	public void setBola3(int bola3) {
		this.bola3 = bola3;
	}

	public int getBola4() {
		return bola4;
	}

	public void setBola4(int bola4) {
		this.bola4 = bola4;
	}

	public int getBola5() {
		return bola5;
	}

	public void setBola5(int bola5) {
		this.bola5 = bola5;
	}

	public int getBola6() {
		return bola6;
	}

	public void setBola6(int bola6) {
		this.bola6 = bola6;
	}

	@Override
	public int compareTo(MegaSema sema) {
		if (this.bola1 < sema.bola1 ) {
			return -1;
		}

		if (this.bola1 > sema.bola1 ) {
			return 1;
		}

		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DataSorteio == null) ? 0 : DataSorteio.hashCode());
		result = prime * result + bola1;
		result = prime * result + bola2;
		result = prime * result + bola3;
		result = prime * result + bola4;
		result = prime * result + bola5;
		result = prime * result + bola6;
		result = prime * result + numeroSorteio;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MegaSema other = (MegaSema) obj;
		if (DataSorteio == null) {
			if (other.DataSorteio != null)
				return false;
		} else if (!DataSorteio.equals(other.DataSorteio))
			return false;
		if (bola1 != other.bola1)
			return false;
		if (bola2 != other.bola2)
			return false;
		if (bola3 != other.bola3)
			return false;
		if (bola4 != other.bola4)
			return false;
		if (bola5 != other.bola5)
			return false;
		if (bola6 != other.bola6)
			return false;
		if (numeroSorteio != other.numeroSorteio)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MegaSema [numeroSorteio=" + numeroSorteio + ", DataSorteio=" + DataSorteio + ", bola1=" + bola1
				+ ", bola2=" + bola2 + ", bola3=" + bola3 + ", bola4=" + bola4 + ", bola5=" + bola5 + ", bola6=" + bola6
				+ "]";
	}

}
