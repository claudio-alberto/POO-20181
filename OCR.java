
import java.io.File;
import net.sourceforge.tess4j.Tesseract1;
import net.sourceforge.tess4j.TesseractException;

public class OCR {
	public static void main(String[] args) {
		// Necessário para o uso do Tesseract
		Tesseract1 tess = new Tesseract1();
		// Substitua <p> pelo diretório onde
		// foi descompactado o Tess4J
		String base = "C://Users//Fix Tecnologia//Downloads//Tess4J-3.4.8//Tess4J//";
		String[] path = new String[] {
				"eurotext.png",
				"eurotext.tif",
				"eurotext.bmp"
		};
		
		for (int i = 0; i < path.length; ++i) {
			System.out.println(path[i]);
			try {
				File file = new File(base + path[i]);
				// Obtem o texto a partir de uma imagem.
				String text = tess.doOCR(file);
				System.out.println(text);
			} catch (TesseractException e) {
				System.out.println("Erro!");
}
}
}
}