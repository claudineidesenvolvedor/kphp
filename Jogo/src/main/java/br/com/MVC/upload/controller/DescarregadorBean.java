package br.com.MVC.upload.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import br.com.MVC.cargamassiva.xls.Excel;
import br.com.MVC.upload.beans.LotoFacil;
import br.com.MVC.upload.beans.MegaSema;

@ManagedBean
public class DescarregadorBean implements Serializable {

	private Excel excel ;
	
	private List<MegaSema> listaSema = new ArrayList<MegaSema>();
	
	private static final long serialVersionUID = 1L;

	private StreamedContent streamedContent;

	public void descarregar(File file) throws IOException {
		InputStream inputStream = new FileInputStream(file);

		streamedContent = new DefaultStreamedContent(inputStream, Files.probeContentType(file.toPath()),
				file.getName());
	}
	
	public void processAll(File file) throws IOException {
		List<LotoFacil> listaLotoFacil = new ArrayList<LotoFacil>();
		excel = new Excel();
		listaLotoFacil = excel.processaLotoFacil(file);
		//System.out.println(listaLotoFacil.toString());
	}

	public StreamedContent getStreamedContent() {
		return streamedContent;
	}

	
}