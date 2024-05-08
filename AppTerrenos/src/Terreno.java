
public class Terreno {

    public double alto;
    public double ancho;
    public double vmc;
    public double area;
    public double costoFinal;

    public Terreno(double alto, double ancho, double vmc) {
        this.alto = alto;
        this.ancho = ancho;
        this.vmc = vmc;
    }

    Terreno() { }

    public void calcularArea() {
        this.area = this.ancho * this.alto;
    }

    public void calcularCostoFinal() {
        costoFinal = area * vmc;
        if (area > 300) {
            costoFinal *= 0.8;
        } else {
            if (area >= 200) {
                costoFinal *= 0.9;
            }
        }
    }

    @Override
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", vmc=" + 
                vmc + ", area=" + area + ", costoFinal=" + costoFinal + '}';
    }
}
