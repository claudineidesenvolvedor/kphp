package br.com.MVC.upload.beans;

import java.util.Calendar;
import java.util.Date;

public class LotoFacil {

	private int numeroSorteio;

	private Date DataSorteio;

	private int bola1;
	private int bola2;
	private int bola3;
	private int bola4;
	private int bola5;
	private int bola6;
	private int bola7;
	private int bola8;
	private int bola9;
	private int bola10;
	private int bola11;
	private int bola12;
	private int bola13;
	private int bola14;
	private int bola15;
	public int getNumeroSorteio() {
		return numeroSorteio;
	}
	public void setNumeroSorteio(int numeroSorteio) {
		this.numeroSorteio = numeroSorteio;
	}
	public Date getDataSorteio() {
		return DataSorteio;
	}
	public void setDataSorteio(Date dataSorteio) {
		DataSorteio = dataSorteio;
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
	public int getBola7() {
		return bola7;
	}
	public void setBola7(int bola7) {
		this.bola7 = bola7;
	}
	public int getBola8() {
		return bola8;
	}
	public void setBola8(int bola8) {
		this.bola8 = bola8;
	}
	public int getBola9() {
		return bola9;
	}
	public void setBola9(int bola9) {
		this.bola9 = bola9;
	}
	public int getBola10() {
		return bola10;
	}
	public void setBola10(int bola10) {
		this.bola10 = bola10;
	}
	public int getBola11() {
		return bola11;
	}
	public void setBola11(int bola11) {
		this.bola11 = bola11;
	}
	public int getBola12() {
		return bola12;
	}
	public void setBola12(int bola12) {
		this.bola12 = bola12;
	}
	public int getBola13() {
		return bola13;
	}
	public void setBola13(int bola13) {
		this.bola13 = bola13;
	}
	public int getBola14() {
		return bola14;
	}
	public void setBola14(int bola14) {
		this.bola14 = bola14;
	}
	public int getBola15() {
		return bola15;
	}
	public void setBola15(int bola15) {
		this.bola15 = bola15;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DataSorteio == null) ? 0 : DataSorteio.hashCode());
		result = prime * result + bola1;
		result = prime * result + bola10;
		result = prime * result + bola11;
		result = prime * result + bola12;
		result = prime * result + bola13;
		result = prime * result + bola14;
		result = prime * result + bola15;
		result = prime * result + bola2;
		result = prime * result + bola3;
		result = prime * result + bola4;
		result = prime * result + bola5;
		result = prime * result + bola6;
		result = prime * result + bola7;
		result = prime * result + bola8;
		result = prime * result + bola9;
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
		LotoFacil other = (LotoFacil) obj;
		if (DataSorteio == null) {
			if (other.DataSorteio != null)
				return false;
		} else if (!DataSorteio.equals(other.DataSorteio))
			return false;
		if (bola1 != other.bola1)
			return false;
		if (bola10 != other.bola10)
			return false;
		if (bola11 != other.bola11)
			return false;
		if (bola12 != other.bola12)
			return false;
		if (bola13 != other.bola13)
			return false;
		if (bola14 != other.bola14)
			return false;
		if (bola15 != other.bola15)
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
		if (bola7 != other.bola7)
			return false;
		if (bola8 != other.bola8)
			return false;
		if (bola9 != other.bola9)
			return false;
		if (numeroSorteio != other.numeroSorteio)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "LotoFacil [numeroSorteio=" + numeroSorteio + ", DataSorteio=" + DataSorteio + ", bola1=" + bola1
				+ ", bola2=" + bola2 + ", bola3=" + bola3 + ", bola4=" + bola4 + ", bola5=" + bola5 + ", bola6=" + bola6
				+ ", bola7=" + bola7 + ", bola8=" + bola8 + ", bola9=" + bola9 + ", bola10=" + bola10 + ", bola11="
				+ bola11 + ", bola12=" + bola12 + ", bola13=" + bola13 + ", bola14=" + bola14 + ", bola15=" + bola15
				+ "]";
	}
}
