package entities; // Define o pacote (ou namespace) onde a classe Triangle está localizada.

public class Triangle { // Define uma classe chamada Triangle.

    public double a; // Declaração de um atributo chamado 'a' do tipo double, que representa o lado 'a' do triângulo.
    public double b; // Declaração de um atributo chamado 'b' do tipo double, que representa o lado 'b' do triângulo.
    public double c; // Declaração de um atributo chamado 'c' do tipo double, que representa o lado 'c' do triângulo.

    public double area() { // Define um método chamado 'area' que retorna um valor do tipo double.
        double p = (a + b + c) / 2.0; // Calcula o semiperímetro 'p' do triângulo.
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Calcula e retorna a área do triângulo usando a fórmula de Herão.
    }
}
