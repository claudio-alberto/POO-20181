
package newpackage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
public class main {

    public static void main(String[] args) throws IOException {
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens", "jpg","png");
        JFileChooser choose = new JFileChooser();
        File img;

        choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
        choose.setAcceptAllFileFilterUsed(false);
        choose.addChoosableFileFilter(filter);


        choose.showOpenDialog(null);
        BufferedImage imgfiltered;
        img = choose.getSelectedFile();
        String dir1 = ""; 
        String dir2 = ""; 
        dir1 = choose.getSelectedFile().getAbsolutePath(); // Caminho da imagem a modificar
        System.out.println(dir1);
        try {
            //carrega nova imagem
            BufferedImage imagem1 = ImageIO.read(img);

            //instancia um filtro e aplica a escala de cinza
            Filtro.escalaDeCinza(imagem1);
            imgfiltered = imagem1;
            //gera uma nova imagem a partir da imagem1
            choose.showSaveDialog(null);
            dir2 = choose.getSelectedFile().getAbsolutePath(); // Caminho da imagem após aplicação do filtro
            System.out.println(dir2);
            ImageIO.write(imagem1,"jpg",new File(dir2));

            //aqui apenas para demonstração,
            //carreguei novamente a imagen inicial para exibi-la dentro de um JFrame
            imagem1 = ImageIO.read(img);


            Exibicao.exibirImagem(imagem1, imgfiltered);
            System.out.println("Filtro aplicado com sucesso!");
        }
        catch(IOException e){
            System.out.println("Erro! Verifique se o arquivo especificado existe e tente novamente.");
        }
        catch(Exception e){
            System.out.println("Erro! " + e.getMessage());
        }
    }

}
    
}
