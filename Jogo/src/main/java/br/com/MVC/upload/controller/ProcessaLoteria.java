package br.com.MVC.upload.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import br.com.MVC.upload.beans.Bolas;

public class ProcessaLoteria {
	// nomeArquivo ="workbook.xls"
	public void CriandoExcel(String nomeArquivo, String NomeAba) throws Throwable {

		// Criando o arquivo fisico
		FileOutputStream out = new FileOutputStream(nomeArquivo);

		// Criando area de trabalho para o excel
		HSSFWorkbook wb = new HSSFWorkbook();

		// criando a new Sheet ou aba
		HSSFSheet aba = wb.createSheet(NomeAba);

		// criando a row ou linha object reference
		HSSFRow linhas = null;

		// create 2 cell styles formata data
		HSSFCellStyle cs = wb.createCellStyle();
		HSSFCellStyle cs2 = wb.createCellStyle();
		HSSFDataFormat df = wb.createDataFormat();

		// create 2 fontes objects
		HSSFFont f = wb.createFont();
		HSSFFont f2 = wb.createFont();

		// Set font 1 to 12 point type, blue and bold
		f.setFontHeightInPoints((short) 12);
		f.setColor(HSSFColor.RED.index);
		f.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);

		// Set font 2 to 10 point type, red and bold
		f2.setFontHeightInPoints((short) 10);
		f2.setColor(HSSFFont.COLOR_RED);
		f2.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);

		// Set cell style and formatting
		cs.setFont(f);
		cs.setDataFormat(df.getFormat("#,##0.0"));

		// Set the other cell style and formatting
		cs2.setBorderBottom(cs2.BORDER_THIN);
		cs2.setDataFormat(HSSFDataFormat.getBuiltinFormat("text"));
		cs2.setFont(f2);
		// criando a cells ou colunas object reference
		HSSFCell c_numero = null;
		HSSFCell c_data = null;
		HSSFCell c_bola1 = null;
		HSSFCell c_bola2 = null;
		HSSFCell c_bola3 = null;
		HSSFCell c_bola4 = null;
		HSSFCell c_bola5 = null;
		HSSFCell c_bola6 = null;

		for (int i = 0; i < aba.getLastRowNum(); i++) {

		}
		wb.write(out);
		out.close();

	}

	private List<Bolas> ListaBolas(String nomeArquivo, String NomeAba) throws FileNotFoundException, IOException {
		short rownum;
		Workbook wb = new HSSFWorkbook(new FileInputStream(nomeArquivo));
		List<Bolas> lista = new ArrayList<Bolas>();
		Row r = null;
		Sheet aba = wb.createSheet(NomeAba);
		// Se quiser ler a planilha toda

		for (Row rowFor : aba) {
			rowFor.getLastCellNum();
			for (Cell cellFor : rowFor) {
				Bolas bolas = new Bolas();
				switch (cellFor.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.println(cellFor.getRichStringCellValue().getString());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					if (DateUtil.isCellDateFormatted(cellFor)) {
						System.out.println(cellFor.getDateCellValue());
					} else {
						System.out.println(cellFor.getNumericCellValue());
					}
					break;
				default:
					System.out.println();
				}
			}
		}
		return lista;
	}
}