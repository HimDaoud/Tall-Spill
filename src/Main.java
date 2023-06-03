
import javax.swing.JOptionPane;

class Tallspill
{
    public int nyttTall() {
        int randomTall = (int) (Math.random() * 201);
        return randomTall;
    }

    public void visMelding(String melding){
        JOptionPane.showMessageDialog(null, melding);
    }

    private void forLite(int tall){
        JOptionPane.showMessageDialog(null, tall+ " er for lite! Prøv igjen!");

    }

    private void forStort(int tall) {
        JOptionPane.showMessageDialog(null, tall + " er for stort! Prøv igjen!");
    }

    public void avsluttRunde(int antall, int gjetning) {
        JOptionPane.showMessageDialog(null, gjetning + " er riktig! Du gjettet riktig på " + antall  + " forsøk");
    }

    public void kjørSpill() {
        int randomTall = nyttTall();
        String innTall = JOptionPane.showInputDialog("Jeg tenker på et tall mellom 0 og 200. Prøv å gjette på tallet:");
        int tall = 0;

        int ganger = 0;
        try {
            tall = Integer.parseInt(innTall);


        }
        catch (Exception e) {
            tall = 0;
            System.out.println(e);
        }

        while(tall != randomTall) {
            ganger++;

            if(tall > randomTall) {
                forStort(tall);
                tall = Integer.parseInt(JOptionPane.showInputDialog("Jeg tenker på et tall mellom 0 og 200. Prøv å gjette på tallet:"));

            }
            if(tall < randomTall ) {
                forLite(tall);
                tall = Integer.parseInt(JOptionPane.showInputDialog("Jeg tenker på et tall mellom 0 og 200. Prøv å gjette på tallet:"));

            }
            if(tall == randomTall){
                avsluttRunde(ganger, tall);

            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Tallspill spill = new Tallspill();
        spill.kjørSpill();

    }

}
