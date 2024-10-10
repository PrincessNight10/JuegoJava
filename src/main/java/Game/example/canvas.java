package Game.example;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Canvas extends Canvas implements ImageObserver {

    @Override
    public void paint(Graphics g) {
        BufferedImage background = LoadImage("background.png", true); // Asumiendo que es un PNG
        BufferedImage link = LoadImage("link.png", true); // Asumiendo que es un PNG

        if (background != null) {
            g.drawImage(background, 0, 0, this);
        }

        if (link != null) {
            g.drawImage(link, 160, 160, this);
        }
    }

    public BufferedImage LoadImage(String nombre, boolean scale2x) {
        BufferedImage imgAux = null;
        try {
            imgAux = ImageIO.read(getClass().getResource(nombre)); // Carga la imagen desde los recursos
            if (scale2x && imgAux != null) {
                // Aquí podrías agregar la lógica para escalar la imagen si scale2x es true
            }
        } catch (IOException e) {
            System.out.println("Error al cargar la imagen: " + nombre);
            e.printStackTrace();
        }
        return imgAux; // Retorna la imagen cargada
    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
}

