package br.com.MVC.cargamassiva.xls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import br.com.MVC.upload.beans.LotoFacil;
import br.com.MVC.upload.beans.Teste;

//import org.apache.poi.xssf.usermodel.XSSFSheet;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	private String path;

	List<LotoFacil> listaLotoFacil;
	List<LotoFacil> listaLotoFacil2;
	List<LotoFacil> listaNumeroNaoSorte;
	List<LotoFacil> listaNumeroSaiuSorte;

	/*
	 * public static void main(String[] args) {
	 * 
	 * // Carregando arquivo especifico
	 * 
	 * Excel excel = new Excel("C:\\temp\\Lucas.xlsx");
	 * 
	 * // Apenas mostrando os valores
	 * 
	 * // excel.processAll();
	 * 
	 * }
	 */

	public Excel() {

		// Caminho do arquivo

	}

	private void ini() {
		// TODO Auto-generated method stub

	}

	public Excel(String path) {

		// Caminho do arquivo

		setPath(path);

	}

	private void carregarListaRow(Row linha) {
		int count = 0;
		LotoFacil lotoFacil = new LotoFacil();

		List<Teste> listaTeste = new ArrayList<Teste>();

		// FAzendo loop em todas as colunas
		for (Cell cell : linha) {
			if (cell == null) {
				continue;
			}
			if (cell.getColumnIndex() == 0) {
				lotoFacil.setNumeroSorteio((int) cell.getNumericCellValue());
				count = 0;
			}

			else if (cell.getColumnIndex() == 1) {
				lotoFacil.setDataSorteio(cell.getDateCellValue());
			}

			else {
				if (count <= 15) {
					Teste teste = new Teste();
					teste.setBola1((int) cell.getNumericCellValue());
					listaTeste.add(teste);
					count += 1;
				}

			}

		}
		Collections.sort(listaTeste);

		listaTeste.get(0);
		lotoFacil.setNumeroSorteio((int) linha.getCell(0).getNumericCellValue());
		lotoFacil.setDataSorteio(linha.getCell(1).getDateCellValue());
		lotoFacil.setBola1(listaTeste.get(0).getBola1());
		lotoFacil.setBola2(listaTeste.get(1).getBola1());
		lotoFacil.setBola3(listaTeste.get(2).getBola1());
		lotoFacil.setBola4(listaTeste.get(3).getBola1());
		lotoFacil.setBola5(listaTeste.get(4).getBola1());
		lotoFacil.setBola6(listaTeste.get(5).getBola1());
		lotoFacil.setBola7(listaTeste.get(6).getBola1());
		lotoFacil.setBola8(listaTeste.get(7).getBola1());
		lotoFacil.setBola9(listaTeste.get(8).getBola1());
		lotoFacil.setBola10(listaTeste.get(9).getBola1());
		lotoFacil.setBola11(listaTeste.get(10).getBola1());
		lotoFacil.setBola12(listaTeste.get(11).getBola1());
		lotoFacil.setBola13(listaTeste.get(12).getBola1());
		lotoFacil.setBola14(listaTeste.get(13).getBola1());
		lotoFacil.setBola15(listaTeste.get(14).getBola1());

		listaLotoFacil.add(lotoFacil);
		listaTeste.clear();
		// return listaLotoFacil;

	}

	/**
	 * Retorna uma Abas de um Excel , atraves de uma lista e nome dessa aba
	 */
	@SuppressWarnings("deprecation")
	private Sheet criaAbas(Workbook wb, List<LotoFacil> lista, String nome) {
		int count = 0;
		Sheet s2 = wb.createSheet(nome);
		try {
			// Criando uma referencia para Linha
			Row r = null;

			// Referencia para Celula
			Cell c1 = null;
			Cell c2 = null;
			Cell c3 = null;
			Cell c4 = null;
			Cell c5 = null;
			Cell c6 = null;
			Cell c7 = null;
			Cell c8 = null;
			Cell c9 = null;
			Cell c10 = null;
			Cell c11 = null;
			Cell c12 = null;
			Cell c13 = null;
			Cell c14 = null;
			Cell c15 = null;
			Cell c16 = null;
			Cell c17 = null;

			r = s2.createRow(count);

			c1 = r.createCell(0);
			c2 = r.createCell(1);
			c3 = r.createCell(2);
			c4 = r.createCell(3);
			c5 = r.createCell(4);
			c6 = r.createCell(5);
			c7 = r.createCell(6);
			c8 = r.createCell(7);
			c9 = r.createCell(8);
			c10 = r.createCell(9);
			c11 = r.createCell(10);
			c12 = r.createCell(11);
			c13 = r.createCell(12);
			c14 = r.createCell(13);
			c15 = r.createCell(14);
			c16 = r.createCell(15);
			c17 = r.createCell(16);

			c1.setCellValue("Concurso");
			c2.setCellValue("Data Sorteio");
			c3.setCellValue("Bola1");
			c4.setCellValue("Bola2");
			c5.setCellValue("Bola3");
			c6.setCellValue("Bola4");
			c7.setCellValue("Bola5");
			c8.setCellValue("Bola6");
			c9.setCellValue("Bola7");
			c10.setCellValue("Bola8");
			c11.setCellValue("Bola9");
			c12.setCellValue("Bola10");
			c13.setCellValue("Bola11");
			c14.setCellValue("Bola12");
			c15.setCellValue("Bola13");
			c16.setCellValue("Bola14");
			c17.setCellValue("Bola15");

			for (LotoFacil lotoFacil : lista) {
				count += 1;
				r = s2.createRow(count);
				c1 = r.createCell(0);
				c2 = r.createCell(1);
				c3 = r.createCell(2);
				c4 = r.createCell(3);
				c5 = r.createCell(4);
				c6 = r.createCell(5);
				c7 = r.createCell(6);
				c8 = r.createCell(7);
				c9 = r.createCell(8);
				c10 = r.createCell(9);
				c11 = r.createCell(10);
				c12 = r.createCell(11);
				c13 = r.createCell(12);
				c14 = r.createCell(13);
				c15 = r.createCell(14);
				c16 = r.createCell(15);
				c17 = r.createCell(16);

				Date d = lotoFacil.getDataSorteio();
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				// System.out.println(df.format(d));

				c1.setCellValue(lotoFacil.getNumeroSorteio());

				c2.setCellValue(df.format(d));
				c3.setCellValue(lotoFacil.getBola1());
				c4.setCellValue(lotoFacil.getBola2());
				c5.setCellValue(lotoFacil.getBola3());
				c6.setCellValue(lotoFacil.getBola4());
				c7.setCellValue(lotoFacil.getBola5());
				c8.setCellValue(lotoFacil.getBola6());
				c9.setCellValue(lotoFacil.getBola7());
				c10.setCellValue(lotoFacil.getBola8());
				c11.setCellValue(lotoFacil.getBola9());
				c12.setCellValue(lotoFacil.getBola10());
				c13.setCellValue(lotoFacil.getBola11());
				c14.setCellValue(lotoFacil.getBola12());
				c15.setCellValue(lotoFacil.getBola13());
				c16.setCellValue(lotoFacil.getBola14());
				c17.setCellValue(lotoFacil.getBola15());

			}
			System.out.println("Segunda Abas: " + s2.getSheetName() + "qts linda Abas: " + r.getRowNum()); // wb.write(out);

		} catch (Exception e) { // Mostrar Erro
			System.out.println(e.getMessage());
		}

		return s2;
	}

	private Sheet criaAbas4(Workbook wb, List<LotoFacil> lista, String nome) {

		Sheet s2 = wb.createSheet(nome);

		listaNumeroNaoSorte = new ArrayList<LotoFacil>();

		List<Teste> listaTeste = new ArrayList<Teste>();
		int concurso = 0;
		try {
			// Criando uma referencia para Linha
			Row r = null;

			// Referencia para Celula
			Cell cell_Concurso = null;
			Cell cell_Data = null;
			Cell cell_Bola = null;

			int countLinha = 0;
			int countcoluna = 2;

			String nomeCell = null;

			r = s2.createRow(countLinha);
			s2.autoSizeColumn(0);
			cell_Concurso = r.createCell(0);
			cell_Data = r.createCell(1);
			cell_Concurso.setCellValue("N_C");
			cell_Data.setCellValue("Data");
			for (int i = 1; i < 25; i++) {
				nomeCell = "Bola" + i;
				s2.autoSizeColumn(i);
				cell_Bola = r.createCell(countcoluna);
				cell_Bola.setCellValue(nomeCell);
				countcoluna += 1;
			}

			for (LotoFacil facil : lista) {
				countLinha += 1;
				concurso = facil.getNumeroSorteio();
				r = s2.createRow(countLinha);
				cell_Concurso = r.createCell(0);
				cell_Data = r.createCell(1);
				cell_Concurso.setCellValue(concurso);
				Date d = facil.getDataSorteio();
				countcoluna = 2;

				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				cell_Data.setCellValue(df.format(d));
				// nomeCell = "Bola" + count;
				for (int i = 1; i < 26; i++) {
					s2.autoSizeColumn(i);
					cell_Bola = r.createCell(countcoluna);
					if (facil.getBola1() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola2() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola3() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola4() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola5() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola6() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola7() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola8() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola9() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola10() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola11() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola12() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola13() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola14() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else if (facil.getBola15() == i) {
						cell_Bola.setCellValue(i);
						continue;
					} else {
						cell_Bola.setCellValue(0);
						Teste teste = new Teste();
						teste.setBola1((int) i);
						listaTeste.add(teste);
					}

					countcoluna += 1;
				}
				facil.setNumeroSorteio(concurso);
				facil.setDataSorteio(facil.getDataSorteio());
				facil.setBola1(listaTeste.get(0).getBola1());
				facil.setBola2(listaTeste.get(1).getBola1());
				facil.setBola3(listaTeste.get(2).getBola1());
				facil.setBola4(listaTeste.get(3).getBola1());
				facil.setBola5(listaTeste.get(4).getBola1());
				facil.setBola6(listaTeste.get(5).getBola1());
				facil.setBola7(listaTeste.get(6).getBola1());
				facil.setBola8(listaTeste.get(7).getBola1());
				facil.setBola9(listaTeste.get(8).getBola1());
				facil.setBola10(listaTeste.get(9).getBola1());
				listaNumeroNaoSorte.add(facil);
				listaTeste.clear();

			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("error do Tamanho da Lista no concurso! " + concurso + e.getMessage());
		} catch (Exception e) { // Mostrar Erro
			System.out.println(e.getMessage());
		}

		return s2;
	}

	/**
	 * retorna uma lista, atraves de um tamanho
	 */
	private List<LotoFacil> processaLista(List<LotoFacil> lista, int tamanho) {
		List<LotoFacil> processaLista = new ArrayList<LotoFacil>();
		for (int i = tamanho; i < lista.size(); i++) {
			processaLista.add(lista.get(i));
		}

		return processaLista;
	}

	/**
	 * retorna uma lista, atraves de um tamanho
	 */
	private List<LotoFacil> processaLista1(List<LotoFacil> lista, int tamanhoFinal) {
		List<LotoFacil> processaLista = new ArrayList<LotoFacil>();
		for (int i = 0; i < tamanhoFinal; i++) {
			processaLista.add(lista.get(i));
		}

		return processaLista;
	}

	/*
	 * Retorna uma lista pela mês que passa, não importa o ano
	 */
	@SuppressWarnings("deprecation")
	private List<LotoFacil> processaListaData(List<LotoFacil> lista, int mes, int diaInicial, int diaFinal) {
		List<LotoFacil> processaLista = new ArrayList<LotoFacil>();
		for (LotoFacil lotoFacil : lista) {
			if ((lotoFacil.getDataSorteio().getDay() > diaInicial && lotoFacil.getDataSorteio().getDay() < diaFinal)
					&& lotoFacil.getDataSorteio().getMonth() == mes) {
				processaLista.add(lotoFacil);
			}

			// System.out.println("mes: " +
			// lotoFacil.getDataSorteio().getMonth());
		}

		return processaLista;
	}

	// @SuppressWarnings("deprecation")
	private Sheet criaAbasLateral(Workbook wb, List<LotoFacil> lista, String nome, int valorMerge) {
		Sheet s2 = wb.createSheet(nome);
		try {
			// Criando uma referencia para Linha
			Row r = null;

			// Referencia para Celula
			String nomeCell = null;
			Cell c1 = null;
			int count = 1;
			r = s2.createRow(0);
			c1 = r.createCell(0);
			c1.setCellValue(valorMerge);
			for (int c = 2; c < 27; c++) {
				nomeCell = "Bola" + count;
				c1 = r.createCell(c);
				c1.setCellValue(nomeCell);
				count += 1;
				s2.autoSizeColumn(count);
			}
			r = s2.createRow(1);
			count = 1;
			for (int c = 2; c < 27; c++) {
				c1 = r.createCell(c);
				c1.setCellValue(processaExiste(lista, count));
				count += 1;
				s2.autoSizeColumn(count);
			}
			s2.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
			// s2.autoSizeColumn(0);
			// s2.autoSizeColumn(1);
			/*
			 * for (int i = 0; i < 25; i++) { nomeCell = "Bola" + count; r =
			 * s2.createRow(i); c1 = r.createCell(0); c1.setCellValue(nomeCell);
			 * c2 = r.createCell(1); c2.setCellValue(processaExiste(lista,
			 * count)); count += 1; }
			 */

		} catch (Exception e) { // Mostrar Erro
			System.out.println(e.getMessage());
		}

		return s2;
	}

	@SuppressWarnings("deprecation")
	private Sheet criaAbas2(Workbook wb, List<LotoFacil> lista, String nome) {
		Sheet s2 = wb.createSheet(nome);
		try {
			// Criando uma referencia para Linha
			Row r = null;

			// Referencia para Celula
			String nomeCell = null;
			Cell c1 = null;
			Cell c2 = null;
			int count = 1;
			for (int i = 0; i < 25; i++) {
				nomeCell = "Bola" + count;
				r = s2.createRow(i);
				c1 = r.createCell(0);
				c1.setCellValue(nomeCell);
				c2 = r.createCell(1);
				c2.setCellValue(processaExiste(lista, count));
				count += 1;
			}

		} catch (Exception e) { // Mostrar Erro
			System.out.println(e.getMessage());
		}

		return s2;
	}

	private Sheet criaAbas3(Workbook wb, List<LotoFacil> lista, String nome) {
		Sheet s2 = wb.createSheet(nome);
		try {
			// Criando uma referencia para Linha
			Row r = null;

			// Referencia para Celula
			String nomeCell = null;
			Cell c = null;
			Cell c1 = null;
			Cell cd = null;
			int count = 1;

			r = s2.createRow(0);
			c.setCellValue("Soterio");
			cd.setCellValue("Data");
			for (int i = 1; i < 26; i++) {
				c1 = r.createCell(i);
				c1.setCellValue(i);
			}

			for (LotoFacil facil : lista) {
				r = s2.createRow(count);
				c.setCellValue(facil.getNumeroSorteio());
				cd.setCellValue(facil.getDataSorteio());
				// nomeCell = "Bola" + count;
				for (int i = 1; i < 26; i++) {
					s2.autoSizeColumn(i);
					c1 = r.createCell(i);
					if (facil.getBola1() == i)
						c1.setCellValue(i);
					else if (facil.getBola2() == i)
						c1.setCellValue(i);
					else if (facil.getBola3() == i)
						c1.setCellValue(i);
					else if (facil.getBola4() == i)
						c1.setCellValue(i);
					else if (facil.getBola5() == i)
						c1.setCellValue(i);
					else if (facil.getBola6() == i)
						c1.setCellValue(i);
					else if (facil.getBola7() == i)
						c1.setCellValue(i);
					else if (facil.getBola8() == i)
						c1.setCellValue(i);
					else if (facil.getBola9() == i)
						c1.setCellValue(i);
					else if (facil.getBola10() == i)
						c1.setCellValue(i);
					else if (facil.getBola11() == i)
						c1.setCellValue(i);
					else if (facil.getBola12() == i)
						c1.setCellValue(i);
					else if (facil.getBola13() == i)
						c1.setCellValue(i);
					else if (facil.getBola14() == i)
						c1.setCellValue(i);
					else if (facil.getBola15() == i)
						c1.setCellValue(i);
					else
						c1.setCellValue(0);
				}
				count += 1;
			}

		} catch (Exception e) { // Mostrar Erro
			System.out.println(e.getMessage());
		}

		return s2;
	}

	private int processaBola(int lotoFacil, int numero) {
		int valor = 0;

		return valor;
	}

	private int processaExiste(List<LotoFacil> lista, int numero) {
		int count = 0;
		int tamano = lista.size() - 1;
		for (int i = 0; i < lista.size() - 1; i++) {
			if (numero == lista.get(i).getBola1() || numero == lista.get(i).getBola2()
					|| numero == lista.get(i).getBola3() || numero == lista.get(i).getBola4()
					|| numero == lista.get(i).getBola5() || numero == lista.get(i).getBola6()
					|| numero == lista.get(i).getBola7() || numero == lista.get(i).getBola8()
					|| numero == lista.get(i).getBola9() || numero == lista.get(i).getBola10()
					|| numero == lista.get(i).getBola11() || numero == lista.get(i).getBola12()
					|| numero == lista.get(i).getBola13() || numero == lista.get(i).getBola14()
					|| numero == lista.get(i).getBola15()) {
				count += 1;
			}
		}
		return count;
	}

	private List<LotoFacil> processaExiste(List<LotoFacil> lista) {
		List<LotoFacil> processaLista = new ArrayList<LotoFacil>();
		for (LotoFacil lotoFacil : lista) {
			for (int i = 0; i < lista.size(); i++) {
				if (lotoFacil.getNumeroSorteio() != lista.get(i).getNumeroSorteio()
						&& lotoFacil.getBola1() == lista.get(i).getBola1()
						&& lotoFacil.getBola2() == lista.get(i).getBola2()
						&& lotoFacil.getBola3() == lista.get(i).getBola3()
						&& lotoFacil.getBola4() == lista.get(i).getBola4()
						&& lotoFacil.getBola5() == lista.get(i).getBola5()
						&& lotoFacil.getBola6() == lista.get(i).getBola6()
						&& lotoFacil.getBola7() == lista.get(i).getBola7()
						&& lotoFacil.getBola8() == lista.get(i).getBola8()
						&& lotoFacil.getBola9() == lista.get(i).getBola9()
						&& lotoFacil.getBola10() == lista.get(i).getBola10()
						&& lotoFacil.getBola11() == lista.get(i).getBola11()
						&& lotoFacil.getBola12() == lista.get(i).getBola12()
						&& lotoFacil.getBola13() == lista.get(i).getBola13())
					// && lotoFacil.getBola14() == lista.get(i).getBola14()
					// && lotoFacil.getBola15() == lista.get(i).getBola15())
					processaLista.add(lotoFacil);
			}
		}
		return processaLista;
	}

	public List<LotoFacil> processaLotoFacil(File file) throws IOException {
		// Carregando workbook
		try (FileInputStream caminho = new FileInputStream(file)) {

			try (Workbook wb = new HSSFWorkbook(caminho)) {

				// Criando as Abas
				Sheet s = null;
				Sheet s1 = null;
				Sheet s2 = null;
				Sheet s3 = null;
				Sheet s4 = null;
				Sheet s5 = null;
				Sheet s6 = null;
				Sheet s7 = null;

				// Selecionando a primeira aba
				// s = wb.getSheetAt(0);
				// Fazendo um loop em todas as linhas
				listaLotoFacil = new ArrayList<LotoFacil>();
				listaLotoFacil2 = new ArrayList<LotoFacil>();
				for (Row linha : wb.getSheetAt(0)) {
					if (linha == null) {
						continue;
					}
					carregarListaRow(linha);
				}
				if (!listaLotoFacil.isEmpty() || listaLotoFacil != null) {
					for (LotoFacil facil : listaLotoFacil) {
						if (facil.getDataSorteio() != null) {
							listaLotoFacil2.add(facil);
						}

					}
				}
				s = criaAbas(wb, listaLotoFacil2, "Ordenador");
				// s1 = criaAbas(wb, processaListaData(listaLotoFacil2, 0, 1,
				// 21), "Ano");

				// s2 = criaAbas(wb, processaExiste(listaLotoFacil2), "Existe");

				List<LotoFacil> processaListaVinte = new ArrayList<LotoFacil>();

				processaListaVinte = processaLista(listaLotoFacil2, listaLotoFacil2.size() - 21);

				// List<LotoFacil> processaListaPricipal = new
				// ArrayList<LotoFacil>();

				// processaListaPricipal = processaLista(listaLotoFacil2,
				// listaLotoFacil2.size() - 43);
				// s2 = criaAbasLateral(wb, processaLista1(processaListaVinte,
				// 20), "tste",20);

				s3 = criaAbas(wb, processaLista1(processaListaVinte, 21), "vinte");

				s4 = criaAbasLateral(wb, processaLista1(processaListaVinte, 5), "Aba 5", 5);

				s5 = criaAbasLateral(wb, processaLista1(processaListaVinte, 10), "Aba 10", 10);

				s6 = criaAbasLateral(wb, processaLista1(processaListaVinte, 15), "Aba 15", 15);

				s7 = criaAbasLateral(wb, processaLista1(processaListaVinte, 20), "Aba 20", 20);

				caminho.close();
				System.out.println("qts linda Abas: " + s.getSheetName());
				FileOutputStream outFile = new FileOutputStream(file);
				wb.write(outFile);
				outFile.close();
				System.out.println("Arquivo Excel editado com sucesso!");

			} catch (IllegalArgumentException e) {
				System.out.println("Não sei como criar esse tipo de novo arquivo! " + e.getMessage());
			} catch (IOException e) {
				System.out.println("Erro na edição do arquivo! " + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo Excel não encontrado! " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return listaLotoFacil2;

	}

	public void setPath(String path) {

		this.path = path;

	}

	public String getPath() {

		return path;

	}

	public List<LotoFacil> getListaLotoFacil() {
		return listaLotoFacil;
	}

	public void setListaLotoFacil(List<LotoFacil> listaLotoFacil) {
		this.listaLotoFacil = listaLotoFacil;
	}

	public List<LotoFacil> getListaLotoFacil2() {
		return listaLotoFacil2;
	}

	public void setListaLotoFacil2(List<LotoFacil> listaLotoFacil2) {
		this.listaLotoFacil2 = listaLotoFacil2;
	}

	public List<LotoFacil> getListaNumeroNaoSorte() {
		return listaNumeroNaoSorte;
	}

	public void setListaNumeroNaoSorte(List<LotoFacil> listaNumeroNaoSorte) {
		this.listaNumeroNaoSorte = listaNumeroNaoSorte;
	}

	public List<LotoFacil> getListaNumeroSaiuSorte() {
		return listaNumeroSaiuSorte;
	}

	public void setListaNumeroSaiuSorte(List<LotoFacil> listaNumeroSaiuSorte) {
		this.listaNumeroSaiuSorte = listaNumeroSaiuSorte;
	}
}
