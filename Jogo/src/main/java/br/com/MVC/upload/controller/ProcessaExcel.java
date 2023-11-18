package br.com.MVC.upload.controller;

import java.io.FileOutputStream;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import br.com.MVC.upload.util.Jogos;

@ManagedBean
public class ProcessaExcel {
	
	private List<Jogos> tipoJogo;
	
	private Jogos jogos;

	//nomeArquivo ="workbook.xls"
	public void CriandoExcel(String caminhoArquivo) throws Throwable {
		short rownum;

		// criando a new file
		FileOutputStream out = new FileOutputStream(caminhoArquivo);
		// criando a new workbook
		Workbook wb = new HSSFWorkbook();
		// criando a new Sheet ou aba
		Sheet aba = wb.createSheet();
		// criando a row ou linha object reference
		Row linhas = null;
		// criando a cell ou couluna object reference
		Cell colunas = null;
		// create 3 cell styles
		CellStyle cs = wb.createCellStyle();
		CellStyle cs2 = wb.createCellStyle();
		CellStyle cs3 = wb.createCellStyle();
		DataFormat df = wb.createDataFormat();
		// create 2 fonts objects
		Font f = wb.createFont();
		Font f2 = wb.createFont();

		// set font 1 to 12 point type
		f.setFontHeightInPoints((short) 12);
		// make it blue
		f.setColor((short) 10);
		// make it bold
		// arial is the default font
		f2.setBold(true);

		// set font 2 to 10 point type
		f2.setFontHeightInPoints((short) 10);
		// make it red
		f2.setColor((short) Font.COLOR_RED);
		// make it bold
		f2.setBold(true);

		f2.setStrikeout(true);

		// set cell stlye
		cs.setFont(f);
		// set the cell format
		cs.setDataFormat(df.getFormat("#,##0.0"));

		// set a thin border
		cs2.setBorderBottom(cs2.getBorderTop());
		// fill w fg fill color
		cs2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		// set the cell format to text see DataFormat for a full list
		cs2.setDataFormat(HSSFDataFormat.getBuiltinFormat("text"));

		// set the font
		cs2.setFont(f2);

		// set the sheet name in Unicode
		wb.setSheetName(0, "\u0422\u0435\u0441\u0442\u043E\u0432\u0430\u044F "
				+ "\u0421\u0442\u0440\u0430\u043D\u0438\u0447\u043A\u0430");
		
		// in case of plain ascii
		// wb.setSheetName(0, "HSSF Test");
		// create a sheet with 30 rows (0-29)
		for (rownum = (short) 0; rownum < 30; rownum++) {
			// create a row
			linhas = aba.createRow(rownum);
			// on every other row
			if ((rownum % 2) == 0) {
				// make the row height bigger (in twips - 1/20 of a point)
				linhas.setHeight((short) 0x249);
			}

			// r.setRowNum(( short ) rownum);
			// create 10 cells (0-9) (the += 2 becomes apparent later
			for (short cellnum = (short) 0; cellnum < 10; cellnum += 2) {
				// create a numeric cell
				colunas = linhas.createCell(cellnum);
				// do some goofy math to demonstrate decimals
				colunas.setCellValue(rownum * 10000 + cellnum + (((double) rownum / 1000) + ((double) cellnum / 10000)));

				String cellValue;

				// create a string cell (see why += 2 in the
				colunas = linhas.createCell((short) (cellnum + 1));

				// on every other row
				if ((rownum % 2) == 0) {
					// set this cell to the first cell style we defined
					colunas.setCellStyle(cs);
					// set the cell's string value to "Test"
					colunas.setCellValue("Test");
				} else {
					colunas.setCellStyle(cs2);
					// set the cell's string value to "\u0422\u0435\u0441\u0442"
					colunas.setCellValue("\u0422\u0435\u0441\u0442");
				}

				// make this column a bit wider
				aba.setColumnWidth((short) (cellnum + 1), (short) ((50 * 8) / ((double) 1 / 20)));
			}
		}

		// draw a thick black border on the row at the bottom using BLANKS
		// advance 2 rows
		rownum++;
		rownum++;

		linhas = aba.createRow(rownum);

		// define the third style to be the default
		// except with a thick black border at the bottom
		cs3.setBorderBottom(cs3.getBorderTop());

		// create 50 cells
		for (short cellnum = (short) 0; cellnum < 50; cellnum++) {
			// create a blank type cell (no value)
			colunas = linhas.createCell(cellnum);
			// set it to the thick black border style
			colunas.setCellStyle(cs3);
		}

		// end draw thick black border

		// demonstrate adding/naming and deleting a sheet
		// create a sheet, set its title then delete it
		aba = wb.createSheet();
		wb.setSheetName(1, "DeletedSheet");
		wb.removeSheetAt(1);
		// end deleted sheet

		// write the workbook to the output stream
		// close our file (don't blow out our file handles
		wb.write(out);
		out.close();

	}

	public List<Jogos> getTipoJogo() {
		return tipoJogo;
	}

	public void setTipoJogo(List<Jogos> tipoJogo) {
		tipoJogo = tipoJogo;
	}

	public Jogos getJogos() {
		return jogos;
	}

	public void setJogos(Jogos jogos) {
		this.jogos = jogos;
	}
}
