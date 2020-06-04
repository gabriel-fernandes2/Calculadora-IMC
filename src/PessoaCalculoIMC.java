
import javax.swing.*;


public class PessoaCalculoIMC {

        public static void main(String args[]) {

            IMC a = new IMC();
            float ResultadoIMC;

            String Peso = JOptionPane.showInputDialog(null ,"Digite o Peso em (Kg): ","Peso", JOptionPane.QUESTION_MESSAGE).replace(',','.');
            float peso = Float.parseFloat(Peso);

            String Altura = JOptionPane.showInputDialog(null,"Digite a Altura em (cm): ","Altura", JOptionPane.QUESTION_MESSAGE).replace(',','.');
            float altura = Float.parseFloat(Altura);

            ResultadoIMC = a.CalculoImc(peso, altura);

            System.out.println(ResultadoIMC);

            if (ResultadoIMC < 17.00)
                JOptionPane.showMessageDialog(null, "Seu IMC é: [ " + String.format("%.2f", ResultadoIMC) + " kg/m²]"
                        + "\nSituação: Muito abaixo do peso!!!", "Resultado", 1);
            else if (ResultadoIMC >= 17.00 && ResultadoIMC <= 18.49)
                JOptionPane.showMessageDialog(null, "IMC: [ " + String.format("%.2f", ResultadoIMC) + " kg/m²]"
                        + "\nSituação: Abaixo do peso!", "Resultado", 1);
            else if (ResultadoIMC >= 18.50 && ResultadoIMC <= 24.99)
                JOptionPane.showMessageDialog(null, "IMC: [ " + String.format("%.2f", ResultadoIMC) + " kg/m²]"
                        + "\nSituação: Peso normal", "Resultado", 1);
            else if (ResultadoIMC >= 25.00 && ResultadoIMC <= 29.99)
                JOptionPane.showMessageDialog(null, "IMC: [ " + String.format("%.2f", ResultadoIMC) + " kg/m²]"
                        + "\nSituação: Acima do peso!", "Resultado", 1);
            else if (ResultadoIMC >= 30.00 && ResultadoIMC <= 34.99)
                JOptionPane.showMessageDialog(null, "IMC: [ " + String.format("%.2f", ResultadoIMC) + " kg/m²]"
                        + "\nSituação: Obesidade I!!!", "Resultado", 1);
            else if (ResultadoIMC >= 35.00 && ResultadoIMC <= 39.99)
                JOptionPane.showMessageDialog(null, "IMC: [ " + String.format("%.2f", ResultadoIMC) + " kg/m²]"
                        + "\nSituação: Obesidade II (Severa)!!!", "Resultado", 1);
            else if (ResultadoIMC >= 40.00)
                JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", ResultadoIMC) + " kg/m²]"
                        + "\nSituação: Obesidade III (Mórbida)!!!", "Resultado", 1);
            else
                JOptionPane.showMessageDialog(null, "Digite os valores corretamente", "Dados inválidos", 0);

        }

    }
