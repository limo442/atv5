/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

/**
 *
 * @author gabri
 */
public class Calculadora {

    public static void main(String[] args) {
        Operadores resultado = new Operadores();

        //adicao
        System.out.println("O resultado é: " + resultado.adicao(10, 5));

        //subtracao
        System.out.println("O resultado é: " + resultado.subtracao(10, 5));

        //multiplicacao
        System.out.println("O resultado é: " + resultado.multiplicacao(10, 5));

        //divisao
        System.out.println("O resultado é: " + resultado.divisao(10, 5));

        Operadores_atribuicao v1 = new Operadores_atribuicao();
        //adicao_atribuicao
        System.out.println("O resultado é: " + v1.adicao_atribuicao(10, 5));

        //adicao_subtracao
        System.out.println("O resultado é: " + v1.subtracao_atribuicao(10, 5));

        //adicao_multiplicacao
        System.out.println("O resultado é: " + v1.multiplicacao_atribuicao(10, 5));

        //adicao_divisao
        System.out.println("O resultado é: " + v1.divisao_atribuicao(10, 5));
    }

}
